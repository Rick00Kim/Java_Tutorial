/*
 * ���°��� ���α׷�
 * ���� �־��� ���α׷��� �����Ͻÿ�.
 * <����� ����>
 * ====Banking System====
 * 1.���� ���
 * 2.�Ա� ó��
 * 3.��� ó��
 * 4.��ü�� �ܾ׺���
 * 5.���α׷� ����
 * ======================
 * ���� - 
 * ====���µ��====
 * ���¹�ȣ -
 * ���̸� -
 * ���ݱݾ� -
 * xxx�� ���°� ��ϵǾ����ϴ�.
 * 
 * ====�Ա�ó��====
 * ���¹�ȣ - 
 * �Աݱݾ� -
 * xxx�� �����ܾ��� xxx���Դϴ�.
 * 
 * ====���ó��====
 * ���¹�ȣ - 
 * ��ݱݾ� -
 * xxx�� �����ܾ��� xxx���Դϴ�.
 * 
 * ====��ü�� �ܾ׺��� ====
 * ���¹�ȣ : 00, ���̸� : 00, �����ܾ� :000
 * 
 * <ó������>
 * 1.���¸� �����ϱ� ���� Ŭ���� Account����
 * 2.����� ó���� ���� ���¹�ȣ�� �Է¹��� �� �ش� ���� ���� ��츸 ��� ����
 *   �� ���¹�ȣ�� ���� ��� " �Է��ϽŰ��¹�ȣ�� �����ϴ�." ���
 * 3.�־��� ��������Ŀ� �°� ���α׷��� ���۵ǵ��� ����
 * 4.�� �̻��� ���� ������ �������� ��ü�迭�� �̿�.
 * 5.���� ó���� ����ϴ� Ŭ���� AccountHandler�̿�
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
		return "���¹�ȣ : "+id+", ���̸� : "+name+", �ܾ� :"+cost;
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
