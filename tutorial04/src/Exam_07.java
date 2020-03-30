/*
 * 관계연산자 & 논리 연산자 & 비트 연산자  
 *  - 관계연산자 : ==,!=, >, >=, <, <=
 *  - 논리연산자 : &&(AND), ||(OR), !(NOT) 
 *  - 비트연산자 : &,|,~,^(XOR)
 */
public class Exam_07 {
	public static void main(String[] ar){
		boolean bool=5<3 && 7>=4; //false && true => false
		boolean bool1=10!=11 || 7<=3;// true || false => true
		
		System.out.println("bool= "+bool);
		System.out.println("bool1= "+bool1);
	}
}
