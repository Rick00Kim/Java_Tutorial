package calculator;
/*
 * �������̽�(Interface)
 *   - ���� ����� �������� ������� Ŭ����
 *   - ���Ը���� ������ ���´�.
 *     public static final ����ʵ�
 *     public abstract ����޼���
 *     public static Inner class ������øŬ����
 *   - abstract : �߻�
 *     abstract class(�߻�Ŭ����) : abstract �޼��带 ������ �������� ����
 *                                �Ϲ�Ŭ������ ����, abstract �޼��带 ������ �� �ִ°�
 *     abstract method(�߻�޼���) : ����θ� ������ ���� ���� �޼���� �ݵ�� ������
 *     
 */
public interface Calculator {
	public int add(int x,int y);
	public int sub(int x,int y);
	public int multi(int x,int y);
	public int div(int x, int y);
}
