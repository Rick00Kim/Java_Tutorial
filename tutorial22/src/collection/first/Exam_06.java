package collection.first;
import java.util.HashSet;
import java.util.Set;
public class Exam_06 {
	public static void main(String[] ar){
		// HashSet을 이용하면 중복된 값을 제외시킬 수 있다.(중복을 허용하지 않기 때문)
		// 로또시스템이나 빙고등의 알고리즘에 사용
		Set st=new HashSet();
		while(st.size()<6){
			//Mash.random()
			st.add((int)(Math.random()*45+1));
		}
		System.out.println(st);
	}
}
