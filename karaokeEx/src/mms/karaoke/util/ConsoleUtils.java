package mms.karaoke.util;
import mms.karaoke.model.*;
public class ConsoleUtils {
	public String selectPerson(Person selection) throws InterruptedException{
		System.out.println("����� �Ѹ� �����մϴ�.");
		Thread.sleep(500);
		System.out.println("...");
		Thread.sleep(500);
		System.out.println("..");
		Thread.sleep(500);
		System.out.println(".");
		String temp=selection.getName();
		System.out.println("���õ� ����� "+temp+"�Դϴ�.");
		return temp;
	}
	public void showClient(String client){
		System.out.println("������ "+client+"�Դϴ�");
	}
	
}