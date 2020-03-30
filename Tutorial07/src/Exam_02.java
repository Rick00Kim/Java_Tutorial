/**
 * 단일차원배열의 특징
 * 1. 배열명은 Reference 객체이다.
 * 2. 배열명은 4byte 객체이다.
 * 3. 배열의 길이는 length 속성을 이용할 수 있다.
 * 4. 배열의 실제 데이터는 Heap영역에 저장된다.
 *    new 연산자의 의미 - Heap에 할당한라는 의미
 * 5. Garbage Collection에 의해 소멸된다.
 * 6. 각 공간은 첨자로 구분된다.(첨자는 0부터 시작된다.)
 * 7. 공간의 값은 자동으로 Default 초기화된다.
 * 8. 동적으로 할당된다.
 */
/*
 * 다음과 같은 작업을 수행하는 프로그램 구현
 * 입력받은 문자의 개수 = n
 * 문자 = AAABCCDEFF
 * 
 * A=3개
 * B=1개
 * C=2개
 * D=1개
 * E=1개
 * F=2개
 * ~
 * Z=0개
 * 처리조건
 * 1. 프로그램 시작시 처리할 문자의 개수를 입력받아 배열에 저장
 * 2. 입력받은 문자들을 각 알파벳순으로 개수와 함께 출력되도록
 */
import java.io.*;
public class Exam_02 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int cnt=0;
		char[] client;
		int[] alpha=new int[26];//0:A, 1:B, 2:C, 3:D......25:Z
		System.out.print("문자 개수 =");
		cnt=Integer.parseInt(in.readLine());
		client=new char[cnt];
		System.out.print("문자 = ");
		for(int i=0;i<cnt;i++){
			client[i]=(char)System.in.read();
		}
		//각 입력된 문자의 개수를 alpha배열에 담는 작업
		//입력받은 문자가 A=>alpha[0]++; alpha[0]=alpha[0]+1
		//A=65, B=66, C=67
		//alpha[client[i]-65]
		for(int i=0;i<client.length;i++){
			for(int j=0;j<alpha.length;j++){
				if(client[i]-65==j){
					alpha[j]++;
				break;
				}
			}
		}
		/*for(int i=0;i<client.length;i++){
			alpha[client[i]-65]++;
		}*/
		for(int i=0;i<alpha.length;i++){
			System.out.println((char)(i+65)+" = "+alpha[i]);
		}
	}
}
