package mms.karaoke.controller;

import mms.karaoke.action.Action;
import java.io.*;
public class KaraokeController {
	public void processRequest(Action action,BufferedReader in){
		try {
			action.excute(in);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
