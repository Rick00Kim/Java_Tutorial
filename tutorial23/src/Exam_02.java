import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] ar){
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("홍길동");
		names.add("이순신");
		names.add("장보고");
		names.add("임꺽정");
		names.add("김유신");
		names.add("아몰라");
		
		for(int i = 0; i < names.size(); i++){
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		// 임꺽정을 삭제한 후 출력하는 Logic
 		for(int i = 0; i < names.size(); i++){
 			String name = names.get(i);
 			if(name.equals("임꺽정")){
 				names.remove(i);
 			}
 		}
//		names.remove("임꺽정");
		
		for(int i = 0; i < names.size(); i++){
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
	}
	
	// 홍길동의 이름을 홍두깨로 변경한 후 출력하시오.
	
}
