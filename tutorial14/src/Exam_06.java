class Exam_06_Sub{
	public void disp(){
		System.out.println("AAA");
	}
}
public class Exam_06 {
	static Exam_06_Sub ex=new Exam_06_Sub();
	public static void main(String[] ar){
		show();
		System.out.println("ex ��ü�� ���ڿ�         : "+ex.toString());
		System.out.println("toString ������ ���� : "+ex);
		System.out.println("�ؽ��ڵ� : "+ex.hashCode());
	}
	public static void show(){
		System.out.println("ex ��ü�� Ŭ������      : "+ex.getClass());
	}
}
