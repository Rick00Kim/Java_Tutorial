package mms.check.ui;
import java.io.*;

import mms.check.action.*;
import mms.check.controller.*;
public class Check {
	public static void main(String[] ar)throws IOException{
		int cli;
		boolean isStop=false;
		CheckController cc=new CheckController();
		do{
		kindsView();
		cli=System.in.read()-'0';
		System.in.read();
		System.in.read();
		Action action=null;
			switch(cli){
			case 1:action=new gisaAction();isStop=true;break;
			case 2:action=new sankyoAction();isStop=true;break;
			case 3:
				System.out.println("Exit");
				isStop=true;
			default:
				System.out.println("�߸��Է��Ͽ����ϴ�.");	
				break;
			}
			if(action!=null)
				cc.processRequest(action);
		}while(!isStop);
	}
	public static void kindsView(){
		System.out.println("=================");
		System.out.println("1. ����ó�����");
		System.out.println("2. ����ó��������");
		System.out.println("=================");
		System.out.print("-> ");
	}
}
