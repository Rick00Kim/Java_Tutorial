/*
 * static
 * 초기화 블럭
 */
class AAA{
	public static int x;
	static{
		x=100;
	}
}
public class Exam_03 {
	public static void main(String[]ar){
		AAA ap=new AAA();
		System.out.println("x = "+AAA.x);
	}
}
