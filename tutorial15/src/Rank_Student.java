/*
 * 5명의 점수를 받아 나열
 */

import java.io.*;
class Student{
	public int score;
	public String name;
	private BufferedReader in;
	public int index;

	Student()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("name - ");
		name=in.readLine();
		System.out.print("score - ");
		score=Integer.parseInt(in.readLine());
	}
}
public class Rank_Student {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int std[]=new int[5];
		int tmp;
		
		for(int i=0;i<5;i++){
			System.out.print(" - ");
			std[i]=Integer.parseInt(in.readLine());
		}
		for(int i=0;i<std.length;i++){
			for(int j=i+1;j<std.length;j++){
				if(std[i]>std[j]){
					tmp=std[i];
					std[i]=std[j];
					std[j]=tmp;
				}
			}
		}
		for(int i=0;i<std.length;i++){
			System.out.println(i+1+"`s - "+std[i]);
		}
	}
}
