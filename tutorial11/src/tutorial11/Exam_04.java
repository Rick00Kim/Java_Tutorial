package tutorial11;
/*
 * ����ʵ�� ������ ���� final
 * 1. final �ʵ� : ��� ���� �����ϱ����� �������� ���� ������� �ʴ´�.
 * 				- ���������� ��� �ʵ� ��� �����ϴ�.
 * 2. final �޼���  : ��ӽ� �������̵�(������)���� �ʾƾ� �� �޼��忡 �����ϴ� �����
 * 
 * 3. 
 */
class Circle{
	private final double PI=3.141592;

	public double getPI() {
		return PI;
	}
	
}
public class Exam_04 {
	public static void main(String[] ar){
		Circle c=new Circle();
		System.out.println("pi= "+c.getPI());
		final int x=100;
		System.out.println("x = "+x);
		//x=20;
		System.out.println("x = "+x);
	}
}
