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
			System.out.print("���� -> ");
			int cli=Integer.parseInt(in.readLine());
			Action action=null;
			switch(cli)
			{
			case 1: action=new CarResisterAction();break;
			case 2: action=new CarOneViewAction();break;
			case 3: action=new DiaryInputAction();break;
			case 4: action=new CarAllViewAction();break;
			case 5: 
				System.out.println("Exit Programm....");
				isStop=true;
				break;
			case 100:menu();break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}	
				if(action!=null)
					fc.processRequest(action,in);
			
		}while(!isStop);
	}
	public static void menu(){
		System.out.println("====��������====");
		System.out.println("1. �ű��������");
		System.out.println("2. ������Ȯ��");
		System.out.println("3. �Ϸ���������");
		System.out.println("4. �����������");
		System.out.println("5. ���α׷�����");
		System.out.println("===============");
	}
}
