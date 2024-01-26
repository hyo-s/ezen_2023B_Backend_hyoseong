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


# ============================================================================================ #
                                        게시판
                카테고리1               카테고리2                   카테고리3
            게시물1                게시물1                    게시물1
             댓글1 댓글2 댓글3        댓글1 댓글2 댓글3          댓글1 댓글2 댓글3
            게시물2                게시물2                    게시물2
             댓글1 댓글2 댓글3        댓글1 댓글2 댓글3          댓글1 댓글2 댓글3

drop table if exists category;
create table category(
    bcno int not null unique,                        -- 게시물 카테고리 번호
	bcategory varchar(10) not null unique,           -- 게시물 카테고리
    primary key(bcno)                               -- 식별키(pk) 게시물 카테고리 번호
);

drop table if exists board;
create table board(
    bno int not null unique,                        -- 게시물 번호
    btitle varchar(100) not null,                   -- 게시물 제목
    bcontent longtext not null,                     -- 게시물 내용
    bdate datetime default now(),                   -- 게시물 작성일
    bview int not null,                             -- 게시물 조회수

    mno_fk int not null unique,                     -- 참조키(fk) 회원 번호
    bcno_fk int not null unique,                    -- 참조키(fk) 게시물 카테고리 번호

    primary key(bno),                               -- 식별키(pk) 게시물 번호
    foreign key (mno_fk) references member (mno),   -- 참조키(fk) 회원 번호
    foreign key (bcno_fk) references member (bcno)    -- 참조키(fk) 게시물 카테고리
);

drop table if exists comment;
create table comment(
    cno int not null unique,                        -- 댓글 번호
    ccontent longtext not null,                     -- 댓글 내용

    primary key(cno),                               -- 식별키(pk) 댓글 번호
    foreign key (bno_fk) references borad (bno)     -- 참조키(fk) 게시물 번호

);
# ============================================================================================ #
    VIEW
         메뉴선택   1. 글쓰기 2. 글수정 3. 글삭제
            카테고리선택  1. 사회 2. 경제 3. 스포츠
                CATEGORY DB에서 해당 카테고리를 불러온다.
            1이면 카테고리 선택 메뉴를 보여준다
                1이면 사회 카테고리의 글쓰기 함수를 실행한다.
                    게시물 제목을 입력받는다.
                    게시물 내용을 입력받는다.
                    1.완료 2.취소
                        게시물 작성자를 불러와야한다 ???????????????
                        1이면 게시물 번호, 게시물 제목, 게시물 타이틀, 게시물 작성자, 게시물 작성날짜, 조회수 기본0?을 DB에 저장한다.

                2이면 경제 카테고리의 글쓰기 함수를 실행한다.
                3이면 스포츠 카테고리의 글쓰기 함수를 실행한다.
            2이면 카테고리 선택 메뉴를 불러온다
            3이면 카테고리 선택 메뉴를 불러온다


                        1이면 글쓰기 함수 실행
                        2이면 글수정 함수 실행
                        3이면 글삭제 함수 실행
                 - 카테고리를 불러올 때 MYSQL의 CATEGORY DB에서 불러온다.
                    - 사용자한테 게시물 제목과 게시물 내용을 입력받는다.
                        1. 완료 2. 취소
                            - 완료를 누르면
                                게시물 작성자를 불러와야한다 ???????????????

    CONTROLLER
        1일때 글쓰기 메소드
            글을 썼다 or 안썼다 결과값 0, 1
            안에서 해야할 기능??

        2일때 글수정 메소드
        3일때 글삭제 메소드

    DAO
        게시물 번호, 게시물 제목, 게시물 타이틀, 게시물 작성자, 게시물 작성날짜, 조회수 기본0?을 DB에 저장한다.
