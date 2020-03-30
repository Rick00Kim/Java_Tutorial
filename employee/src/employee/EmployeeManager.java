package employee;

import java.io.*;
public class EmployeeManager{
	private int index_cnt;
	private Premament[] pmt;
	private int paySum=0;
	public static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	public EmployeeManager(){
		pmt=new Premament[20];
		index_cnt=0;
	}
	public void addEmployee()throws IOException{
		if(index_cnt==pmt.length){
			System.out.println("Full Employee");
			return;
		}else{
			System.out.print("Write name - ");
			String name=in.readLine();
			System.out.print("Write paycheck - ");
			int pay=Integer.parseInt(in.readLine());
			pmt[index_cnt]=new Premament(name,pay);
			index_cnt++;
		}
	}
	public void addEm(Premament pmt){
		
	}
	public void showAllSalaryInfo(){
		if(index_cnt==0){
			System.out.println("No Employee");
			return;
		}else{
			for(int i=0;i<index_cnt;i++){
				System.out.println(pmt[i]);
			}
		}
	}
	public void showTotalSalary(){
		paySum=0;
		if(index_cnt==0){
			System.out.println("No Employee");
			return;
		}else{
			for(int i=0;i<index_cnt;i++){
				paySum+=pmt[i].getBill();
			}
			System.out.println("PayCheck in this month - "+paySum);
		}
	}
	public void showMenu(){
		System.out.println("=======Menu=======");
		System.out.println("1.AccountEmployee");
		System.out.println("2.Show_payCheck");
		System.out.println("3.Total_Paycheck");
		System.out.println("4.Exit Program");
		System.out.println("==================");
	}
}
