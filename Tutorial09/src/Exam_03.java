/*
 * ������¸� ������ �������� Account Ŭ������ �����Ͻÿ�.
 */
class Account{
	//����ʵ�
	int id;				//���¹�ȣ
	String name;		//���̸�
	int bill;			//�����ܾ�
	//������ �޼���
	
	//��� �޼���
	public void init(int no, String irum,int cash){
		id=no;
		name=irum;
		bill=cash;
	}
	public void input(int cash){
		bill+=cash;
	}
	public int output(int cash){
		if(bill<cash){
			return 0;
		}else{
			bill-=cash;
			return cash;
		}
	}
	public void showAccount(){
		System.out.println("���¹�ȣ : "+id);
		System.out.println("���̸� : "+name);
		System.out.println("�����ܾ� : "+bill);
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		Account acc1=new Account();
		acc1.init(1, "ȫ�浿", 10000);
		acc1.showAccount();
		System.out.println();
		acc1.input(500);
		if(acc1.output(100000)==0){
			System.out.println("������ �����մϴ�.");
		}
		acc1.showAccount();
	}
}
