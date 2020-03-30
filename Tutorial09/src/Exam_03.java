/*
 * 은행계좌를 관리할 목적으로 Account 클래스를 구현하시오.
 */
class Account{
	//멤버필드
	int id;				//계좌번호
	String name;		//고객이름
	int bill;			//예금잔액
	//생성자 메서드
	
	//멤버 메서드
	public void init(int no, String irum,int cash){
		id=no;
		name=irum;
		bill=cash;
	}
	public void input(int cash){
		bill+=cash;
	}
	public int output(int cash){
		if(bill<cash){
			return 0;
		}else{
			bill-=cash;
			return cash;
		}
	}
	public void showAccount(){
		System.out.println("계좌번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("예금잔액 : "+bill);
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		Account acc1=new Account();
		acc1.init(1, "홍길동", 10000);
		acc1.showAccount();
		System.out.println();
		acc1.input(500);
		if(acc1.output(100000)==0){
			System.out.println("예금이 부족합니다.");
		}
		acc1.showAccount();
	}
}
