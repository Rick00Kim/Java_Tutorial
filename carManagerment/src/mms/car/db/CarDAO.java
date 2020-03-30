package mms.car.db;

import java.util.ArrayList;

import mms.car.model.*;
public class CarDAO {
	static ArrayList<Car> ar=new ArrayList<Car>();
	public void resisterCar(Car car){
		ar.add(car);
	}
	public void deleteCar(Car car){
		ar.remove(car);
	}
	public ArrayList<Car> getDAO(){
		return ar;
	}
}
