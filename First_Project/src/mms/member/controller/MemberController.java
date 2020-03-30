package mms.member.controller;
/*
 * 
 */
import java.io.*;

import mms.member.action.Action;
public class MemberController {
	public void processRequest(Action action,BufferedReader in){
		try {
			action.execute(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
