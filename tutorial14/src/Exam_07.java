/*
 * 상속관계...extends
 */
class High{ // 최상위 클래스
	// 멤버필드
	protected String name;  //protected는 상속관계에서는 접근 가능한 접근지정자
	protected String phone;
	
	public High(String name, String phone){
		this.name =name;
		this.phone=phone;
	}
	public void showFriend(){
		System.out.println("name : "+name);
		System.out.println("phone : "+phone);
	}
	public String toString(){// override  : 기존 object 메서드의 재정의
		return "name : "+name+" , phone : "+phone;
	}
}


class Univ extends High{
	private String major;
	
	public Univ(String name, String phone,String major){
		super(name,phone); // 반드시 자식클래스는 부모클래스의 멤버를 초기화할 의무가 있다.
		
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

		Univ u1=new Univ("ZZZ","018","컴공");
		
		Soci s1=new Soci("HHH","016","일본어");
		
		h1.showFriend();
		u1.showFriend();
		s1.showFriend();
	}
}
