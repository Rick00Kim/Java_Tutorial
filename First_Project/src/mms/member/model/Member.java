package mms.member.model;
/*
 * 비즈니스 로직
 *  - 한명의 회원의 정보를 저장하기 위한 클래스 구현
 *  - 이름, 주소, 전화, 나이, 성별등의 필드를 관리한다.
 *  - 자바 '빈'
 */
public class Member {
	private int id;
	private String name;
	private String address;
	private String phone;
	private int age;
	private String gender;
	
	public Member(){}

	public Member(int id, String name, String address, String phone, int age, String gender) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString(){
		return "name : "+name+", address : "+address
				+", Phone : "+phone+", age : "+age+", gender : "+gender;
	}
	
}
