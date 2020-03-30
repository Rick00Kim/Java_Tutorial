/*
 * �ҳ�Ÿ, �׷���, SM5, K5, .... => �ڵ���
 * - ���� : 
 */
class Car{
	String name;
	int currentSpeed; // ����ӵ�
//	int distance;	  // �Ÿ�
	int fuel;		  // �⸧(����)
	
	static final int MAX=200;  //�ְ�ӵ�
	static final int STEP=10;  //�ڵ����� �����ӵ���
	static final int FUEL_STEP=2; // �ڵ����� ���ҵǴ� ���ᷮ
//	static final int MIN=0;   //�����ӵ�
	public Car(String irum, int speed,int gas){
		name=irum;
		currentSpeed=speed;
		fuel=gas;
	}
	public void init(String irum, int speed,int gas){
		name=irum;
		currentSpeed=speed;
		fuel=gas;
	}
	public void carAccel(){ // �Ǽ� ��� ���� ��
		/*
		 * ���翬���� ���¸� �ľ��� �� �ڵ����� �ӵ��� ������Ų��. 
		 * �� ����ӵ��� ������ �ӵ��� ���� �ְ�ӵ��� �߰��� �� �ִ�.
		 */
		if(fuel<FUEL_STEP){ //���ᰡ ������ ����
			return;
		}else{  //���ᰡ ����� ����
			fuel-=FUEL_STEP;
			if(currentSpeed+STEP >= MAX){
				currentSpeed=MAX;
			}else
				currentSpeed+=STEP;
		}
	}
	public void carBreak(){ // �극��ũ ��� ���� ��
		
		if(currentSpeed-STEP<=0){
			currentSpeed=0;
			return;
		}else
			currentSpeed-=STEP;
	}
	void showCar(){
		System.out.println("�ڵ����� : "+ name);
		System.out.println("����ӵ� : "+currentSpeed);
		System.out.println("�������� : "+fuel);
		System.out.println();
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		//��ü ����
		Car mine=new Car("Santafe",0,70);
		mine.init("Santafe",0,70);
		mine.showCar();
		mine.carAccel();
		mine.carAccel();
		mine.carAccel();
		mine.showCar();
	}
}
