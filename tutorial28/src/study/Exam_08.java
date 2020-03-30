package study;
/*
 * Car��� Ŭ���� ����
 * ����ʵ� : int speed-����ӵ�, String name-�ڵ����̸�
 * �����ڸ޼��� : �⺻������ �Ű����� 2�� ������ ������
 * ����޼��� : void speedup
 *            void speeddown
 *            void stop
 *            void disp
 *            
 * Car Ŭ������ Ȯ���Ͽ� Taxi Ŭ������ �����Ͻÿ�.
 * ����ʵ� : String company-ȸ���̸�, boolean-��������, int accounts-�ýÿ��
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
			System.out.println("Company : "+company+", charge : "+charge+", ���� : Yes");
		else
			System.out.println("Company : "+company+", charge : "+charge+", ���� : No");
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
