import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Collections 클래스를 활용하여 문자열 정렬, 반대로 정렬, 이진 검색등의 예제
public class Exam_01 {
	public static void printList(ArrayList<String> arr){
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()){
			String str = it.next();
			String separator; // 구분자를 담기위해
			if(it.hasNext()){
				separator = " => ";
			}else{
				separator = "\n"; // 개행
			}
			System.out.print(str + separator);
		}
	}
	
	public static void main(String[] ar){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("피고인");
		list.add("미녀와 야수");
		list.add("프리즌");
		list.add(0, "터미네이터");
		list.add("공각기동대");
		
		// 오름차순으로 정렬
		Collections.sort(list);
		printList(list);
		
		// 내림차순으로 정렬(역순)
//		Collections.reverse(list);
//		printList(list);
		
		int index = Collections.binarySearch(list, "프리즌");
		System.out.println("프리즌은 " + index + " 번째에 있는 요소입니다.");
	}
}
