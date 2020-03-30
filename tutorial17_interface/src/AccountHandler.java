/*
 * 비즈니스 로직
 * 1. 메뉴관리 메서드
 * 2. 계좌개설
 * 3. 입금처리
 * 4. 출금처리
 * 5. 전체고객의 잔액 출력
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
		System.out.println("1.계좌생성");
		System.out.println("2.입금처리");
		System.out.println("3.출금처리");
		System.out.println("4.전체고객 잔액보기");
		System.out.println("5.프로그램 종료");
		}
	public void addAccount()throws IOException{
		System.out.println("====계좌등록====");
		System.out.print("계좌번호 : ");
		int id=Integer.parseInt(in.readLine());
		System.out.print("고객이름 : ");
		String name=in.readLine();
		System.out.print("예금금액 : ");
		int cost=Integer.parseInt(in.readLine());
		acc[accNum]=new Account(id,name,cost);
		System.out.println(acc[accNum].getName()+"님 계좌가 등록되었습니다.");
		accNum++;
	}
	public void inCost()throws IOException{
		System.out.println("====입금처리====");
		System.out.print("계좌번호 - ");
		int id=Integer.parseInt(in.readLine());
		for(int i=0;i<accNum;i++){
			if(id==acc[i].getId()){
				System.out.print("입금금액 - ");
				int cost=Integer.parseInt(in.readLine());
				acc[i].input(cost);
				System.out.println("현재 고객님의 잔액은 "+acc[i].getCost()+"입니다.");
				return;
			}
		}
		System.out.println("입력하신 계좌번호는 존재하지 않습니다.");
	}
	public void outCost()throws IOException{
		System.out.println("====출금처리====");
		System.out.print("계좌번호 - ");
		int id=Integer.parseInt(in.readLine());
		for(int i=0;i<accNum;i++){
			if(id==acc[i].getId()){
				System.out.print("출금금액 - ");
				int cost=Integer.parseInt(in.readLine());
				if(acc[i].output(cost)==0){
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 고객님의 잔액은 "+acc[i].getCost()+"입니다.");
					return;
				}
					acc[i].output(cost);
					System.out.println("현재 고객님의 잔액은 "+acc[i].getCost()+"입니다.");	
				}
				return;
			}
		System.out.println("입력하신 계좌번호는 존재하지 않습니다.");
	}
	public void viewClient(){
		System.out.println("===전체고객 잔액보기===");
		for(int i=0;i<accNum;i++){
			System.out.println(acc[i]);
		}
	}
}
