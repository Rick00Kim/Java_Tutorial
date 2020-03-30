/*
 * 자동차라는 객체를 추상화하는 클래스 Car를 구현하시오.
 * <처리조건>
 * 1. 멤버필드 : 자동차명, 속도, 연료
 * 2. 멤버메서드 : 가속시 처리할 내용을 구현하시오. 감속시 처리할 내용을 구현.
 *               자동차의 상태를 출력하는 내용을 구현.
 * 3. 생성자 : 두개의 생성자를 만들어 구현.
 *           기본생성자 : 사용자로부터 기본필드 값을 받는 것.
 *           매개변수를 3개 가지는 생성자 : 입력받아 멤버필드 초기화.
 * 4. 자동차의 최고속도는 200을 초과하지 않는다.
 * 5. 한번가속페달을 밟을 때 증가하는 속도는 10으로 구현.
 *    단, 자동차의 속도는 음수가 될 수 없다. 음수일 경우 속도값은 0
 * 6. 가속페달을 밟을 경우 연료가 감소하도록 구현. 이때 줄어드는 연료량은 2.
 *    단, 감속페달을 밟을 경우 연료감소 없음.
 */
import java.io.*;

interface Car_limit{
	public static final int MAX_SPEED=200;
	public static final int MOV_SPEED=10;
	public static final int MOV_FUEL=2;
}
class Car implements Car_limit{
	public String name;
	public int spd=0;
	public int fuel=0;
	public static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	public Car() throws IOException{
		System.out.print("Insert CarName : ");
		name=in.readLine();
		spd=0;
		System.out.print("How much fuel : ");
		fuel=Integer.parseInt(in.readLine());
	}
	public Car(String name,int spd,int fuel){
		this.name=name;
		this.spd=spd;
		this.fuel=fuel;
	}
	public void up_spd(){
		if(fuel<2){//제어권을 넘긴다.
			System.out.println("No gas");
			return;
		}
		fuel-=MOV_FUEL;
		if(spd+MOV_SPEED>MAX_SPEED){
			spd=MAX_SPEED;
			return;
		}
		spd+=MOV_SPEED;
//		if(spd>=MAX_SPEED){
//		spd=MAX_SPEED;
//	}else{
//		spd+=MOV_SPEED;
//		fuel-=MOV_FUEL;
//	}
	}
	public void down_spd(){
		if(spd-10<0){
			spd=0;
			return;
		}
		spd-=MOV_SPEED;
//		if(spd<=0){
//			spd=0;
//		}else{
//			spd-=MOV_SPEED;
//		}
	}
	public void view_Status(){
		System.out.println(name+" speed - "+spd+", fuel - "+fuel);
	}
	public String toString(){
		return "Car[name : "+name+", speed : "+spd+", fuel : "+fuel;
	}
}
