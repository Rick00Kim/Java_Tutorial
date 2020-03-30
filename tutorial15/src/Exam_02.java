class A{
	private int x;
	private int y;
	
	public A(){//두개의 생성자 메서드 = 오버로딩
		x=0;
		y=0;
	}
	public A(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void show(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class B extends A{
	private int a;
	private int b;
	// (부모 클래스)에 디폴트 생성자 메서드가 없으면 초기화하는 메서드가 필요하다.
	public B(){
		super(); // A() 호출
		a=1;
		b=1;
	}
	public B(int a,int b){
		
	}
	
	public void disp(){
		super.show();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

public class Exam_02 {
	public static void main(String[] ar){
		A ap=new A(1,1);
		B bp=new B();
//		ap.disp();
		bp.disp();
		bp.show();
		
		
	}
}
