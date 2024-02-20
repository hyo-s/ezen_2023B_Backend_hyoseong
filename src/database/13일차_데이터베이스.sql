drop database if exists test10;
create database test10;
use test10;

# 1. 회원테이블
drop table if exists member;
create table member(            			# 아이돌 그룹
	mid char(8) not null ,         			# 식별키       	최대 8자리
    mname varchar(10) not null ,   			# 그룹명      	최대 10자리
    mnumber int not null ,         			# 인원수      	정수 +-21억정도
    maddr char(2) not null ,       			# 지역      		최대 2자리
    mphone1 char(3) ,            			# 지역번호   		최대 2자리 
    mphone2 char(8) ,            			# 전화번호    		최대 8자리
    mheight smallint ,            			# 평균키       	정수 +-3만정도
	mdebut date ,               			# 데뷔일       	yyyy-mm-dd 
    primary key ( mid )            			# 제약조건 
);
# 2. 구매테이블
drop table if exists buy;
create table buy(
	bnum int auto_increment ,          				# 구매번호   	정수 자동번호 부여 
    mid char(8),                  					# 구매자      FK 
    bpname char(6) not null ,         				# 제품명      최대 6자리 
    bgname char(4) ,                				# 분류명      최대 4자리
    bprice int not null ,            				# 가격       	정수 
    bamount smallint not null ,         				# 구매수량   	정수
    primary key(bnum) ,               				# 제약조건
    foreign key ( mid ) references member(mid) 		# 제약조건
);

# ------------------------------샘플데이터------------------------------ #
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);
# ------------------------------------------------------------ #
# 1. 검색 : select 필드명1, 필드명2 from 테이블명;
select * from member;
select mid from member;

# 1. 별칭 as [ 1. 가독성, 2. 필드명 / 테이블명 연산 시 간소화 등등 ]
select mid as 회원아이디 from member;
select mid as 회원아이디, mname as 그룹명 from member;
select mid 회원아이디, mname 그룹명 from member;
select * from member as m;
select * from member m;

# 2. 조건절 where [ 리터럴 : 문자처리 ' ' ]
select * from member where mname = '블랙핑크';
select * from member where mnumber = 4;
select * from member where mnumber != 4;
select * from member where mnumber > 4;
select * from member where mnumber < 5;
select * from member where mnumber >= 5;
select * from member where mnumber <= 5;
select * from member where mheight >=165 and mheight <=170;			# 165~170 사이 평균 키 그룹
select * from member where mheight between 165 and 170;
select * from member where mheight >= 165 or mnumber > 6;			# 평균키가 165이상이거나 멤버수 6 초과이면
select * from member where maddr = '경기' or maddr = '전남' or maddr = '경남'; # 주소가 경기이거나 전남이거나 경남이면
select * from member where maddr in('경기', '전남', '경남');
select * from member where not maddr in('경기', '전남', '경남');
select * from member where not mname = '블랙핑크';

select * from member where mname like '에이%';		# '에이'로 시작하는 그룹명
select * from member where mname like '%핑크';		# '핑크'로 끝나는 그룹명
select * from member where mname like '%마%';		# '마'가 포함된 그룹명

select * from member where mname like '에이_';		# '에이'로 시작하는 3글자 그룹명
select * from member where mname like '__핑크';		# '핑크'로 끝나는 그룹명
select * from member where mname like '_마_';		# 두번째 글자가 '마'인 그룹명

select mnumber + 10, mnumber - 10, mnumber * 10, mnumber /3, mnumber div 3, mnumber mod 3 from member;
select * from member where mphone1 = '';
select * from member where mphone1 = null;
select * from member where mphone1 is null;
select * from member where mphone1 != null;
select * from member where mphone1 is not null;

select mnumber + 10, mnumber - 10 from member;

