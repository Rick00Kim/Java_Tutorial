import java.io.*;
public class Exam_01 {
	public static void main(String[] ar)throws IOException{
		StudentManager mng=new StudentManager();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			mng.showMenu();
			System.out.print("menu - ");
			int x=Integer.parseInt(in.readLine());
			switch(x){
			case 1: mng.newStudent();break;
			case 2: mng.findStd();break;
			case 3: mng.editStd(); break;
			case 4: mng.showAll();break;
			
			}
		}
	}
}
