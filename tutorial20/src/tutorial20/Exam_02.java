package tutorial20;
/*
 * interface�� ���Ե� �� �ִ� ���
 * - public static final ����ʵ� -> ���ͷ� ���
 * - abstract ����޼���
 * - static inner class ������øŬ����
 */
interface AA{
	int x=10;
	public void disp();
}
class BB implements AA{
	public void disp(){
		System.out.println("Interface ���÷���");
	}
}
class CC implements AA{
	public void disp(){
		System.out.println("Interface_2 ���÷���");
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		AA bp=new BB();
		bp.disp();
		AA cp=new CC();
		cp.disp();
	}
}
