class A{
	private int x;
	private int y;
	
	public A(){//�ΰ��� ������ �޼��� = �����ε�
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
	// (�θ� Ŭ����)�� ����Ʈ ������ �޼��尡 ������ �ʱ�ȭ�ϴ� �޼��尡 �ʿ��ϴ�.
	public B(){
		super(); // A() ȣ��
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
