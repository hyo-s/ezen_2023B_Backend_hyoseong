create database test9;
use test9;

drop table if exists board;
create table board(
	bno bigint auto_increment,
    bcontent text,
    bwriter varchar(20),
    bdate datetime default now(),
    constraint test9_board_bno_pk primary key(bno)
);

select * from board;