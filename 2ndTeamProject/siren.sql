drop table member;

create table member(
	id varchar2(20),
	password varchar2(25) not null,
	name varchar2(20) not null,
	phone char(15),
	email varchar2(30),
	birth DATE default sysdate,
	grade varchar2(10) default 'client',
	primary key(id)
);


drop table cafemenu;

create table cafemenu(
	kinds varchar2(15),
	menu varchar2(35),
	price number,
	primary key(menu)
);
drop table ordertable;
create table ordertable(
	order_num number(10) primary key,
	id varchar2(20),
	menu varchar2(35),
	kinds varchar2(15) not  null,
	price number not null,
	option1 varchar2(30) default 'n',
	option2 varchar2(30) default 'n',
	option3 varchar2(30) default 'n',
	option4 varchar2(30) default 'n',
	option5 varchar2(30) default 'n',
	memo varchar2(70) default 'n',
	orderdate DATE default sysdate,
	FOREIGN KEY (id) REFERENCES member(id),
	FOREIGN KEY (menu) REFERENCES cafemenu(menu)
);
drop sequence order_num_seq;
create sequence order_num_seq start with 1 increment by 1;
delete from ordertable;
drop table board;

create table board(
	index_num number,
	kinds varchar2(14),
	id varchar2(25),
	title varchar2(20),
	content varchar2(3000),
	hit number default 0,
	writeday DATE default sysdate,
	primary key(index_num),
	FOREIGN KEY (id) REFERENCES member(id)
);


ALTER TABLE board AUTO_INCREMENT=1;
