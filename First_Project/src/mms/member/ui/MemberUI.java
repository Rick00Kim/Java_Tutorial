package mms.member.ui;
/*
 * 사용자가 메뉴를 선택할 수 있는 화면을 구성해주는 클래스
 */
import java.io.*;
import mms.member.action.Action;
import mms.member.controller.MemberController;

public class MemberUI {
	public static void menu(){
		}
	public static void main(String[]ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		boolean isStop=false;
		MemberController controller =new MemberController();
		menu();
		do{
			System.out.println("\n==== 회원관리 프로그램 ====");
			System.out.println("1. 신규회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램종료");
		
			System.out.print("선택 -> ");
			int menu=Integer.parseInt(in.readLine());
			
			Action action=null;
			
			switch(menu)
			{
			case 1:action=new MemberAddAction();break;
			case 2:action=new MemberViewAction();break;				
			case 3:action=new MemberModifyAction();break;				
			case 4:action=new MemberRemoveAction();break;
			case 5:
				System.out.println("Exit Programm....");
				isStop=true;
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}
			if(action!=null){
				controller.processRequest(action,in);
			}
		}while(!isStop);
	}
}
