package study;

public class Exam_06 {
	static{
		System.out.println("Static ����");
	}
	public static void aaa(){
		try{
			int tot=10/0;
			System.out.println("Tot : "+tot);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("?????");
		}finally{
			System.out.println("0���� ������ �� ��");
		}
	}
	public static void main(String[] ar){
		System.out.println("TEST.......");
		aaa();
		System.out.println("Main ��");
	}
	
}
