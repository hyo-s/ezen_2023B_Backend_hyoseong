use java;
drop table if exists category;
create table category(
    bcno int not null unique,                        	-- 게시물 카테고리 번호
	bcategory varchar(10) not null unique,           	-- 게시물 카테고리
    primary key(bcno)                               	-- 식별키(pk) 게시물 카테고리 번호
);
select * from category;

drop table if exists board;
create table board(
    bno int not null unique,                        	-- 게시물 번호
    btitle varchar(100) not null,                   	-- 게시물 제목
    bcontent longtext not null,                     	-- 게시물 내용
    bdate datetime default now(),                   	-- 게시물 작성일
    bview int not null,                             	-- 게시물 조회수
    mno_fk int not null unique,                     	-- 참조키(fk) 회원 번호
    bcno_fk int not null unique,                    	-- 참조키(fk) 게시물 카테고리 번호
    primary key(bno),                               	-- 식별키(pk) 게시물 번호
    foreign key (mno_fk) references member (mno),   	-- 참조키(fk) 회원 번호
    foreign key (bcno_fk) references category (bcno)  	-- 참조키(fk) 게시물 카테고리
);
select * from board;

drop table if exists comment;
create table comment(
    cno int not null unique,                        -- 댓글 번호
    ccontent longtext not null,                     -- 댓글 내용
    bno_fk int not null unique,						-- 참조키(fk) 게시물 번호
    mno_fk int not null unique,						-- 참조키(fk) 회원 번호
    primary key(cno),                               -- 식별키(pk) 댓글 번호
    foreign key (bno_fk) references board (bno),    -- 참조키(fk) 게시물 번호
    foreign key (mno_fk) references member (mno)	-- 참조키(fk) 회원 번호
);
select * from comment;

insert into category values(1, '사회');
insert into category values(2, '경제');
insert into category values(3, '스포츠');
select * from category;