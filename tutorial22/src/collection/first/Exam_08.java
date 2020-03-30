package collection.first;
import java.util.*;

class Student{
	int id;
	String name;
	String tel;
	
	public Student(int id, String name, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	public String toString(){
		return "id : "+id+", name : "+name+", tel : "+tel;
	}
	
}
public class Exam_08 {
	public static void main(String[] ar){
		HashMap<Integer,Student> map=new HashMap<Integer,Student>();
		map.put(101, new Student(101,"홍길동","11111"));
		map.put(102, new Student(102,"AAA","22222"));
		map.put(103, new Student(103,"BBB","33333"));
		map.put(104, new Student(104,"CCC","44444"));
		
		System.out.println("요소 개수 : "+map.size());
		//모든 학생을 출력하는 Logic
		Set<Integer> keys=map.keySet();
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext()){
			int num=it.next();
			Student buf=map.get(num);
			System.out.println(buf);
		}
	}
	
}
