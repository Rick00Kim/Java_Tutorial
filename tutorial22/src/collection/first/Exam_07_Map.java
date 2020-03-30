package collection.first;
/*
 * Map : ������ �����ϴ� ����
 * key, value : key�� �ߺ��� ������� �ʰ�, value�� �ߺ��� ����Ѵ�.
 * HashMap
 * put(key,value),get(key) - value�� ���ϵȴ�.
 */
import java.util.*;
public class Exam_07_Map {
	public static void main(String[] ar){
		//����ܾ�� �ѱ۴ܾ ������ �����ϱ� ���� HashMap ����
		HashMap<String,String> dic=new HashMap<String,String>();
		//3���� ���� ��´�, put(key, value)
		dic.put("Apple", "���");
		dic.put("Banana", "�ٳ���");
		dic.put("Kiwi", "Ű��");
		//dic �÷���<key, value>�� �ִ� ��� ���� ���
		System.out.println(dic.get("Apple"));
		System.out.println(dic.get("Banana"));
		System.out.println(dic.get("Kiwi"));
		//key ���ڿ��� ���� ���� set ����
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
