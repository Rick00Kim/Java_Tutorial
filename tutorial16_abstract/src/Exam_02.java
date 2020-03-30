/*
 * 다형성적인 표현의 특성
 *  - 멤버필드는 부모 객체의 필드만 접근 할 수 있다.
 *  - 멤버메서드는 부모 객체의 메서드만 접근하되, 
 *    자식객체가 오버라이딩(재정의)했다면 자식객체의 메서드가 호출된다.
 */
class C{
	int x=100;
	int y=200;
	
}
class D extends C{
	int y=300;
	int z=400;
}
public class Exam_02 {
	public static void main(String[] ar){
		C ap=new C();
		System.out.println("ap.x= "+ap.x);
		System.out.println("ap.y= "+ap.y);
		System.out.println();
		D bp=new D();
		System.out.println("bp.x= "+bp.x);
		System.out.println("bp.y= "+bp.y);
		System.out.println("bp.z= "+bp.z);
		System.out.println();
		C cp=new D(); //다형성적인 표현 x, (C).y
		System.out.println("cp.x= "+cp.x);
		System.out.println("cp.y= "+cp.y);
	}
}
