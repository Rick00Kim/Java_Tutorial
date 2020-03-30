package bank.ui;

import java.io.*;

import bank.action.*;
import bank.controller.*;
public class BankingUI {
	public static void main(String[] ar)throws IOException{
		boolean isStop=false;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		FrontController fc=new FrontController();
		do{
			int cli;
			System.out.print("Function - ");
			cli=Integer.parseInt(in.readLine());
			Action action=null;
			switch(cli)
			{
			case 1:action=new AccountCreate();break;
			case 2:action=new AccountInput();break;
			case 3:action=new AccountOutput();break;
			case 4:action=new AccountCheck();break;
			case 5:action=new AccountViewAll();break;
			case 6:
				System.out.println("Program Exit...");
				isStop=true;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
			if(action!=null){
				fc.processRequest(action,in);
			}
		}while(isStop);
	}
}
