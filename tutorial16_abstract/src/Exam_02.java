/*
 * ���������� ǥ���� Ư��
 *  - ����ʵ�� �θ� ��ü�� �ʵ常 ���� �� �� �ִ�.
 *  - ����޼���� �θ� ��ü�� �޼��常 �����ϵ�, 
 *    �ڽİ�ü�� �������̵�(������)�ߴٸ� �ڽİ�ü�� �޼��尡 ȣ��ȴ�.
 */
class C{
	int x=100;
	int y=200;
	
}
class D extends C{
	int y=300;
	int z=400;
}
public class Exam_02 {
	public static void main(String[] ar){
		C ap=new C();
		System.out.println("ap.x= "+ap.x);
		System.out.println("ap.y= "+ap.y);
		System.out.println();
		D bp=new D();
		System.out.println("bp.x= "+bp.x);
		System.out.println("bp.y= "+bp.y);
		System.out.println("bp.z= "+bp.z);
		System.out.println();
		C cp=new D(); //���������� ǥ�� x, (C).y
		System.out.println("cp.x= "+cp.x);
		System.out.println("cp.y= "+cp.y);
	}
}
