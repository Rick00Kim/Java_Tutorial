/*
 * �ڵ������ ��ü�� �߻�ȭ�ϴ� Ŭ���� Car�� �����Ͻÿ�.
 * <ó������>
 * 1. ����ʵ� : �ڵ�����, �ӵ�, ����
 * 2. ����޼��� : ���ӽ� ó���� ������ �����Ͻÿ�. ���ӽ� ó���� ������ ����.
 *               �ڵ����� ���¸� ����ϴ� ������ ����.
 * 3. ������ : �ΰ��� �����ڸ� ����� ����.
 *           �⺻������ : ����ڷκ��� �⺻�ʵ� ���� �޴� ��.
 *           �Ű������� 3�� ������ ������ : �Է¹޾� ����ʵ� �ʱ�ȭ.
 * 4. �ڵ����� �ְ�ӵ��� 200�� �ʰ����� �ʴ´�.
 * 5. �ѹ���������� ���� �� �����ϴ� �ӵ��� 10���� ����.
 *    ��, �ڵ����� �ӵ��� ������ �� �� ����. ������ ��� �ӵ����� 0
 * 6. ��������� ���� ��� ���ᰡ �����ϵ��� ����. �̶� �پ��� ���ᷮ�� 2.
 *    ��, ��������� ���� ��� ���ᰨ�� ����.
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
		if(fuel<2){//������� �ѱ��.
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
