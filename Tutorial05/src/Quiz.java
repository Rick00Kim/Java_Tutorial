/**
 * �ֹε�Ϲ�ȣ : abcdef - 1234567
 * ab : ����⵵
 *  1 : Gender, 0(F)/9 - 1800���, 1/2(F) - 1900���, 3/4(F) - 2000���
 *  
 */
import java.io.*;
public class Quiz {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int check=0;
		int year=0;
		String gender;
		System.out.print("�ֹι�ȣ 8��° ���� �Է� = ");
		check=System.in.read()-48;
		//Enter Ű �ɷ����� ����
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
