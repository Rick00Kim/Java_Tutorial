package study;
/*
 * Car라는 클래스 구현
 * 멤버필드 : int speed-현재속도, String name-자동차이름
 * 생성자메서드 : 기본생성자 매개변수 2개 가지는 생성자
 * 멤버메서드 : void speedup
 *            void speeddown
 *            void stop
 *            void disp
 *            
 * Car 클래스를 확정하여 Taxi 클래스를 구현하시오.
 * 멤버필드 : String company-회사이름, boolean-할증여부, int accounts-택시요금
 *  
 */
class Car{
	protected int spd=0;
	protected String name;
	
	public void spdUp(){
		spd++;
	}
	public void spdDown(){
		spd--;
	}
	public void stop(){
		spd=0;
	}
	public void disp(){
		System.out.println("Car : "+name);
		System.out.println("Speed : "+spd);
	}
}
class Taxi extends Car{
	private int charge;
	private boolean fare;
	private String company;
	
	public Taxi(){
		
	}
	public Taxi(int spd,String company,String name,boolean fare){
		super.name=name;
		this.company=company;
		this.spd=spd;
		setFare(fare);
	}
	public void accounts(){
		if(fare==true)
			charge=super.spd*12;
		else
			charge=super.spd*10;
	}
	public void setFare(boolean fare){
		this.fare=fare;
	}
	public void disp(){
		super.disp();
		if(fare)
			System.out.println("Company : "+company+", charge : "+charge+", 할증 : Yes");
		else
			System.out.println("Company : "+company+", charge : "+charge+", 할증 : No");
	}
	
}
public class Exam_08{	
	public static void main(String[] ar){
		Taxi tx=new Taxi(50,"JSL Taxi","Santafe",true);
		tx.accounts();
		tx.disp();
		
		tx.spdUp();
		tx.accounts();
		tx.disp();
		
		tx.spdUp();
		tx.accounts();
		tx.disp();
		
	}
}
