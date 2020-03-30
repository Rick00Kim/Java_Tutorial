/*
 * 증감연산자 : 1씩 증가하거나 감소하는 연산자
 * -전위연산자 : ++a, --b
 * -후위연산자 : a++, b--
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
