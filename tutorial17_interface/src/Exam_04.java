import java.io.*;
public class Exam_04 {
	public static void main(String[] ar)throws IOException{
		AccountHandler ach=new AccountHandler();
		int chk=0;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			ach.viewMenu();
			System.out.print(" ->");
			chk=Integer.parseInt(in.readLine());
			switch(chk)
			{
			case 1:
				ach.addAccount();break;
			case 2:
				ach.inCost();break;
			case 3:
				ach.outCost();break;
			case 4:
				ach.viewClient();break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("선택이 올바르지 않습니다.");
			}
		}
	}
}
