/*
 * ���ܿ� ����ó��
 * 1. ���ܶ�?
 *    - Error
 *    - Exception 
 * 2. ���� ó�� ���� �����
 *    - throw : ���ܸ� ������.
 *    - throws : ���� ����
 *    - try ~ catch ~finally : ����ó��
 *    
 * 3. ���� ó�� �뵵
 *    - ���������� �����Ű�� ����
 *    - ���ܸ� �����ϱ� ����
 *    - ����� ����
 * 4. ����� ���� ����
 *    - 
 */

public class Exam_04 {
	public static void main(String[] ar){
		try{
			int x=10/0;
			System.out.println(x);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide to 0");
		}
	}
}