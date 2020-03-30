/*
 * 계좌관리 프로그램
 * 다음 주어진 프로그램을 구현하시오.
 * <입출력 형식>
 * ====Banking System====
 * 1.계좌 등록
 * 2.입금 처리
 * 3.출금 처리
 * 4.전체고객 잔액보기
 * 5.프로그램 종료
 * ======================
 * 선택 - 
 * ====계좌등록====
 * 계좌번호 -
 * 고객이름 -
 * 예금금액 -
 * xxx님 계좌가 등록되었습니다.
 * 
 * ====입금처리====
 * 계좌번호 - 
 * 입금금액 -
 * xxx님 현재잔액은 xxx원입니다.
 * 
 * ====출금처리====
 * 계좌번호 - 
 * 출금금액 -
 * xxx님 현재잔액은 xxx원입니다.
 * 
 * ====전체고객 잔액보기 ====
 * 계좌번호 : 00, 고객이름 : 00, 예금잔액 :000
 * 
 * <처리조건>
 * 1.계좌를 관리하기 위한 클래스 Account구현
 * 2.입출금 처리시 고객의 계좌번호를 입력받은 후 해당 고객이 있을 경우만 기능 구현
 *   단 계좌번호가 없을 경우 " 입력하신계좌번호가 없습니다." 출력
 * 3.주어진 입출력형식에 맞게 프로그램이 동작되도록 구현
 * 4.둘 이상의 고객을 관리할 목적으로 객체배열을 이용.
 * 5.실제 처리를 담당하는 클래스 AccountHandler이요
 */
public class Account {
	private int id;
	private String name;
	private int cost;
	public Account(){}
	public Account(int id,String name, int cost){
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	//getter~,setter~
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString(){
		return "계좌번호 : "+id+", 고객이름 : "+name+", 잔액 :"+cost;
	}
	public void input(int cost){
		this.cost+=cost;
	}
	public int output(int cost){
		if(this.cost<cost)
			return 0;
		else
			this.cost-=cost;
			return 1;
	}
}