/*
==================================================================================
	연산자
		1. 산술연산자
			+ 더하기	- 빼기
				select mnumber + 10, mnumber - 10 from member;
            * 곱하기	/ 나누기
				select mnumber * 10, mnumber /3 from member;
            div 몫	mod 나머지
				select mnumber div 3, mnumber mod 3 from member;
        2. 비교연산자
			= 같다	!= 같지 않다
				select * from member where mnumber = 4;
                select * from member where mnumber != 4;
			> 초과	>= 이상
				select * from member where mnumber > 4;
                select * from member where mnumber >= 5;
			< 미만	<= 이하
				select * from member where mnumber < 5;
				select * from member where mnumber <= 5;
        3. 논리연산자
			and 이면서	or 이거나		not 부정
				select * from member where mheight >=165 and mheight <=170;
                select * from member where mheight >= 165 or mnumber > 6;
        4. 기타연산자
			필드명 between 시작값 and 끝값	: 시작값부터 끝값 까지 사이
				select * from member where mheight between 165 and 170;
			필드명 in( '값', '값', '값' ) 	: 여러 값 중 하나라도 포함하면 true
				select * from member where maddr in('경기', '전남', '경남');
            필드명 like 패턴
				1. % : 모든 문자 수 대응 앞뒤 구분
					select * from member where mname like '에이%';
				2. _ : _개수 만큼의 문자 대응 앞뒤 구분
					select * from member where mname like '__핑크';
			null
				필드명 is null
					select * from member where mphone1 is null;
                필드명 is not null
					select * from member where mphone1 is not null;

    1. as 별칭 			: 필드나 테이블의 별칭
    2. where 조건절
    3. order by 필드명	: 정렬
		오름차순 : 1, 2, 3, 4 과거 -> 최신, a, b, c, d, 가, 나, 다, 라
		order by 필드명 (asc)					: 주어진 필드 기준으로 오름차순 ( 기본값 )
        order by 필드명 desc					: 주어진 필드 기준으로 내림차순
        order by 필드명 정렬기준, 필드명 정렬기준	: 2개 이상의 정렬
			앞 정렬된 데이터에서 동일한 데이터끼리의 후 정렬
	4. limit		: 레코드 검색 제한
		select * from 테이블명 where 조건절 order by 필드명 asc / desc limit 시작번호(0), 개수
	5. distinct		: 필드 값 중복 제거
		select distinct froom 테이블명 where 조건절 order by 정렬필드 asc/desc limit 개수

	6. 집계함수
		1. sum( 필드명 ) 		: 필드 합계
        2. avg( 필드명 ) 		: 필드 평균
        3. max( 필드명 ) 		: 필드 최댓값
        4. min( 필드명 ) 		: 필드 최소값
        5. count( 필드명 ) 	: 필드 레코드 수 ( null 제외 )
		6. count ( * ) 		: 레코드 수 ( null 포함 )

    7. 특정범위 집계
		select 필드명 from 테이블명 group by 필드명;
        select mid as 구매자, sum(bamount) as 총수량 from buy group by mid;
        select mid as 구매자, sum(bamount * bprice) as 총매출액 from buy group by mid;
        select mid as 구매자, avg(bamount) as 평균구매수량 from buy group by mid;

    * 순서 *
    select
		필드명, *, 필드명 as 별칭, distinct 필드명,
	from
		테이블명, inner join
	on
		조인조건
	where
		일반조건
	group by
		그룹 필드
	having
		그룹 조건
	order by
		정렬 필드 asd / desc
	limit
		레코드 수 제한

=================================================================================
*/

select
	5+3 as 더하기, 5-3 as 빼기,
    5*3 as 곱하기, 5/3 as 나누기,
    5 div 3 as 몫, 5 mod 3 as 나머지,
    5 = 5 as 같다, 5 != 3 as 같지않다,
    5 > 3 as 크다, 5 < 3 as 작다,
    5 >= 3 as 크거나같다, 5 <= 3 as 작거나같다
    from dual; # dual 임시 테이블

select * from member order by mdebut;
select * from member order by mdebut asc;
select * from member order by mdebut desc;
select * from member order by mheight desc, mdebut asc;

# 4. limit : 검색 레코드 수 제한
	# limit 레코드 수
    # limit 시작 레코드 수 ( 0부터 시작 ), 개수
select * from member;
select * from member limit 2;
select * from member limit 0, 3;
	# 게시판 페이징 처리 : 페이지당 5개씩
select * from member limit 0, 5;
select * from member limit 5, 10;

select * from member order by mheight desc limit 3;
	# where, order by, limit 같이 사용 시 순서정해져 있음
