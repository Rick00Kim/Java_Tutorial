package collection.first;
/*
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Exam_05 {
	public static void main(String[] ar){
		/*List�迭 : ������ �ִ� ����, �ߺ����
		  ArrayList : �������̹迭, ���������� ����
	 	  LinkedList : �����Ϳ� �Բ� ���� �����͸� ����Ű�� ��ũ(������)�� �����Ѵ�.
		    �������� �������� �߰�/������ ArrayList�� ����
		    �߰� �����͸� �߰�/������ LinkedList�� ����
		  ArrayList�� ������ �˻��� Ư�� �ε����� �ٷ�
		  LinkedList�� ù ������ ���ϴ� �����Ͱ� �ִ� ��ġ���� �̵��ؾ���.	  */
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