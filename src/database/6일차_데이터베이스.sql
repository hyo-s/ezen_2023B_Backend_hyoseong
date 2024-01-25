# DAY18 회원가입 게시판
# 1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

# 2. (회원가입) 테이블
drop table if exists member;
create table member(
	mno int auto_increment,					-- 번호 MYSQL 제공하는 제약조건 - 자동으로 번호를 부여(auto_increment) PK만 가능
    mid varchar(30) not null unique,		-- 아이디
    mpw varchar(30) not null,				-- 비밀번호
    mphone char(13) not null unique,		-- 전화번호 010-0000-0000 형식
    mdate datetime default now(),			-- 가입날짜
    primary key(mno)						-- 번호 기본키(PK) - not null unique 자동으로 들어감 생략도 가능
);

# 3. 확인용
select * from member;

# ============================ [C](insert) 1. 회원가입 테스트  ============================ #
	# insert into member(필드명, 필드명, 필드명)values( 값1, 값2, 값3 );
insert into member(mid,mpw,mphone)values('qweqweqw','qweqweqw','010-0000-0000');
	# JAVA
# insert into member(mid,mpw,mphone)values( ?, ?, ? );

# ============================ [R](select) 2. 아이디 중복체크/검사/비교  ============================ #
	# select * from member;
select * from member;
	# select mid from member;
select mid from member;
	# select mid from member where mid = '찾을아이디';
select mid from member where mid = 'aaa';

# ============================ [R](select) 3. 로그인 아이디와 비밀번호 비교 and( JAVA && ) or( JAVA || )  ============================ #
	# select * from member where mid = '입력받은값' and mpw = '입력받은값' ;
# select * from member where mid = ? and mpw = ? ;
select * from member where mid = 'aaa' and mpw = 'aaa' ;

# ============================ [R](select) 4. 회원번호 찾기 아이디에 해당하는 회원번호 출력 ============================ #
	# select mno from member where mid = '입력받은값';
# select mno from member where mid = ?;
select mno from member where mid = 'aaa';