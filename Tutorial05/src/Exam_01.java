/**
 * 반복문 : 동일하거나 유사한 문장을 반복해서 수행할때 사용하는 제어문
 * 		  - 주어진 조건식이나 횟수에 의해서 반복을 제어한다.
 *        - 유사한 문장 : 동일한 행위를 하되, 일정한 규칙을 가지고 있는 문장
 *        - 종류 : for문, while문, do~while문
 */
public class Exam_01 {
	public static void main(String[] ar){
		int i=0,cnt=1;
		
		/*
		 * for(초기구문 ; 조건식구문 ; 증감식 구문){
		 *	반복할 작업 
		 *  for(;;) 무한Loop
		}*/
		for(i=0;i<3;i++){
			System.out.println("Monday ~~  "+i+" - "+cnt);
			cnt++;
		}
		for(i=8;i<=10;i++){
			System.out.println(i);
		}
		/*while - 사용자의 행위로 반복을 제어
		 * 		- 무한Loop로 작업을 수행해야할 때
		 * while(논리조건문){
		 * 	반복할 작업;
		 *  (index의 설정);
		 * }
		 * while(true){
		 * 
		 * }
		 */

	}
}
