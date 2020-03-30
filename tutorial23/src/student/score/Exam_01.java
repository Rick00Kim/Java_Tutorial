package student.score;
import java.io.*;

public class Exam_01 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StudentManager sm = new StudentManager();
		int option = 0;
		
		do{
			sm.showMenu();
			option = Integer.parseInt(in.readLine());
			switch(option) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.search();
				break;
			case 3:
				sm.modify();
				break;
			case 4:
				sm.delete();
				break;
			case 5:
				sm.showAllStudent();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 옵션을 입력하였습니다.");
			}
		}while(option != 6);
	}
}
