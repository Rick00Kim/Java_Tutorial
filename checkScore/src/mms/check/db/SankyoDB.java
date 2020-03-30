package mms.check.db;
import java.io.*;
public class SankyoDB {
	public int[][] loadCorrectSankyoA()throws IOException {
		int[][] temp=new int[5][20];
		FileReader reader = new FileReader("sankyoA.txt");
		int data;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
				data=reader.read();
				temp[i][j]=data-'0';
			}
		}
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		reader.close();
		return temp;
	}
	public int[][] loadCorrectSankyoB()throws IOException {
		int[][] temp=new int[5][20];
		FileReader reader = new FileReader("sankyoB.txt");
		int data;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
				data=reader.read();
				temp[i][j]=data-'0';
			}
		}
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++){
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		reader.close();
		return temp;
	}
}
