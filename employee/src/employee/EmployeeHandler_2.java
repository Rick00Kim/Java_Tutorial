package employee;

import java.io.*;
public class EmployeeHandler_2 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		EmployeeManager mng=new EmployeeManager();
		char cli;
		mng.showMenu();
		while(true){
			System.out.print("Select Function - ");
			cli=(char)System.in.read();
			System.in.read();System.in.read();
			switch(cli)
			{
			case '1': mng.addEmployee(); break;
			case '2': mng.showAllSalaryInfo(); break;
			case '3': mng.showTotalSalary(); break;				
			case '4': 
				System.out.println("Exit Program....");
				System.exit(0);
			case 'h':case'H':
				mng.showMenu();
			default : 
				System.out.println("Choose 1 ~ 4");
			}
		}
	}
}