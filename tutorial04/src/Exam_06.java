/*
 * Shift 연산 : 산술적인 계산과 논리적인 계산(단순히 자료를 이동하는 역할)
 *   - LeftShift  : 좌측이동, 곱하기
 *   - RightShift : 우측이동, 나누기
 */
public class Exam_06 {
	public static void main(String[] ar){
		int x=1<<3;//0001 -> 1000, 1*2^이동 비트수
		int y=8>>3;//1000 -> 0001, 8/2^이동 비트수
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
