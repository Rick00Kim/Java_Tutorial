package tutorial10;
/*
 * 사각형을 추상화하는 클래스 Rect을 만들어 다음 주어진 main()가 
 * 제대로 동작하도록 프로그래밍 하시오.
 * 
 */
class Rect{
	//멤버 필드
	private int x;
	private int y;
	//생성자 메서드
	public Rect(){
		x=2;
		y=2;
	}
	public Rect(int x){
		this.x=this.y=x;
	}
	public Rect(int x,int y){
		this.x=x;
		this.y=y;
	}
	//멤버 메서드
	boolean isCheck(){
		if(this.x==this.y){
			return true;
		}else
			return false;
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		//객체 생성
		Rect r1=new Rect();
		Rect r2=new Rect(3);
		Rect r3=new Rect(4,7);
		
		if(r1.isCheck()){
			System.out.println("r1 객체는 정사각형입니다.");
		}
		if(r2.isCheck()){
			System.out.println("r2 객체는 정사각형입니다.");
		}
		if(r3.isCheck()){
			System.out.println("r3 객체는 정사각형입니다.");
		}
	}
}
