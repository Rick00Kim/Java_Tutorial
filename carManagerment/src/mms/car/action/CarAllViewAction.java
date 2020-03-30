package mms.car.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

import mms.car.util.*;
import mms.car.db.*;
import mms.car.model.*;
public class CarAllViewAction implements Action{
	public void execute(BufferedReader in) throws IOException {
		CarDAO cda=new CarDAO();
		ArrayList<Car> arr=cda.getDAO();
		
		ConsoleUtil cu=new ConsoleUtil();
		cu.allCarView(arr);
	}
}