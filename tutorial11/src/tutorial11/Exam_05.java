package tutorial11;
/*
 * Ŭ����(class)�� �������(���� ���)
 * 1. ����ʵ�
 *    - ���������� : private, ĸ��ȭ(��������)
 * 2. ������ �޼���
 *    - Ŭ������� �����ϰ� �ۼ��Ѵ�.
 *    - ��ü�� ������ �� ȣ��ȴ�.
 *    - ����ʵ带 �ʱ�ȭ�� �������� ���ȴ�.
 *    - ��������ϰ��� ���� �ʴ´�(void���� ���� �ʴ´�.)
 *    - �����ε�(Overloadding) : ������ �̸��� ���� �޼��带 ������ ����� ����� �� �ִ� ���
 *                              ��, �Ű������� ������ �ٸ��ų� ������ Ÿ���� �޶�� �Ѵ�.
 *    - this�� this()
 *      
 * 3. ����޼���
 *    - ���������� : public
 *    - set~, get~
 *    - ����
 *      ����������[���������] ��������ϰ� �޼����(�Ű�����) throws ����Ŭ����(...)
 *    - ���� 4���� 
 *    - ��������ϰ� : Ű����(return)
 *                   �⺻�ڷ���(8���ڷ���), �����ڷ���(Ŭ����, �������̽�....)
 * 
 *    
 * 4. ��øŬ���� : 4����
 *    1) ��ø Ŭ����(Inner Class)
 *       - Ŭ���� ���ο� �� �ٸ� Ŭ������ �������� Ŭ���� ������ ȿ������ ���̴� ��
 *       - static ���ԺҰ�
 *       - �ݵ�� �ٱ��� ��ü�� ������ �Ŀ� ���� ��ü�� ������ �� �ִ�.
 *    2) ���� ��ø Ŭ����(Static Inner Class)
 *       - 
 *    3) ���� ��ø Ŭ����(Local Inner Class)
 *       - 
 *    4) �͸� ��ø Ŭ����(Anonymous Inner Class)
 *       - 
 */
class Outer{
	//��� �ʵ�
	private int x=100;
	private static int y=200;
	
	//������ �޼���
	public Outer(){
		
	}
	//����޼���
	public void disp(){
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
	//��ø Ŭ����
	class Inner{
		//����ʵ�
		private int a=100;
		//private static int b=200;
		//�����ڸ޼���
		public  Inner(){
			
		}
		//����޼���
		public void disp(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
		//��øŬ����
		class Other_Inner{}
		
	}
}
public class Exam_05 {
	public static void main(String[] ar){
		Outer ot=new Outer();
		Outer.Inner oi =ot.new Inner();
		oi.disp();
		Outer.Inner.Other_Inner oii=oi.new Other_Inner();
	}
}
