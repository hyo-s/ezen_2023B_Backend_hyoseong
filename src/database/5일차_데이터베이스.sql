/*
	SQL : 데이터베이스에서 사용하는 데이터 처리 언어
    1. DDL( Data Definition Language ) 정의어	 [ RollBack 불가능 ]
		create : 데이터베이스 / 테이블 / 뷰 생성
			1. 데이터베이스 생성 
				create database	데이터베이스명;
			2. 테이블 생성
				create table 테이블명(필드명 타입 제약조건, 필드명 타입 제약조건);
        drop : 데이터베이스 / 테이블 / 뷰 삭제
			1. 데이터베이스 생성
				drop database if exists 데이터베이스명;
			2. 테이블 생성
				drop table if exists 테이블명;
		use : 사용할 데이터베이스 선택
			use 데이터베이스명;
		truncate : 데이터 삭제
	2. DML( Data Manipuldation Language ) 조작어 *	[ RollBack 불가능 ]
		[C] insert : 레코드 삽입
			모든 레코드 삽입
				insert into 테이블명 values ( 값1, 값2 ); - 필드의 순서에 맞게 대입
            특정 레코드 삽입
				insert into 테이블명 ( 필드1, 필드2 ) values ( 값1, 값2 );
        [R] select	: 레코드 검색
			모든 필드(*)를 표시한 레코드 검색
				selcet * from 테이블명 ( * 와일드카드 / 전체라는 뜻 )
            특정 필드를 표시한 레코드 검색
				select 필드명 from 테이블명
        [U] update	: 레코드 필드의 값 수정
			모든 레코드의 필드 값 수정
				update 테이블명 set 수정할필드명 = 수정할값, 수정할필드명 = 수정할값;
            특정(조건에 충족하는) 레코드 필드값 수정
				update 테이블명 set 수정할필드명 = 새로운값, 수정할필드명 = 새로운 값 where 조건식;
        [D] delete	: 레코드 삭제
			모든 레코드 삭제
				delete from 테이블명;
            특정(조건에 충족하는) 레코드 삭제
				delete from 테이블명 where 조건식;
	3. 제약조건
		not null : 필드에 null을 넣지 않겠다
        unique : 중복을 없앤다
        default 값 : 필드에 값을 입력하지 않을때 기본값
        primary key ( pk필드명 )
        foreign key ( fk필드명 ) references 참조할테이블명 ( 참조할pk필드명 )
        
	4. where 조건절
*/

# -- 초기화

# 1. 데이터베이스 생성
drop database if exists test5;
create database test5;
use test5; # 1. DB서버 내 여러개의 데이터베이스가 존재하기 때문에 DB를 선택해야 한다.

# 2. 테이블 생성
drop table if exists table1;
create table table1( 
	데이터필드1 int,
    데이터필드2 varchar(30)
);

# 3. 조작어
# [C] insert
	# 1. 모든 필드의 값 대입시 필드명 생략
insert into table1 values( 1, '유재석' );
	# 2. 특정 필드의 값 대입시 특정 필드명 작성
insert into table1( 데이터필드1 ) values( 5 );	# 생략된 필드명의 값은 null

# [R] select
	# 1. 모든 필드를 표시하는 레코드 검색
select * from table1;
	# 2. 특정 필드를 표시하는 레코드 검색
select 데이터필드2 from table1;

# [U] update
	# 1. 모든 레코드의 필드 값을 수정
update table1 set 데이터필드2 = '강호동';
	# 2. 특정(조건에 충족하는) 레코드의 필드값을 수정
update table1 set 데이터필드2 = "강호동" where 데이터필드1 = 5; # (조건식 : 만약에 데이터필드1 값이 5이면)

# [D] delete
	# 1. 모든 레코드 삭제 / 추후에 취소 가능 / 특정(where)
delete from table1;
delete from table1 where 데이터필드1 = 5; # 조건식 : 만약에 데이터필드1 값이 5인 레코드만 삭제 )
	# vs
    # 2. 특정(조건에 충족하는) 레코드 삭제 / 추후에 취소 불가능
truncate table table1;
    
# ============================================================= #
use test5;
drop table if exists members;
create table members(
	name varchar(30)
);

-- 
# 1.
insert into members values('유재석');

# 2.
select * from members;

# 3. 만약에 이름이 강호동이면 신동엽으로 변경
update members set name = '신동엽' where name = '강호동';

# 4.

# ----------------------------------------------------------------- #

# -- 캐릭터 DB -- #
drop database if exists 캐릭터;
create database 캐릭터;
use 캐릭터;

# -- 포켓몬 TABLE -- #
drop table if exists 포켓몬;
create table 포켓몬(
	name varchar(10)
);
insert into 포켓몬 values('피카츄');
update 포켓몬 set name = '라이츄' where name = '피카츄';
insert into 포켓몬 values('파이리');
delete from 포켓몬 where name = '라이츄';
select * from 포켓몬;

# -- 디지몬 TABLE -- #
drop table if exists 디지몬;
create table 디지몬(
	name varchar(10)
);
insert into 디지몬 values('아구몬');
insert into 디지몬 values('파피몬');
delete from 디지몬 where name = '파피몬';
select * from 디지몬;

# ----------------------------------------------------------------- #
drop database if exists test5_1;
create database test5_1;
use test5_1;

drop table if exists member;
create table member(
	mno int,
    mid varchar(30) not null,
    mpw varchar(30) default '1234',
    primary key(mno)
);
insert into member values (1, 'asd', 'kkk');
insert into member (mno,mid) values (2, 'asd');
insert into member values (3, 'asd', 'kkk');
insert into member values (7, 'asd', 'kkk');

select * from member;

update member set mid = 'ezenid' where mno = 3;

delete from member where mno=7;

select * from member;
# ----------------------------------------------------------------- #