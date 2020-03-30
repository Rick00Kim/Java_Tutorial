package mms.car.ui;

import mms.car.action.*;
import mms.car.controller.*;

import java.io.*;

public class CarUI {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean isStop=false;
		FrontController fc=new FrontController();
		menu();
		do{
			System.out.print("선택 -> ");
			int cli=Integer.parseInt(in.readLine());
			Action action=null;
			switch(cli)
			{
			case 1: action=new CarResisterAction();break;
			case 2: action=new CarSearchAction();break;
			case 3: action=new DiaryInputAction();break;
			case 4: action=new CarAllViewAction();break;
			case 5: 
				System.out.println("Exit Programm....");
				isStop=true;
				break;
			case 100:menu();break;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}	
				if(action!=null)
					fc.processRequest(action,in);
			
		}while(!isStop);
	}
	public static void menu(){
		System.out.println("====차량관리====");
		System.out.println("1. 신규차량등록");
		System.out.println("2. 차량별확인");
		System.out.println("3. 하루일지쓰기");
		System.out.println("4. 모든차량보기");
		System.out.println("5. 프로그램종료");
		System.out.println("===============");
	}
}
