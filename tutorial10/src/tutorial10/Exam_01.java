package tutorial10;
/*
 * 접근지정자(접근제한자) : 클래스 내부의 멤버에 접근을 제한하는 기능을 가진 키워드
 * 1. private 	: 전용, 클래스 밖에서 접근을 허용하지 않을 때
 * 2. protected : 상속, 같은 클래스, 같은 폴더에서 접근 허용
 * 3. public 	: 공용, 객체만 가지고 있다면 어디서든 접근을 허용
 * 
 *  캡슐화
 *  멤버필드의 접근제한자는 private
 *  멤버메서드는 접근제한자로 public
 */

class Point{	//평면위의 한 점을 추상화하는 클래스 Point
	// 멤버필드 : 은닉된 멤버필드 (정보은닉)
	private int x;
	private int y;
	// 생성자 메서드
	public Point(){	//default 생성자 - 멤버필드를 초기화시켜주는 역할을 한다.
		x=0;
		y=0;
	}
	public Point(int x){
		this.x=x;
		y=0;
	}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	//멤버 메서드
	public  void disp(){
		System.out.println("점(x,y) = ("+x+" , "+y+")");
	}
	//멤버 메서드 : set~(설정), get~(추출)
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		//객체 생성
		Point ap1=new Point();
//		ap1.disp();
		ap1.setX(10);
		ap1.setY(20);
//		ap1.disp();
		System.out.println("점(x,y) = ("+ap1.getX()+" , "+ap1.getY()+")");
	}
}
