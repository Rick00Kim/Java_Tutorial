package tutorial20;
/*
 * �������̽�(Interface) : �߻�޼��常 �����Ѵ�.
 *                       - Ŭ������ ��������� ������ ���赵
 *                       - ����������, �߻�޼���
 *                       - ���߻���� ������ ������ Ŭ����
 * �߻�Ŭ����(abstract class) : �Ϲݸ޼���+�߻�޼��� ����
 *                            - Ŭ������ ��������� �̿ϼ��� ���赵
 *                            - �Ϲݸ������, �Ϲݸ޼���, �߻�޼���
 * ������ : ��ü�� ������ �� ����. - ���������� ǥ��(�ڽİ�ü�� �θ�ü�� ��Ƽ� ���)
 * ������ : ~~
 */
abstract class A{
	public void disp(){
		System.out.println("�Ϲݸ޼���");
	}
}
class B extends A{
	public void disp(){
		System.out.println("�������̵��޼���");
	}
}
public class Exam_01{
	public static void main(String[] ar){
//		A ap=new A(); �߻�Ŭ������ ��ü�� ������ �� ����.
		A bp=new B(); //���������� ǥ��, ��ĳ���� ��ü ����
		
		bp.disp();
	}
}