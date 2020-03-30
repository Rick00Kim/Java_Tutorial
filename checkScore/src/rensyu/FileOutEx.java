package rensyu;

import java.io.*;
public class FileOutEx {
	public static void main(String[] ar)throws IOException{
		FileOutputStream output = new FileOutputStream("out.txt");
//        String temp="123456789";
		
            output.write('1');
            output.write('2');
            output.write('3');
            output.write('4');
            output.write('\r');
            output.write('\n');
            output.write('5');
            output.write('6');
            output.write('7');
        output.close();
	}
}
