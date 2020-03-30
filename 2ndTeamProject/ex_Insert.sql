delete from member;
insert into member values('dreamx119','1111','管理者','010-8546-9119','dreamx119@gmail.com','1991-08-19','admin');
insert into member values('a01','1111','aaaa','010-1111-1111','a01@naver.com','1991-05-11','client');
insert into member values('a02','2222','bbbb','010-2222-2222','a02@daum.net','1991-05-11','client');
insert into member values('a03','3333','cccc','010-3333-3333','a03@gmail.com','1991-05-11','client');


delete from cafemenu;
insert into cafemenu values('Coffee','Americano',4100);
insert into cafemenu values('Coffee','Cafe Latte',4600);
insert into cafemenu values('Coffee','Cafe Mocha',4600);
insert into cafemenu values('Coffee','Cappuccino',4600);
insert into cafemenu values('Coffee','Caramel Latte',5000);
insert into cafemenu values('Coffee','Dolce Latte',5300);
insert into cafemenu values('Coffee','Esspresso Corn',4700);
insert into cafemenu values('Coffee','Esspresso',3000);
insert into cafemenu values('Coffee','GreenTea Latte',4500);
insert into cafemenu values('Coffee','White Chocolate',4800);
insert into cafemenu values('Juice','Green Tea Banana',4500);
insert into cafemenu values('Juice','Mango Banana',4500);
insert into cafemenu values('Juice','Mango',4500);
insert into cafemenu values('Juice','StrawBerry Yogurt',5200);
insert into cafemenu values('Sandwich','Cheese Sandwich',5300);
insert into cafemenu values('Sandwich','Chicken Sandwich',5300);
insert into cafemenu values('Sandwich','Cuder Salad',3900);
insert into cafemenu values('Cake','Chocolate Cake',4000);
insert into cafemenu values('Cake','Tiramisu',4000);
insert into cafemenu values('Affogato','Chocolate Chip Affogato',4600);
insert into cafemenu values('Affogato','Nuts Vanilla Affogato',4600);
insert into cafemenu values('Affogato','Vanilla Affogato',4600);



delete from board;
insert into board(index_num,kinds,id,title,content) values(1,'news','dreamx119','Hello','World!!!');
insert into board(index_num,kinds,id,title,content) values(2,'news','dreamx119','New Event','Sale Event!!!');
insert into board(index_num,kinds,id,title,content) values(3,'FAQ','a01','Excuse Me','Its Good!!');
