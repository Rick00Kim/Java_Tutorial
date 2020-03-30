package mms.check.db;

import java.io.*;

public class GisaDB {
	public int[][] loadCorrectGisaA()throws IOException {
		int[][] temp=new int[5][20];
		FileReader reader = new FileReader("gisaA.txt");
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
	
	
	public int[][] loadCorrectGisaB()throws IOException{
		int[][] temp=new int[5][20];
		FileReader reader = new FileReader("gisaB.txt");
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