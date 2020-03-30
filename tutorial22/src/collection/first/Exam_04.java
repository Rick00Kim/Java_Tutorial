package collection.first;
/*컬렉션의 순차 검색을 위한 Iterator
 * Vector, ArrayList, Set 등과 같은 리스트 모양의 컬렉션에서 요소를 순차적으로 검색
 * 인터페이스
 * 
 */
import java.util.*;
public class Exam_04 {
	public static void main(String[] ar){
		//정수값만 저장하는 제네릭 벡터 생성
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		Iterator<Integer> it= v.iterator();
		int sum=0;
		while(it.hasNext()){
			int num= it.next();
			System.out.println(num);
		}
		it=v.iterator();
		while(it.hasNext()){
			sum+=it.next();
		}
		System.out.println(sum);
	}
}
