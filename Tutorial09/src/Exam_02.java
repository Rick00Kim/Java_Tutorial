/*
 * 소나타, 그랜저, SM5, K5, .... => 자동차
 * - 행위 : 
 */
class Car{
	String name;
	int currentSpeed; // 현재속도
//	int distance;	  // 거리
	int fuel;		  // 기름(연료)
	
	static final int MAX=200;  //최고속도
	static final int STEP=10;  //자동차의 증감속도값
	static final int FUEL_STEP=2; // 자동차의 감소되는 연료량
//	static final int MIN=0;   //최저속도
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
	public void carAccel(){ // 악셀 페달 밟을 때
		/*
		 * 현재연료의 상태를 파악한 후 자동차의 속도를 증가시킨다. 
		 * 단 현재속도와 증가할 속도의 합이 최고속도를 추가할 수 있다.
		 */
		if(fuel<FUEL_STEP){ //연료가 부족한 상태
			return;
		}else{  //연료가 충분한 상태
			fuel-=FUEL_STEP;
			if(currentSpeed+STEP >= MAX){
				currentSpeed=MAX;
			}else
				currentSpeed+=STEP;
		}
	}
	public void carBreak(){ // 브레이크 페달 밟을 때
		
		if(currentSpeed-STEP<=0){
			currentSpeed=0;
			return;
		}else
			currentSpeed-=STEP;
	}
	void showCar(){
		System.out.println("자동차명 : "+ name);
		System.out.println("현재속도 : "+currentSpeed);
		System.out.println("남은연료 : "+fuel);
		System.out.println();
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		//객체 생성
		Car mine=new Car("Santafe",0,70);
		mine.init("Santafe",0,70);
		mine.showCar();
		mine.carAccel();
		mine.carAccel();
		mine.carAccel();
		mine.showCar();
	}
}
