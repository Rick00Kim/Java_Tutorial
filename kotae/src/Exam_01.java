import java.io.*;
public class Exam_01 {
	public static void main(String[] ar) throws IOException{
		StudentManager manage = new StudentManager();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			// 메뉴출력
			manage.showMenu();
			System.out.print("메뉴 = ");
			int x = Integer.parseInt(in.readLine());
			
			switch(x){
			case 1: manage.newStudent(); break;
			case 2: manage.findStudent();break;
			case 3: manage.editStudent();break;
			case 4: manage.showAllStudent(); break;
			}
		}
	}

}
