/*
	DB : 데이터베이스 / 기계어로 구성된 데이터들의 집합
		DBMS ( RDBMS -> MYSQL, ORACLE )		<--- MYSQL WORKBENCH : DB연동 UI소프트웨어
			SQL 명령어
		개발자(DBA) : 영어(SQL)
	# 제약조건
    1. not null
    2. unique
    3. default 값 / 함수
    4.(mysql *pk일 경우) auto_increment
	5. priboardmary key ( pk필드명 )
	6. foreign key ( fk필드명 ) references 참조할테이블 ( 참조할pk필드명 )
    
	# 1. 제약조건에 이름 달기 ( 삭제, 수정 필요 )
		constraint 제약조건명 primary key(pk필드명)
		constraint 제약조건명 foreign key ( fk필드명 ) references 참조할테이블 ( 참조할pk필드명 )
	# 2. 제약조건에 무결성 옵션 설정
		* 무결성 : 데이터의 정확성, 일관성, 유효성을 유지
        constraint 제약조건명 foreign key ( fk필드명 ) references 참조할테이블 ( 참조할pk필드명 ) ( 무결성 옵션 )
			[ ON DELETE / UPDATE ] [ RESTRICT / CASCADE / NOCATION / SET NULL ]
				1. on delete restrict	 	: PK데이터를 삭제할때 PK데이터가 참조하는 FK데이터가 있으면 삭제 취소	[ 기본값 / no action ]
                2. on delete cascade		: PK데이터를 삭제할때 PK데이터가 참조하는 FK데이터가 있으면 같이 삭제
                3. on delete set null		: PK데이터를 삭제할때 PK데이터가 참조하는 FK데이터가 있으면 PK는 삭제 FK는 NULL로 설정
                4. on update restrict		: PK데이터를 수정할때 PK데이터가 참조하는 FK데이터가 있으면 수정 취소 [ 기본값 / no action ]
				5. on update cascade		: PK데이터를 수정할때 PK데이터가 참조하는 FK데이터가 있으면 같이 수정
				6. on update set null		: PK데이터를 수정할때 PK데이터가 참조하는 FK데이터가 있으면 PK는 수정 FK는 NULL로 설정
                
	# 3. 조인 = 테이블 합치기
		1. select * from 테이블명A, 테이블명B where 테이블명A.PK필드명 = 테이블B.FK필드명;
        2. select * from 테이블명A natural join 테이블명B;
        3. select * from 테이블명A join 테이블명B on 테이블명A.PK필드명 = 테이블명B.FK필드명;
        4. select * from 테이블명A join 테이블명B using( 필드명 );
        5. select * from 테이블명A inner join 테이블명B on 테이블명A.PK필드명 = 테이블명B.FK필드명;
        6. select * from 테이블명A right outer join 테이블명B on 테이블명A.PK필드명 = 테이블명B.FK필드명;
        7. select * from 테이블명A left outer join 테이블명B on 테이블명A.PK필드명 = 테이블명B.FK필드명;
	
			# PK - FK	
            집합
			1. 교집합 = PK와 FK 일치 했을때
            2. 합집합 = PK와 FK 합치기
            3. 차집합 = PK와 FK 제외/뺀 했을때.
        
	
*/
drop database if exists test7;
create database test7;
use test7;

# 1. 회원테이블
drop table if exists member;
create table member(
	mno int auto_increment,
    mid varchar(30),
    mpw varchar(30),
    constraint member_mno_pk primary key(mno)
);

# 2. 게시판 테이블
drop table if exists board;
create table board(
	bno int auto_increment,
    btitle text,
    bcontent text,
    mno int,
    primary key( bno ),
    constraint board_mno_fk foreign key(mno) references member(mno)
    # on delete restrict 	# PK-FK 데이터가 서로 참조하고 있는 데이터가 존재하면 취소/실행불가 [ 기본값 ]
    # on delete cascade		# PK-FK 데이터가 서로 참조하고 있는 데이터가 존재하면 같이 삭제
    on delete set null 		# PK-FK 데이터가 서로 참조하고 있는 데이터가 존재하면 PK는 삭제 FK는 NULL로 설정
    # on update restrict
    # on update cascade
    on update set null
);

# 3. 샘플
	# 1. 1명 회원가입
insert into member( mid, mpw ) values( 'ezen01','1234' );
insert into member( mid, mpw ) values( 'ezen02','5678' );
	# 2. 1번 회원이 게시물 작성
insert into board( btitle, bcontent, mno ) values ( '자바', '안녕하세요', 1 );
	# 2-1. 2번 회원이 게시물 작성
insert into board( btitle, bcontent, mno ) values ( '파이썬', '안녕히계세요', 2);
	# 3. 확인
select * from member;
select * from board;
	# 3. 1번 회원탈퇴
# delete from member where mno = 1;
# delete from member where mno = 2;
	# 4. 1번 회원 회원번호를 수정
update member set mno = 3 where mno = 1;
	# board 테이블의 mno는 null이 됨
    # 4. 3번 회원 회원번호 아이디를 수정
update member set mid = 'ezen03' where mno = 3;

# -------------------- 관계 검색 -------------------- #
insert into member( mid, mpw ) values( 'ezen01','1234' );
insert into member( mid, mpw ) values( 'ezen02','4567' );
insert into member( mid, mpw ) values( 'ezen03','6789' );

# insert into board( btitle, bcontent, mno ) values ( '자바', '안녕', 2 );
# insert into board( btitle, bcontent, mno ) values ( '파이썬', '안녕', 1);

# ================ 1. 다중 테이블의 데이터 검색 ================ #
# 1. 1번 게시물의 작성자 아이디를 알고 싶다.
	# 1. 1번 게시물의 작성자(mno) 찾기.
select mno from board where bno = 1;	-- 2
	# 2. 찾은 mno를 가지고 회원의 아이디(mid) 찾기.
select mid from member where mno = 2;	-- ezen02

# ================ 2. 관계[PK-FK]가 있는 테이블 간의 조인 ================ #
# 1. where 절 이용한 합치기
select * from member;							-- 회원 테이블 모두 검색
select * from board;							-- 게시물 테이블 모든 레코드 검색
select * from member, board;					-- 두개 이상의 테이블을 ,(쉼표) 구분
# select * from member, board where mno = mno;	-- PK필드와 FK필드가 일치했을때 (mno 식별 불가)
	# 다중 테이블 select 할때 필드명이 중복일 경우
    # 1. 필드명 앞에 테이블을 붙인다.
select * from member, board where member.mno = board.mno;
	# 2. 테이블명에 별칭을 이용 ( 검색시에만 사용되는 이름 )
select * from member m, board b where m.mno = b.mno;

# 2. JOIN 절 이용
# [ 교집합 -> 두개 이상의 테이블의 공통 데이터 찾기 ] 
	# 1. A natural join B
select * from member natural join board;
	# 2. A join B on PK필드 = FK필드
select * from member join board on member.mno = board.mno;
	# 3. A join B using( 관계필드명 )
select * from member join board using(mno);
	# 4. A inner join B on PK필드 = FK필드
select * from member inner join board on member.mno = board.mno;
	# 5. A right outer join B on PK필드 = FK필드
select * from member right outer join board on member.mno = board.mno;
select * from board right outer join member on member.mno = board.mno;
	# 6. A left outer join B on PK필드 = FK필드
select * from member left outer join board on member.mno = board.mno;