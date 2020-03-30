package tutorial20;
class Person{
	private String name;
	private int age;
	
	public Person(){
		name=null;
		age=0;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void setPerson(Person p){
		this.name=p.getName();
		this.age=p.getAge();
	}
	public void show(){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Exam_05 {
	public static void main(String[] ar){
		Person pa=new Person();
		pa.setName("È«±æµ¿");
		pa.setAge(18);
		pa.show();
		
		pa.setPerson(new Person("AAA",28));
		pa.show();
		
		Person p=pa;//°´Ã¼ º¹»ç
		p.show();
		p=null;//°´Ã¼ »èÁ¦
		
		
	}
}
