package collection.first;
import java.util.*; // Scanner()

public class Exam_03 {
	public static void main(String[] ar){
		// ���ڿ��� �Է¹޾� ArrayList�� ������ �� ���� �� ���ڿ��� ���
		ArrayList<String> sa=new ArrayList<String>();
		//Ű���带 ���� �̸� �ټ����� �Է¹޴´�.
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("-> ");
			String name=sc.nextLine();
			sa.add(name);
		}
		pt(sa);
		int index = 0; //���� �� �̸��� ��� ���� 0���� ��ġ���� ���� �� �̸����� ����
		for(int i=1;i<sa.size();i++){
			if(sa.get(i).length()>sa.get(index).length()){
				index=i;
			}
		}
		System.out.println("���� �� �� : "+sa.get(index));
	}
	
	
	public static void pt(ArrayList sa){
		for(int i=0;i<5;i++){
			System.out.println(sa.get(i));
		}
	}
}
