package mms.member.ui;
/*
 * ����ڰ� �޴��� ������ �� �ִ� ȭ���� �������ִ� Ŭ����
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
			System.out.println("\n==== ȸ������ ���α׷� ====");
			System.out.println("1. �ű�ȸ�����");
			System.out.println("2. ȸ����Ϻ���");
			System.out.println("3. ȸ����������");
			System.out.println("4. ȸ����������");
			System.out.println("5. ���α׷�����");
		
			System.out.print("���� -> ");
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
				System.out.println("�߸��Է��߽��ϴ�.");
				break;
			}
			if(action!=null){
				controller.processRequest(action,in);
			}
		}while(!isStop);
	}
}
