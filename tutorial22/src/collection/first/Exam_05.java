package collection.first;
/*
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Exam_05 {
	public static void main(String[] ar){
		/*List계열 : 순서가 있는 집합, 중복허용
		  ArrayList : 가변길이배열, 순차적으로 저장
	 	  LinkedList : 데이터와 함께 다음 데이터를 가르키는 링크(연결점)을 저장한다.
		    데이터의 순차적인 추가/삭제시 ArrayList가 빠름
		    중간 데이터를 추가/삭제시 LinkedList가 빠름
		  ArrayList는 데이터 검색시 특정 인덱스에 바로
		  LinkedList는 첫 노드부터 원하는 데이터가 있는 위치까지 이동해야함.	  */
		//ArrayList lst = new ArrayList();
		List<Integer> lst =new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(1);
		lst.add(2);
		lst.add(2,10);
		// 1 2 10 1 2
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.contains(4));
		System.out.println(lst.indexOf(1));
		System.out.println(lst.lastIndexOf(1));
	}
}