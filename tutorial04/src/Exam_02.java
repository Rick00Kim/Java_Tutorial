/**
 * 최우수연산자 : .(direct연산자), [](배열), ()괄호
 * 단항연산자    : 부호연산자(+/-), 증감연산자(++/--)- 전위연산자, 논리부정(!),비트부정(~)
 */
public class Exam_02 {
	public static void main(String[] ar){
		boolean bool=false;
		System.out.println("bool ="+bool);//false
		System.out.println("!bool ="+!bool);//true
		
		boolean bool1 = 5 >= 7;//false
		System.out.println("bool1= "+bool1);//false
		System.out.println("!bool1= "+!bool1);//true
		System.out.println("bool2= "+!(5<3));//true
		
	}
}
