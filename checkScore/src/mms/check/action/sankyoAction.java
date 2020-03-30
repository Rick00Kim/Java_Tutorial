package mms.check.action;

import java.io.IOException;

import mms.check.db.*;
import mms.check.util.ConsoleUtils;
public class sankyoAction implements Action {
	public void execute() throws IOException {
		ConsoleUtils cu=new ConsoleUtils();
		String msg="정보처리산업기사";
		cu.startMsg(msg);
		char cli=cu.getType();
		SankyoDB sdb=new SankyoDB();
		if(cli=='A'|| cli=='a'){
			char tmp=cu.getHowCheck();
			if(tmp=='1')
				cu.scoreCheck(sdb.loadCorrectSankyoA(),msg);
			else if(tmp=='2')
				cu.scoreCheckF(sdb.loadCorrectSankyoA(),msg);
			else
				cu.inputFailMessage();
		}else if(cli=='B'||cli=='b'){
			char tmp=cu.getHowCheck();
			if(tmp=='1')
				cu.scoreCheck(sdb.loadCorrectSankyoB(),msg);
			else if(tmp=='2')
				cu.scoreCheckF(sdb.loadCorrectSankyoB(),msg);
			else
				cu.inputFailMessage();
		}else
			cu.inputFailMessage();
	}
}