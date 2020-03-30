/*
 * ��Ӱ���...extends
 */
class High{ // �ֻ��� Ŭ����
	// ����ʵ�
	protected String name;  //protected�� ��Ӱ��迡���� ���� ������ ����������
	protected String phone;
	
	public High(String name, String phone){
		this.name =name;
		this.phone=phone;
	}
	public void showFriend(){
		System.out.println("name : "+name);
		System.out.println("phone : "+phone);
	}
	public String toString(){// override  : ���� object �޼����� ������
		return "name : "+name+" , phone : "+phone;
	}
}


class Univ extends High{
	private String major;
	
	public Univ(String name, String phone,String major){
		super(name,phone); // �ݵ�� �ڽ�Ŭ������ �θ�Ŭ������ ����� �ʱ�ȭ�� �ǹ��� �ִ�.
		
		this.major=major;
	}
	public void showFriend(){
		super.showFriend();
		System.out.println("major : "+major);
	}
}


class Soci extends High{
	private String company;
	
	public Soci(String name,String phone, String company){
		super(name,phone);
		this.company=company;
	}
	public void showFriend(){
		super.showFriend();
		System.out.println("company : "+company);
	}
}
public class Exam_07 {
	public static void main(String[] ar){
		High h1=new High("AAA","010");

		Univ u1=new Univ("ZZZ","018","�İ�");
		
		Soci s1=new Soci("HHH","016","�Ϻ���");
		
		h1.showFriend();
		u1.showFriend();
		s1.showFriend();
	}
}
