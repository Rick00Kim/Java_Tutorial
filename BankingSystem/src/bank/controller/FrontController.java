package bank.controller;

import java.io.BufferedReader;
import java.io.IOException;

import bank.action.Action;

public class FrontController {
	public void processRequest(Action action,BufferedReader in){
		try {
			action.execute(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}