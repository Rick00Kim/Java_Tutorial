package tutorial20;
//import java.lang.*;
class Person1 extends Object{
	public Person1(){//������ �޼��� - ���ϰ��� ����.
		super();//()
	}
	public void disp(){
		System.out.println("�Ϲݸ޼���");
	}
}
public class Exam_0111 {
	public void aaa(){
		new Person1().disp();
	}
	public static void main(String[] ar){
		new Exam_0111().aaa();
	}
}
