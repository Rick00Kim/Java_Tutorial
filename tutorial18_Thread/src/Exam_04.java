/*
 * 예외와 예외처리
 * 1. 예외란?
 *    - Error
 *    - Exception 
 * 2. 예외 처리 관련 예약어
 *    - throw : 예외를 던지다.
 *    - throws : 예외 전가
 *    - try ~ catch ~finally : 예외처리
 *    
 * 3. 예외 처리 용도
 *    - 정상적으로 종료시키기 위함
 *    - 예외를 보고하기 위함
 *    - 대안적 대응
 * 4. 사용자 정의 예외
 *    - 
 */

public class Exam_04 {
	public static void main(String[] ar){
		try{
			int x=10/0;
			System.out.println(x);
		}catch(ArithmeticException e){
			System.out.println("Cannot divide to 0");
		}
	}
}