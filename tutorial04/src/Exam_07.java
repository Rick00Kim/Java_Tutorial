/*
 * ���迬���� & ���� ������ & ��Ʈ ������  
 *  - ���迬���� : ==,!=, >, >=, <, <=
 *  - ���������� : &&(AND), ||(OR), !(NOT) 
 *  - ��Ʈ������ : &,|,~,^(XOR)
 */
public class Exam_07 {
	public static void main(String[] ar){
		boolean bool=5<3 && 7>=4; //false && true => false
		boolean bool1=10!=11 || 7<=3;// true || false => true
		
		System.out.println("bool= "+bool);
		System.out.println("bool1= "+bool1);
	}
}