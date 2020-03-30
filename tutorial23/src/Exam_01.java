import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Collections Ŭ������ Ȱ���Ͽ� ���ڿ� ����, �ݴ�� ����, ���� �˻����� ����
public class Exam_01 {
	public static void printList(ArrayList<String> arr){
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()){
			String str = it.next();
			String separator; // �����ڸ� �������
			if(it.hasNext()){
				separator = " => ";
			}else{
				separator = "\n"; // ����
			}
			System.out.print(str + separator);
		}
	}
	
	public static void main(String[] ar){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ǰ���");
		list.add("�̳�� �߼�");
		list.add("������");
		list.add(0, "�͹̳�����");
		list.add("�����⵿��");
		
		// ������������ ����
		Collections.sort(list);
		printList(list);
		
		// ������������ ����(����)
//		Collections.reverse(list);
//		printList(list);
		
		int index = Collections.binarySearch(list, "������");
		System.out.println("�������� " + index + " ��°�� �ִ� ����Դϴ�.");
	}
}
