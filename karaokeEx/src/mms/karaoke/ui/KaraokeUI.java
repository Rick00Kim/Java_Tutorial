package mms.karaoke.ui;
import java.io.*;

import mms.karaoke.controller.KaraokeController;
import mms.karaoke.action.*;
public class KaraokeUI {
	public static void dispMenu(){
		System.out.println("\n====�뷡�� ���α׷�====");
		System.out.println(" 1. ���� ����");
		System.out.println(" 2. �뷡 ����");
		System.out.println(" 3. ����");
	}
	public static void main(String[] ar)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		boolean isStop=false;
		Action action=null;
		int cli;
		KaraokeController kc=new KaraokeController();
		dispMenu();
		do{
			System.out.print("���� -> ");
			cli=Integer.parseInt(in.readLine());
			switch(cli){
			case 1: action = new PersonSelectAction();break;
			case 2: action = new SongStartAction();break;
			case 3:
				System.out.println("Exit Programm....");
				isStop=true;
				action=null;
				break;
			}
			if(action!=null){
				kc.processRequest(action,in);
			}
		}while(!isStop);
	}
}
