import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] ar){
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("ȫ�浿");
		names.add("�̼���");
		names.add("�庸��");
		names.add("�Ӳ���");
		names.add("������");
		names.add("�Ƹ���");
		
		for(int i = 0; i < names.size(); i++){
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		
		// �Ӳ����� ������ �� ����ϴ� Logic
 		for(int i = 0; i < names.size(); i++){
 			String name = names.get(i);
 			if(name.equals("�Ӳ���")){
 				names.remove(i);
 			}
 		}
//		names.remove("�Ӳ���");
		
		for(int i = 0; i < names.size(); i++){
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
	}
	
	// ȫ�浿�� �̸��� ȫ�α��� ������ �� ����Ͻÿ�.
	
}