# select * from member limit 3 where mheight >= 165;
# select * from member limit 3 order by mheight >= 165;
# 작성 순서
# select 필드명 from 테이블명 where 조건절 order by 정렬필드명 asc / desc limit 시작, 개수;

# 5. distinct : 중복제거
select maddr from member;
select distinct maddr from member;
select distinct maddr, mname from member;
select distinct maddr, mphone1 from member;

# RDBMS : 관계형 데이터베이스
	# 열과 행으로 구성된 테이블 : 검색 결과도 테이블 레코드 단위

# 6.
select bamount from buy;				# 검색
select distinct bamount from buy; 		# 중복제거 검색
select bamount + 10 from buy;			# 연산

# sum( 필드명 ) 	: 필드의 총 합계
select sum(bamount) from buy;
# avg( 필드명 ) 	: 필드의 평균
select avg(bamount) from buy;
# max( 필드명 ) 	: 필드의 최댓값
select max(bamount) from buy;
# min( 필드명 ) 	: 필드의 최소값
select min(bamount) from buy;
# count( 필드명 ) : 필드의 레코드 수  ( null 제외 )
select count(bgname) from buy;
# count( * )	: 레코드 수 ( null 포함 )
select count( * ) from buy;

# 1. 총 판매수량 합계
select sum( bamount ) from buy;
select mid from buy;

# 2. 회원아이디 별로 판매수량 합계 / 회원 마다 판매수량 합계 !!!! RDBMS : 행과 열로 이루어진 관계형 데이터베이스
# select sum( bamount ), mid from buy;

# group by
select mid from buy group by mid;		# mid 필드 그룹
select distinct mid from buy;			# mid 필드 중복 제거

# 2. 회원 아이디 별로 총 수량
select mid, sum(bamount) from buy group by mid;
select mid as 구매자, sum(bamount) as 총수량 from buy group by mid;

# 3. 회원 아이디 별로 총 매출액 [ 판매가격 * 판매수량 ]
# 3-1 전체 총 매출액
select sum(bamount * bprice) from buy;
select mid, sum(bamount * bprice) from buy group by mid;
select mid as 구매자, sum(bamount * bprice) as 총매출액 from buy group by mid;

# 4. 회원 아이디 별로 판매수량 평균
# 4-1 전체 평균
select avg(bamount) from buy;
select mid as 구매자, avg(bamount) as 평균구매수량 from buy group by mid;

# 5-1 구매자 명단
select mid as 구매자 from buy;
# 5-2 구매자 그룹
select mid as 구매자 from buy group by mid;
# 5-3 구매자 별 총 수량
select mid, sum(bamount) as 구매자 from buy group by mid;

# 6. 회원아이디 별로 총 매출액이 1,000 이상인 경우 검색
select * from buy;
select (bamount * bprice) from buy;						# 각 판매별 매출액
select sum(bamount * bprice) from buy;					# 각 판매별 총 매출액alter
select * from buy where (bamount * bprice) >= 1000; 	# 각 판매별 매출액이 1000 이상
select * from buy where bamount * bprice;
# where 뒤에는 논리 결과물 T / F
#select * from buy where sum (bamount * bprice);			# 오류

# having 그룹에 해당하는 조건 vs where 그룹에 해당하지 않는 조건
select mid as 구매자, sum(bamount * bprice) as 총매출액 from buy group by mid;
select mid as 구매자, sum(bamount * bprice) as 총매출액 from buy group by mid having sum(bamount * bprice) >= 1000;

# select mid as 구매자, sum(bamount * bprice) as 총매출액 from buy where sum(bamount * bprice) >= 1000 group by mid;

# 구매수량이 3개 이상인 회원아이디 별로 총매출액이 1000 이상인 경우 검색
select * from buy;
select * from buy where bamount >= 3;	# 수량이 3 이상인 경우
select sum(bamount * bprice) from buy where bamount >= 3; # 수량이 3 이상인 경우의 개수*가격 총 합계
select sum(bamount * bprice), mid from buy where bamount >= 3 group by mid; # 수량이 3 이상인 그룹의 개수*가격 총 합계
select sum(bamount * bprice), mid from buy where bamount >= 3 group by mid having sum(bamount * bprice) >= 1000;
# 수량이 3이상인 그룹의 개수*가격 총 합계가 1000 이상인 경우