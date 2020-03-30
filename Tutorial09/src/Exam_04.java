class A{
	//멤버필드
	int x;
	int y;
	
	//생성자 메서드
	A(){
		x=0;
		y=0;
	}
	A(int x){
		this.x=x;
		y=0;
	}
	A(int x,int y){
		this.x=x;
		this.y=y;
	}
	//멤버 메서드
	void disp(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}

public class Exam_04 {
	public static void main(String[] ar){
		//객체 생성
		A ap=new A();
		A bp=new A(100);
		A cp=new A(100,200);
		ap.disp();
		bp.disp();
		cp.disp();
	}
}
