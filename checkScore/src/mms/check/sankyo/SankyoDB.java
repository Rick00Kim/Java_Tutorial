package mms.check.sankyo;
import java.io.*;
public class SankyoDB {
	public int[] loadCorrectSankyo()throws IOException{
		int[] temp=new int[11];
		FileReader reader = new FileReader("out.txt");
		int i=0;
		while(true){
			int data = reader.read();
			if(data==-1) break; 
			temp[i++]=data-'0';
		}
		reader.close();
		return temp;
	}
}
