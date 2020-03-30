package calculator;
/*
 * 계산기 : Calculator
 *   - 일반계산기 : Mycalculator
 *   - 공학용계산기 : 
 *   - 산업용계산기
 *   - 프로그래머용 계산기
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
