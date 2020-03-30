package mms.car.action;

import java.io.BufferedReader;
import java.io.IOException;

import mms.car.db.*;
import mms.car.util.*;
import mms.car.model.*;
public class CarResisterAction implements Action{
	public void execute(BufferedReader in) throws IOException {
		ConsoleUtil cu=new ConsoleUtil();
		Car car=cu.getNewCar(in);
		
		CarDAO cad=new CarDAO();
		cad.resisterCar(car);
	}
}
