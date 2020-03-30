/*
 * ����Ͻ� ����
 * 1. �޴����� �޼���
 * 2. ���°���
 * 3. �Ա�ó��
 * 4. ���ó��
 * 5. ��ü���� �ܾ� ���
 */
import java.io.*;
public class AccountHandler {
	Account[] acc;
	int accNum;
	static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	public AccountHandler()throws IOException{
		acc = new Account[100];
		accNum=0;
	}
	public void viewMenu(){
		System.out.println("=====Menu=====");
		System.out.println("1.���»���");
		System.out.println("2.�Ա�ó��");
		System.out.println("3.���ó��");
		System.out.println("4.��ü�� �ܾ׺���");
		System.out.println("5.���α׷� ����");
		}
	public void addAccount()throws IOException{
		System.out.println("====���µ��====");
		System.out.print("���¹�ȣ : ");
		int id=Integer.parseInt(in.readLine());
		System.out.print("���̸� : ");
		String name=in.readLine();
		System.out.print("���ݱݾ� : ");
		int cost=Integer.parseInt(in.readLine());
		acc[accNum]=new Account(id,name,cost);
		System.out.println(acc[accNum].getName()+"�� ���°� ��ϵǾ����ϴ�.");
		accNum++;
	}
	public void inCost()throws IOException{
		System.out.println("====�Ա�ó��====");
		System.out.print("���¹�ȣ - ");
		int id=Integer.parseInt(in.readLine());
		for(int i=0;i<accNum;i++){
			if(id==acc[i].getId()){
				System.out.print("�Աݱݾ� - ");
				int cost=Integer.parseInt(in.readLine());
				acc[i].input(cost);
				System.out.println("���� ������ �ܾ��� "+acc[i].getCost()+"�Դϴ�.");
				return;
			}
		}
		System.out.println("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	public void outCost()throws IOException{
		System.out.println("====���ó��====");
		System.out.print("���¹�ȣ - ");
		int id=Integer.parseInt(in.readLine());
		for(int i=0;i<accNum;i++){
			if(id==acc[i].getId()){
				System.out.print("��ݱݾ� - ");
				int cost=Integer.parseInt(in.readLine());
				if(acc[i].output(cost)==0){
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("���� ������ �ܾ��� "+acc[i].getCost()+"�Դϴ�.");
					return;
				}
					acc[i].output(cost);
					System.out.println("���� ������ �ܾ��� "+acc[i].getCost()+"�Դϴ�.");	
				}
				return;
			}
		System.out.println("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
	public void viewClient(){
		System.out.println("===��ü�� �ܾ׺���===");
		for(int i=0;i<accNum;i++){
			System.out.println(acc[i]);
		}
	}
}
