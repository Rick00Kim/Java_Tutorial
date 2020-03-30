class Exam_06_Sub{
	public void disp(){
		System.out.println("AAA");
	}
}
public class Exam_06 {
	static Exam_06_Sub ex=new Exam_06_Sub();
	public static void main(String[] ar){
		show();
		System.out.println("ex 객체의 문자열         : "+ex.toString());
		System.out.println("toString 생략된 상태 : "+ex);
		System.out.println("해시코드 : "+ex.hashCode());
	}
	public static void show(){
		System.out.println("ex 객체의 클래스명      : "+ex.getClass());
	}
}
