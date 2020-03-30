package mms.car.controller;

import mms.car.action.*;
import java.io.*;
public class FrontController {
	public void processRequest(Action action,BufferedReader in){
		try{
			action.execute(in);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
