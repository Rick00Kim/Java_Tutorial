package collection.first;
/*
 * Map : 쌍으로 저장하는 형태
 * key, value : key는 중복을 허용하지 않고, value는 중복을 허용한다.
 * HashMap
 * put(key,value),get(key) - value가 리턴된다.
 */
import java.util.*;
public class Exam_07_Map {
	public static void main(String[] ar){
		//영어단어와 한글단어를 쌍으로 저장하기 위한 HashMap 생성
		HashMap<String,String> dic=new HashMap<String,String>();
		//3개의 값을 담는다, put(key, value)
		dic.put("Apple", "사과");
		dic.put("Banana", "바나나");
		dic.put("Kiwi", "키위");
		//dic 컬렉션<key, value>에 있는 모든 값을 출력
		System.out.println(dic.get("Apple"));
		System.out.println(dic.get("Banana"));
		System.out.println(dic.get("Kiwi"));
		//key 문자열을 가진 집합 set 생성
		Set<String> keys =dic.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String st=it.next();
			String value=dic.get(st);
			System.out.println(st + ", "+value);
		}
		it=keys.iterator();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("-> ");
			String eng=sc.nextLine();
			System.out.println(dic.get(eng));
		}
		
	}
}
