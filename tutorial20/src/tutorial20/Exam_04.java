package tutorial20;
/*
 * 1. ������ ��� �׸��� �ڷ���
 *   1) ���� : �ϳ��� ����� ����ϴ� ������, ���ϴ� ��
 *   2) ��� : ������ ��
 *   3) ���� ��ġ!!(Type ��ġ)
 *      ���� = ���
 *      ���� = ���
 *      ���� ����(�����, �����, ���� .....)
 *   4) �ڷ���(Data Type)
 *     -�⺻ �ڷ���   : ���� ��� �ִ� �ڷ���
 *      8�� �ڷ��� : boolean
 *                 byte(1) < short(2) < int(4) < long(8)
 *                           char(2)
 *                 float(4) < double(8)
 *     -������ �ڷ��� : ���� ������ �ִ� �ּҸ� ����Ű�� �ڷ���
 *                   String str="���ڿ�";
 *                   String str=new String("���ڿ�");
 *                   Ŭ������ �������̽��� �̿� �ش��.
 */
public class Exam_04 {
	public static int add(int[] data){
		int sum=0;
		for(int i=0;i<data.length;i++)
			sum+=data[i];
		return sum;
	}
	public static float avg(int sum){
		return sum/3.0f;
	}
	public static void main(String[] ar){
		int[] data={1,7,9,6,5,8,3};
		int sum=add(data);
		float avg=avg(sum);
		
		System.out.printf("total : %d, avg : %.2f",sum,avg);
	}
}
