package mms.car.util;
import java.io.*;
import java.util.*;
import mms.car.model.*;
public class ConsoleUtil {
	String[] carKinds={"��ũ����","����Ʈ��","��ũ�θ�"};
	
	public Car getNewCar(BufferedReader in)throws IOException{
		String kinds;
		System.out.println("====�������====");
		while(true){
			System.out.print("�������� (1.��ũ���� 2.����Ʈ�� 3.��ũ�θ�) -> ");
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
				System.out.println("�߸��ԷµǾ����ϴ�.");
		}
		System.out.print("�������� - ");
		System.out.println(kinds);
		System.out.print("���ѹ� - ");
		String num=in.readLine();
		System.out.println("���� - ");
		int year=Integer.parseInt(in.readLine());
		
		return new Car(kinds,num,year);
	}
	public void showSuccessMessage(Car car){
		System.out.println(car);
	}
	public void allCarView(ArrayList<Car> ar){		
		System.out.println("====��ü ����====");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}
}