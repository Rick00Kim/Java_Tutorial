class E{
	public void aaa(){
		System.out.println("AAA");
	}
	public void bbb(){
		System.out.println("BBB");
	}
}
class F extends E{
	public void bbb(){
		System.out.println("CCC");
		//�������̵��� �� Object�� �޼��带 �������̵� �ϴ� �Ͱ� ����
	}
	public void ccc(){
		System.out.println("DDD");
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		E ed=new E();
		ed.aaa();
		ed.bbb();
		System.out.println();
		F f1=new F();
		f1.aaa();
		f1.bbb();
		f1.ccc();
		System.out.println();
		E f2=new F();
		f2.aaa();
		f2.bbb();
	}
}
