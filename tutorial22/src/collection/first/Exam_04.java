package collection.first;
/*�÷����� ���� �˻��� ���� Iterator
 * Vector, ArrayList, Set ��� ���� ����Ʈ ����� �÷��ǿ��� ��Ҹ� ���������� �˻�
 * �������̽�
 * 
 */
import java.util.*;
public class Exam_04 {
	public static void main(String[] ar){
		//�������� �����ϴ� ���׸� ���� ����
		Vector<Integer> v=new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		Iterator<Integer> it= v.iterator();
		int sum=0;
		while(it.hasNext()){
			int num= it.next();
			System.out.println(num);
		}
		it=v.iterator();
		while(it.hasNext()){
			sum+=it.next();
		}
		System.out.println(sum);
	}
}
