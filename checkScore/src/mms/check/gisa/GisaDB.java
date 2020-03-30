package mms.check.gisa;

import java.io.*;

public class GisaDB {
	public int[][] loadCorrectGisaB()throws IOException{
//		int[][] temp=new int[5][20];
//		FileReader reader = new FileReader("gisaC.txt");
//		while(true){
//			int data = reader.read();
//			if(data==-1) break;
//			int tt=data-'0';
//			for(int i=0;i<temp.length;i++){
//				for(int j=0;j<20;j++){
//					temp[i][j]=tt;
//				}
//			}
//		}
//		for(int i=0;i<temp.length;i++){
//			for(int j=0;j<temp[i].length;j++){
//				System.out.print(temp[i][j]+" ");
//			}
//			System.out.println();
//		}
//		reader.close();
		
		int temp[][] = {{1,1,2,1,2,3,1,2,3,2,4,2,2,1,3,3,1,4,4,3},
					  	{1,2,3,4,2,2,4,4,3,2,3,1,3,2,3,3,3,3,4,1},
					  	{2,3,2,4,2,3,1,2,1,3,1,3,3,2,2,4,4,4,3,4},
					  	{4,4,4,1,1,4,3,3,3,3,3,4,2,3,2,3,2,2,4,1},
					  	{2,2,4,3,3,1,2,3,4,2,3,2,2,4,1,4,1,3,2,4}};
		
		return temp;
	}

	public int[][] loadCorrectGisaA() {
		
		return null;
	}
}