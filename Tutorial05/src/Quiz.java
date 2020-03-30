/**
 * 주민등록번호 : abcdef - 1234567
 * ab : 출생년도
 *  1 : Gender, 0(F)/9 - 1800년대, 1/2(F) - 1900년대, 3/4(F) - 2000년대
 *  
 */
import java.io.*;
public class Quiz {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int check=0;
		int year=0;
		String gender;
		System.out.print("주민번호 8번째 숫자 입력 = ");
		check=System.in.read()-48;
		//Enter 키 걸러내는 동작
		System.in.read();
		System.in.read();
		/*if(check == 9 || check == 0){
			year=1800;
		}else if(check ==1||check==2){
			year=1900;
		}else if(check==3||check==4){
			year=2000;
		}*/
		switch(check){
		case 9 : case 0:
			year=1800;
			break;
		case 1: case 2:
			year=1900;
			break;
		case 3: case 4:
			year=2000;
			break;
		default:
			
		}
		if(check%2==0){
			gender="Female";
		}else
			gender="Male";
		
		System.out.println("Your  born  : "+year);
		System.out.println("Your gender : "+gender);
	}
}
