package tutorial11;
/*
 * static : �����ʵ带 ���� ���������
 * 			- �����Ͱ��� �����ϱ� ���� ���Ǵ� ���������
 * 			- ����ʵ常 �����ϴ�.
 * 			- Ŭ���� �̸����� ������ �����ϴ�.
 * 			- ��ü �߻����� �޸𸮿� �Ҵ�ȴ�.
 * 			- ������ �ʱ�ȭ������ �̿��� �� �ִ�.
 * 			  ����
 * 			 static{
 * 				�ʱ�ȭ����;
 * 			 }
 * static �޼��� : static �ʵ带 ������ �������� ���Ǵ� �޼���� static�� ���� �� �ִ�.
 * 
 */
class B{
	private static int x;
	private int y;
	
	public void aaa(){
		x=0;
		y=0;
		x++;
		y++;
		System.out.println("x= "+x+" , y="+y);
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		B ap=new B();
		B bp=new B();
		for(int i=0;i<10;i++){
			ap.aaa();
		}
	}
}