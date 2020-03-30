package mms.karaoke.util;
import mms.karaoke.model.*;
public class ConsoleUtils {
	public String selectPerson(Person selection) throws InterruptedException{
		System.out.println("사람을 한명 선택합니다.");
		Thread.sleep(500);
		System.out.println("...");
		Thread.sleep(500);
		System.out.println("..");
		Thread.sleep(500);
		System.out.println(".");
		String temp=selection.getName();
		System.out.println("선택된 사람은 "+temp+"입니다.");
		return temp;
	}
	public void showClient(String client){
		System.out.println("가수는 "+client+"입니다");
	}
	
}