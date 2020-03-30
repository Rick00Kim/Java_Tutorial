package study;

public class Exam_06 {
	static{
		System.out.println("Static 영역");
	}
	public static void aaa(){
		try{
			int tot=10/0;
			System.out.println("Tot : "+tot);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("?????");
		}finally{
			System.out.println("0으로 나누지 말 것");
		}
	}
	public static void main(String[] ar){
		System.out.println("TEST.......");
		aaa();
		System.out.println("Main 끝");
	}
	
}
