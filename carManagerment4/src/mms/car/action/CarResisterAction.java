package mms.car.action;

import java.io.BufferedReader;
import java.io.IOException;

import mms.car.util.*;
import mms.car.model.*;
public class CarResisterAction implements Action{
	public void execute(BufferedReader in) throws IOException {
		ConsoleUtil c=new ConsoleUtil();
		Car temp=c.getNewCar(in);
		c.carShowMessage(temp);
	}
}