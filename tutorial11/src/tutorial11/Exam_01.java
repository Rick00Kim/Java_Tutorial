package tutorial11;
/*
 * 지정예약어 : this, static, final 지정
 * 1. 자기 자신의 객체를 참조하는 this
 * 		-this	-> super
 * 		-this()	-> super()
 * 		
 * 2. 공유필드를 위한 static
 * 
 * 3. 상수 필드와 변수를 위한 final
 * 
 * Class Type : 클래스의 유형
 * 1. Entity Class = Model = DTO = VO = Java Bean
 *    -단순히 데이터만을 관리할 목적으로 구현되는 클래스
 *    
 * 2. Control Class = Handler Class = Action class
 *    - 실제 처리를 담당하는 클래스, main()메서드를 담고 있는 클래스 
 */
class A{
	//멤버 필드 -> 접근제한자[지정예약어] 자료형 변수명; or 변수명=초기값
	private int x;
	private int y;
	//생성자 메서드	-> 객체를 생성할 때, 멤버필드를 초기화, 오버로딩
	public A(){
		x=0;
		y=0;
	}
	public A(int x){
		this.x=x;
		y=0;
	}
	public A(int x,int y){
		this.x=x;
		this.y=y;
	}
	//멤버 메서드
	public void disp(){
		System.out.println("x= "+this.x);
		System.out.println("y= "+this.y);
	}
	
}
public class Exam_01 {
	public static void main(String[] ar){
		//객체 생성  객체 배열
		A[] xp=new A[3];
		xp[0]=new A();
		xp[1]=new A(100);
		xp[2]=new A(100,200);
		for(int i=0;i<xp.length;i++)
			xp[i].disp();
		
	}
}
