package rensyu;
import java.io.*;
public class FileInEx {
	public static void main(String[] ar)throws IOException{
		int[] temp=new int[11];
		FileReader reader = new FileReader("out.txt");
		int i=0;
		while(true){
			int data = reader.read();
			if(data==-1) break; 
			temp[i++]=data-'0';
			System.out.print(data-'0');
		}
		reader.close();
		System.out.println();
		for(int j=0;j<temp.length;j++)
			System.out.println(j+" " +temp[j]);
	}
}