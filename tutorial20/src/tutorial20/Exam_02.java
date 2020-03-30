package tutorial20;
/*
 * interface에 포함될 수 있는 멤버
 * - public static final 멤버필드 -> 리터럴 상수
 * - abstract 멤버메서드
 * - static inner class 정적중첩클래스
 */
interface AA{
	int x=10;
	public void disp();
}
class BB implements AA{
	public void disp(){
		System.out.println("Interface 디스플레이");
	}
}
class CC implements AA{
	public void disp(){
		System.out.println("Interface_2 디스플레이");
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		AA bp=new BB();
		bp.disp();
		AA cp=new CC();
		cp.disp();
	}
}
