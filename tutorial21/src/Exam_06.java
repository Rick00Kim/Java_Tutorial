/*
 * Wrapper Ŭ����
 *  - 8���� �⺻ �����͸� Ŭ���� ��ü�� ����� Ŭ����
 *  - ����޼���
 *    ParseXXX() : String���� ���ϴ� �⺻ �ڷ������� ��ȭ�� �� ����ϴ� �޼���
 *    XXXvalue() : �ڽ��� ���� ���� �⺻������������ ��ȯ�� �� ����ϴ� �޼���
 *    
 *  - ����ڽ�, �����ڽ�
 *    ���ÿ��� : �⺻ ������ ����ȴ�.
 *    �� ���� : new������
 *    ����ڽ� : ���ÿ��� -> ������
 *    �����ڽ� : ������ -> ���ÿ���
 */
public class Exam_06 {
	public static void main(String[] ar){
		//parseXXX : String���� ���ϴ� �⺻ �ڷ������� ��ȯ
		String str="123";
		int x=Integer.parseInt(str);
		String str1="3.14f";
		float y=Float.parseFloat(str1);
		//XXXvalue();
		Integer num1=new Integer(10);
		int z=num1.intValue();
		Float num2=new Float(3.14f);
		float w=num2.floatValue();
	}
}
