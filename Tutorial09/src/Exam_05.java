/*
 * thisŰ����� this()�� ����
 * this : Ŭ�������� �ڱ� �ڽ��� ��ü�� ����Ű�� Ű����
 * this() : Ŭ�������� �ڽ��� �� �ٸ� �����ڸ� ȣ���ϴ� �޼���
 */
public class Exam_05 {
	int a,b,c,d,e,f,g,h;
	Exam_05(){	//default ������ - ����ʵ带 �ʱ�ȭ�����ش�.
		a=10;
		b=20;
		c=30;
		d=40;
		e=50;
		f=60;
		g=70;
		h=80;				
	}
	Exam_05(int a){
		this();		//super() - ���(�θ�Ŭ������ ������ ȣ��)
		this.a=a;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		f=60;
//		g=70;
//		h=80;
	}
	Exam_05(int a,int b){
		this(a);
//		this.a=a;
		this.b=b;
//		c=30;
//		d=40;
//		e=50;
//		f=60;
//		g=70;
//		h=80;
	}
	public void disp(){
		System.out.println("a = "+a);
		System.out.println("b = "+b);
//		System.out.println("c = "+c);
//		System.out.println("d = "+d);
//		System.out.println("e = "+e);
//		System.out.println("f = "+f);
//		System.out.println("g = "+g);
//		System.out.println("h = "+h);
	}
}
