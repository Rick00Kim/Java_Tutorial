/*
 * Shift ���� : ������� ���� ������ ���(�ܼ��� �ڷḦ �̵��ϴ� ����)
 *   - LeftShift  : �����̵�, ���ϱ�
 *   - RightShift : �����̵�, ������
 */
public class Exam_06 {
	public static void main(String[] ar){
		int x=1<<3;//0001 -> 1000, 1*2^�̵� ��Ʈ��
		int y=8>>3;//1000 -> 0001, 8/2^�̵� ��Ʈ��
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
