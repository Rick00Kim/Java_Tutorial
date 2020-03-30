/*
 * this키워드와 this()의 설명
 * this : 클래스내에 자기 자신의 객체를 가르키는 키워드
 * this() : 클래스내에 자신의 또 다른 생성자를 호출하는 메서드
 */
public class Exam_05 {
	int a,b,c,d,e,f,g,h;
	Exam_05(){	//default 생성자 - 멤버필드를 초기화시켜준다.
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
		this();		//super() - 상속(부모클래스의 생성자 호출)
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
