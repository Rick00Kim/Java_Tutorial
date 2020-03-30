package mms.check.action;

import java.io.IOException;

import mms.check.db.*;
import mms.check.util.ConsoleUtils;

public class gisaAction implements Action {
	public void execute() throws IOException {
		ConsoleUtils cu=new ConsoleUtils();
		String msg="정보처리기사";
		cu.startMsg(msg);
		char cli=cu.getType();
		GisaDB gdb=new GisaDB();
		if(cli=='A'|| cli=='a'){
			char tmp=cu.getHowCheck();
			if(tmp=='1')
				cu.scoreCheck(gdb.loadCorrectGisaA(),msg);
			else if(tmp=='2')
				cu.scoreCheckF(gdb.loadCorrectGisaA(),msg);
			else
				cu.inputFailMessage();
		}else if(cli=='B'||cli=='b'){
			char tmp=cu.getHowCheck();
			if(tmp=='1')
				cu.scoreCheck(gdb.loadCorrectGisaB(),msg);
			else if(tmp=='2')
				cu.scoreCheckF(gdb.loadCorrectGisaB(),msg);
			else
				cu.inputFailMessage();
		}else
			cu.inputFailMessage();
	}
}