package tutorial11;
class Bank{
	private String name;
	private static float rate;
	private double money;
	static{
		rate=0.03f;
	}
	public Bank(String name, float rate, double money) {
//		super();
		this.name = name;
		Bank.rate = rate;
		this.money = money;
	}
	public void disp(){
		System.out.println("Name : "+name);
		System.out.println("Rate : "+rate);
		System.out.println("Money : "+money);	
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		Bank aaa=new Bank("Aaa",0.09f,1000.0); //aaa = 초창기의 은행고객
		aaa.disp();
		System.out.println("================"); 
		Bank bbb=new Bank("bbb",0.05f,1500.0);// bbb = 중반기
		aaa.disp();
		bbb.disp();
		System.out.println("================");
		Bank ccc=new Bank("ccc",0.07f,1800.0); // ccc = 후반기
		aaa.disp();
		bbb.disp();
		ccc.disp();
		
	}
}
