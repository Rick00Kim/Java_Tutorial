package collection.first;
/* 
 * Vector Ŭ���� ����
 * add() : �߰�, get(index) : ����, size() : ũ��
 */
import java.util.Vector;
public class Exam_01_Vector {
	public static void main(String[] ar){
		Vector v1= new Vector();
		Vector<Integer> v2=new Vector<Integer>(); //���׸�
		int sum=0;
		//v1 ��ü�� �ڷ� �߰�
		v1.add(new Integer(8));
		v1.add("�庸��");
		v1.add(7);
		v1.add(3.14);
		
		
		int x=(int)v1.get(2);
		System.out.println("v1 ��ü�� 2��° : "+x);
		System.out.println(v1.size());
		String y=(String)v1.get(1);
		System.out.println(y);
		//v2��ü�� �ڷ��߰�
		v2.add(4);
		v2.add(9);
		v2.add(-10);
		System.out.println("v2�� ũ�� : "+v2.size());
		System.out.println("v2�� �뷮 : "+v2.capacity());
		
		//���� �߰��� ������ Ÿ��
		v2.add(2,300);
		pt(v2);
		//v2��ü�� ��� ��Ҹ� ���Ͽ� �� ����� ����ϴ� ������ �����Ͻÿ�.
		for(int i=0;i<v2.size();i++)
			sum+=v2.get(i);
		System.out.println(sum);
	}
	public static void pt(Vector vv){
		for(int i=0;i<vv.size();i++)
			System.out.println(vv.get(i));
	}
}
