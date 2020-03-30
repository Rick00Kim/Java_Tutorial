package tutorial11;
class Outer1{
	private int x=100;
	private static int y=200;
	
	public Outer1(){
		
	}
	public void disp(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	static class Inner1{
		private int a=10;
		private static int b=20;
		
		public Inner1(){
			
		}
		public void display(){
			System.out.println("a = "+a);
			System.out.println("b = "+b);
//			System.out.println("x = "+x);  // non-static °´Ã¼
			System.out.println("y = "+y);
			
		}
	}
}
public class Exam_06 {
	public static void main(String[] ar){
		Outer1 ot1=new Outer1();
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.display();
	}
}