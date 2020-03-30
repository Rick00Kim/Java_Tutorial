package mms.car.model;

public class Car {
	private String kinds;
	private String carNum;
	private int years;
	private int charge;
	private int price;	//�������
	
	public Car(String kinds,String carNum,int years){
		this.kinds=kinds;
		this.carNum=carNum;
		this.years=years;
		setCharge(kinds);
		this.price=0;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(String kinds) {
		if(kinds.equals("��ũ����"))
			charge = 550000;
		else if(kinds.equals("����Ʈ��"))
			charge = 400000;
		else if(kinds.equals("��ũ�θ�"))
			charge = 740000;
	}
	public String toString(){
		return kinds+" - "+carNum+", ���� : "+years+", ���� �ϴ� - "+charge;
	}
}