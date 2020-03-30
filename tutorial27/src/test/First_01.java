package test;
/*
 * 금액을 입력받아 화폐매수를 계산하여 출력하는 프로그램을 구현
 * <입출력>
 * 금액=2558164
 * 
 * 오만원
 * 일만원권
 * 오천원권
 * 일천원권
 * 오백원
 * 백원
 * 오십원
 * 십원
 * 오원
 * 일원
 */
import java.io.*;
public class First_01 {
	long bill;
	public static BufferedReader in;
	int[] co={50000,10000,5000,1000,500,100,50,10,1};
	int[] co_cnt=new int[10];
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	First_01() throws IOException{
		System.out.print("Write Money - ");
		bill=Long.parseLong(in.readLine());
		func(bill);
	}
	public void func(long bill){
		long buff,rst=1;
		for(int i=0;i<co.length;i++){
			rst=bill/co[i];
			System.out.print(co[i]+"권 - "+rst);
			if(rst>0){
			bill=bill%co[i];
			}
			System.out.println();
		}
	}
	
	public static void main(String[] ar)throws IOException{
		new First_01();
	}
}
