/*
 * 숙박관리프로그램
 * 다음 주어진 프로그램이 동작하도록 구현하시오.
 * <입력 및 출력형식>
 * 작업[1.투숙 2.퇴실 3.객실보기 4.종료]
 * 선택 =1 
 * 몇층에 투숙?=
 * 투숙객 이름?=
 * 
 * 작업[1.투숙 2.퇴실 3.객실보기 4.종료]
 * 선택 =2
 * 몇번방에 퇴실? =
 * 
 * 작업[1.투숙 2.퇴실 3.객실보기 4.종료]
 * 선택 =3
 * 0번방 : 투숙객= 홍길동
 * 1번방 : 투숙객 = 장보고
 *  
 * <처리조건>
 * 1.숙박시설의 보유한 방의 개수가 5개로 가정하여 구현
 * 2. 각 방에는 고객의 이름을 담아서 관리.
 *    이 때, 방번호는 배열의 인덱스 이용
 * 3. 투숙시 존재하지 않은 방번호를 입력하였거나 이미 고객이 투숙한 상태라면 다시 방번호를 묻는다.
 * 4. 퇴실시 존재하지 않거나 이미 퇴실이 된 상태일 경우, 방번호를 다시 묻는다.
 * 5. 사용자가 원하는 작업을 선택하여 수행할 수 있도록 구현한다.
 * 6. 종료를 선택하기 전까지 프로그램은 무한 loop
 * 
 */
import java.io.*;
public class HomeWork {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//		String[] name;
//		int room=0;
		char cli=0;
		
		do{
			System.out.printf("1.Booking   (b) \n2.Check Out (c) "
					+ "\n3.Room list (l) \n4.Exit      (x) \n");
			System.out.print("==Choose Function -> ");
			cli=(char)(System.in.read());
			in.readLine();
			//Make Room
			switch(cli){
			case '1': case 'b': case 'B':
				System.out.println("Booking service");			
				
				break;
			case '2': case 'c': case 'C':
				System.out.println("Check Out");
				
				break;
			case '3': case 'l': case 'L':
				System.out.println("Room list");

				break;
			}
			System.out.println();
		}while(cli!='4' && cli!='x' && cli!='X');
		
		System.out.println("Exit Program.....");
	}
}
