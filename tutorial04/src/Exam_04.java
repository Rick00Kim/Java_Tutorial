/*
 * ���������� : 1�� �����ϰų� �����ϴ� ������
 * -���������� : ++a, --b
 * -���������� : a++, b--
 */
public class Exam_04 {
	public static void main(String[] ar){
		int x=100,y=0;
		System.out.println("x= "+x);//100
		System.out.println("y= "+y);//0
		y=++x;
		System.out.println("X= "+x);//101
		System.out.println("y= "+y);//101
		y=x++;
		System.out.println("x= "+x);//102
		System.out.println("y= "+y);//101
		
	}
}
