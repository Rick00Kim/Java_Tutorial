package calculator;
/*
 * ���� : Calculator
 *   - �Ϲݰ��� : Mycalculator
 *   - ���п���� : 
 *   - ��������
 *   - ���α׷��ӿ� ����
 *   
 */
public class Exam_02 {
	public static void main(String[] ar){
		int x=10,y=25,rst=0;
		Mycalculator cal=new Mycalculator();
		rst=cal.add(x, y);
		System.out.println("Result : "+rst);
	}
}
