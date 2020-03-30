drop table person;
create table person(
	id number primary key,
	name varchar2(10),
	gender varchar2(4),
	room varchar2(4)
);

drop sequence person_id_seq;
create sequence person_id_seq;
insert into person values (person_id_seq.NEXTVAL,'강문숙','여','B');
insert into person values (person_id_seq.NEXTVAL,'강민지','여','B');
insert into person values (person_id_seq.NEXTVAL,'강현아','여','B');
insert into person values (person_id_seq.NEXTVAL,'김구현','남','B');
insert into person values (person_id_seq.NEXTVAL,'김민지','여','B');
insert into person values (person_id_seq.NEXTVAL,'김소정','여','B');
insert into person values (person_id_seq.NEXTVAL,'김은정','여','B');
insert into person values (person_id_seq.NEXTVAL,'김의연','여','B');
insert into person values (person_id_seq.NEXTVAL,'김현호','남','B');
insert into person values (person_id_seq.NEXTVAL,'김희원','여','B');
insert into person values (person_id_seq.NEXTVAL,'김희정','여','B');
insert into person values (person_id_seq.NEXTVAL,'라보름','여','B');
insert into person values (person_id_seq.NEXTVAL,'문민석','남','B');
insert into person values (person_id_seq.NEXTVAL,'박종민','남','B');
insert into person values (person_id_seq.NEXTVAL,'배소진','여','B');
insert into person values (person_id_seq.NEXTVAL,'신철우','남','B');
insert into person values (person_id_seq.NEXTVAL,'심승일','남','B');
insert into person values (person_id_seq.NEXTVAL,'연소영','여','B');
insert into person values (person_id_seq.NEXTVAL,'윤혜린','여','B');
insert into person values (person_id_seq.NEXTVAL,'이상민','남','B');
insert into person values (person_id_seq.NEXTVAL,'이아현','여','B');
insert into person values (person_id_seq.NEXTVAL,'이주영','남','B');
insert into person values (person_id_seq.NEXTVAL,'이지선','여','B');
insert into person values (person_id_seq.NEXTVAL,'임채준','남','B');
insert into person values (person_id_seq.NEXTVAL,'조병윤','남','B');
insert into person values (person_id_seq.NEXTVAL,'천경민','남','B');
insert into person values (person_id_seq.NEXTVAL,'천기범','남','B');
insert into person values (person_id_seq.NEXTVAL,'최우인','여','B');
insert into person values (person_id_seq.NEXTVAL,'하수민','남','B');

