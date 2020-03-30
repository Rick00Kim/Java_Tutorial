drop table board;

create table board(
	num number primary key,
	writer varchar2(10),
	title varchar2(100),
	content varchar2(4000),
	userid varchar2(30),
	hit number default 0,
	writeday date default sysdate
);
drop sequence num_seq;
create sequence num_seq start with 1 increment by 1;

alter sequence num_seq increment by 1;