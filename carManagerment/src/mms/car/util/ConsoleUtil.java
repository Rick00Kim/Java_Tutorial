package mms.car.util;
import java.io.*;
import java.util.*;
import mms.car.model.*;
public class ConsoleUtil {
	String[] carKinds={"포크레인","덤프트럭","탱크로리"};
	
	public Car getNewCar(BufferedReader in)throws IOException{
		String kinds;
		System.out.println("====차량등록====");
		while(true){
			System.out.print("차량종류 (1.포크레인 2.덤프트럭 3.탱크로리) -> ");
			int a=Integer.parseInt(in.readLine());
			if(a==1){
				kinds=carKinds[a-1];
				break;
			}
			else if(a==2){
				kinds=carKinds[a-1];
				break;
			}
			else if(a==3){
				kinds=carKinds[a-1];
				break;
			}
			else
				System.out.println("잘못입력되었습니다.");
		}
		System.out.print("차량종류 - ");
		System.out.println(kinds);
		System.out.print("차넘버 - ");
		String num=in.readLine();
		System.out.println("연식 - ");
		int year=Integer.parseInt(in.readLine());
		
		return new Car(kinds,num,year);
	}
	public void showSuccessMessage(Car car){
		System.out.println(car);
	}
	public void allCarView(ArrayList<Car> ar){		
		System.out.println("====전체 차량====");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}
}