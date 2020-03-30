package mms.check.controller;

import java.io.BufferedReader;
import java.io.IOException;

import mms.check.action.Action;;

public class CheckController {
	public void processRequest(Action action){
		try {
			action.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
