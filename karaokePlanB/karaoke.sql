drop table person;
create table person(
	id number primary key,
	name varchar2(10),
	gender varchar2(4),
	room varchar2(4)
);

drop sequence person_id_seq;
create sequence person_id_seq;
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'�豸��','��','B');
insert into person values (person_id_seq.NEXTVAL,'�����','��','B');
insert into person values (person_id_seq.NEXTVAL,'�����','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'���ǿ�','��','B');
insert into person values (person_id_seq.NEXTVAL,'����ȣ','��','B');
insert into person values (person_id_seq.NEXTVAL,'�����','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'�󺸸�','��','B');
insert into person values (person_id_seq.NEXTVAL,'���μ�','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'�����','��','B');
insert into person values (person_id_seq.NEXTVAL,'��ö��','��','B');
insert into person values (person_id_seq.NEXTVAL,'�ɽ���','��','B');
insert into person values (person_id_seq.NEXTVAL,'���ҿ�','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'�̻��','��','B');
insert into person values (person_id_seq.NEXTVAL,'�̾���','��','B');
insert into person values (person_id_seq.NEXTVAL,'���ֿ�','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'��ä��','��','B');
insert into person values (person_id_seq.NEXTVAL,'������','��','B');
insert into person values (person_id_seq.NEXTVAL,'õ���','��','B');
insert into person values (person_id_seq.NEXTVAL,'õ���','��','B');
insert into person values (person_id_seq.NEXTVAL,'�ֿ���','��','B');
insert into person values (person_id_seq.NEXTVAL,'�ϼ���','��','B');

