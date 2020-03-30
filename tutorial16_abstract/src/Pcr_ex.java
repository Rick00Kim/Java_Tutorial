/*
 * 다음 주어진 작업을 수행하는 프로그램을 구현하시오.

 * <입출력 형식>
 * 
 * 1.원 2.사각형 3.도형보기 4.종료
 * 선택 -> 1
 * x=
 * y=
 * r=
 * 선택 -> 2
 * x=
 * y=
 * h=
 * w=
 * 선택 -> 3
 * 
 * <처리조건>
 * 1. 10개의 도형을 입력받아 처리하도록 구현
 *    이때, 도형의 종류는 원이든 사각형이든 상관없음. 단 무조건 10개의 도형만 입력받을 수 있도록
 *    (예, 원-3, 사각형-7 or 원-6,  사각형-4든 상관 無)
 * 2. 사용자가 원하는 도형을 입력 받을 수 있도록 구현.
 * 3. 사용자가 원하면 언제든지 이제껏 입력받은 도형을 볼 수 있도록.
 * 4. 프로그램 중간에 언제든지 종료가 될 수 있도록.
 * 5. 둘 이상의 도형을 담기위한 객체 배열 사용.
 */
import java.io.*;
public class Pcr_ex {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Point[] p=new Point[10];
		viewMenu();
		for(int i=0;i<p.length;i++){
			System.out.print("Select - ");
			int x=Integer.parseInt(in.readLine());
			
			switch(x)
			{
			case 1:
			{
				p[i]=new Circle();
				p[i].input();
				break;
			}
			case 2:
			{
				p[i]=new Rect();
				p[i].input();
				break;
			}
			case 3:
			{
				for(int a=0;a<i;a++){
					p[a].output();
				}
				i--;
				break;
			}
			case 4:
				break;
			default:
				System.out.println("Input Again");
			}
			if(x==4)break;
		}
		System.out.println("Exit Program....");
	}
	public static void viewMenu(){
		System.out.println("Menu - 1.Circle 2.Rect 3.View 4.Exit");
	}
}
