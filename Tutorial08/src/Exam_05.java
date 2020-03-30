/*
 * 특정 클래스에 접근
 */
public class Exam_05 {
	public static void main(String[] ar){
		//객체 생성 : 클래스명 객체명 =new 생성자메서드();
		Person people = new Person();
		people.name="AAA";
		//객체를 이용해서 멤버에 접근할 수 있다.
		people.walk(10);
//		people.run(50);
		
		Person people2=new Person();
		people2.name="BBB";
		people2.walk(20);
//		people2.run(60);
	}
}
