package collection.first;
import java.util.HashSet;
import java.util.Set;
public class Exam_06 {
	public static void main(String[] ar){
		// HashSet�� �̿��ϸ� �ߺ��� ���� ���ܽ�ų �� �ִ�.(�ߺ��� ������� �ʱ� ����)
		// �ζǽý����̳� ������� �˰��� ���
		Set st=new HashSet();
		while(st.size()<6){
			//Mash.random()
			st.add((int)(Math.random()*45+1));
		}
		System.out.println(st);
	}
}
