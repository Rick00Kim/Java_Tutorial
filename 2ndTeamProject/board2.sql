drop table board2;

create table board2(
	num2 number primary key,
	writer varchar2(10),
	title varchar2(100),
	content varchar2(4000),
	userid varchar2(30),
	hit number default 0,
	writeday date default sysdate,
	email varchar2(20)
);
drop sequence num2_seq;
create sequence num2_seq start with 1 increment by 1;

alter sequence num2_seq increment by 1;