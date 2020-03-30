package tutorial20;
//import java.lang.*;
class Person1 extends Object{
	public Person1(){//생성자 메서드 - 리턴값이 없다.
		super();//()
	}
	public void disp(){
		System.out.println("일반메서드");
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
