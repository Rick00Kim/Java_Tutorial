drop table donate;

create table donate(
	name varchar2(20),
	do_money number,
	primary key(name)
);

insert into donate values('cuder',0);