/*
 * 메서드의 유형
 */
public class Exam_03 {
	public static boolean aaa(){
		return true;
	}
	public static void bbb(){
		System.out.println("메서드의 유형 실습");
	}
	public static int ccc(){
		return 34;
	}
	public static float ddd(float a){
		return a;
	}
	public static void eee(int x,int y){
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	public static void main(String[] ar){
		System.out.println("Main의 시작!");
		System.out.println(aaa());  //메서드 aaa
		bbb();						//메서드 bbb
		System.out.println(ccc());	//메서드 ccc
		System.out.println(ddd(3.1416f));//메서드 ddd
		eee(100,50);				//메서드 eee
		System.out.println("Main의 끝!");
	}
	
}
