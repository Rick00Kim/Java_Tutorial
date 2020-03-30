package collection.first;
import java.util.*; // Scanner()

public class Exam_03 {
	public static void main(String[] ar){
		// 문자열을 입력받아 ArrayList에 저장한 후 가장 긴 문자열을 출력
		ArrayList<String> sa=new ArrayList<String>();
		//키보드를 통해 이름 다섯개를 입력받는다.
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("-> ");
			String name=sc.nextLine();
			sa.add(name);
		}
		pt(sa);
		int index = 0; //가장 긴 이름을 담기 위해 0번재 위치값을 가장 긴 이름으로 셋팅
		for(int i=1;i<sa.size();i++){
			if(sa.get(i).length()>sa.get(index).length()){
				index=i;
			}
		}
		System.out.println("가장 긴 열 : "+sa.get(index));
	}
	
	
	public static void pt(ArrayList sa){
		for(int i=0;i<5;i++){
			System.out.println(sa.get(i));
		}
	}
}
