/*
 * 메뉴
 * 1. 최대값
 * 2. 사이합
 * 3. 수나열
 * 4. 계산기
 * 5. 작업종료
 * 
 * 선택 = 
 * 
 * 1. 최대값을 선택하면 두 개의 정수를 입력받아 큰 수가 출력되도록 구현
 * 2. 사이합을 선택하면 두 개의 정수 사이와 그를 포함한 자연수들의 합을 계산하여 출력
 * 3. 수나열을 선택하면 세 개의 정수를 입력받아 큰순서대로
 * 4. 계산기를 선택하면 두 개의 정수와 하나의 연산자 입력 받음.
 * 5. 작업종료를 선택전엔 loop
 * 6. 사용자가 원하는 작업 사용하도록
 */
import java.io.*;
public class TeamQuiz {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char yn=0,cli=0;
		int num1=0,num2=0,rst=0,i=0;
		do{
			System.out.println("====Menu====");
			System.out.println("1. 최대값");
			System.out.println("2. 사이합");
			System.out.println("3. 수나열");
			System.out.println("4. 계산기");
			System.out.println("5. 작업종료");
			System.out.println("============");
			
			cli=(char)(System.in.read()-'0');
			in.readLine();
			switch(cli){
			case 1:
				System.out.println("최대값");
				do{
				System.out.print("1st : ");
				num1=Integer.parseInt(in.readLine());
				System.out.print("2nd : ");
				num2=Integer.parseInt(in.readLine());
				if(num1>num2)
					System.out.println("Max - "+num1);
				else
					System.out.println("Max - "+num2);
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 2:
				System.out.println("사이합");
				do{
					rst=0;
					System.out.print("num1 - ");
					num1=Integer.parseInt(in.readLine());
					System.out.print("num2 - ");
					num2=Integer.parseInt(in.readLine());
					if(num1>num2){
						for(i=num2;i<=num1;i++)
							rst+=i;
					}
					else{
						for(i=num1;i<=num2;i++)
							rst+=i;	
					}
				System.out.println("사이합 : "+rst);
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 3:
				System.out.println("수나열");
				do{
					
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 4:
				System.out.println("계산기");
				do{
					
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			}
		}while(cli!=5);
		System.out.println("Exit Program....");
	}
}
