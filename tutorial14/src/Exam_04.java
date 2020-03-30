/*
 * �ڷᱸ��(Data Structure)
 *  - �����͸� ȿ�������� �����ϱ� ���� ���
 *  1. ����(Variable) : �ϳ��� �����͸� ����ϴ� ������
 *  2. �迭(Array) : ������ �ڷ����� ��� �����ϴ� �ڷᱸ��
 *  3. ����ü(struct) : ���� �ٸ� �ڷ����� ��� �����ϴ� �ڷᱸ��(����ʵ� = ����)
 *  4. Ŭ����(class) : ���� ���õ� �ڷḦ �ϳ��� �̸����� ��� �����ϴ� �ڷᱸ��(����ʵ� + �޼���)
 *  5. �÷���(collection)
 *  
 * ��ü�������� ���α׷��� ���
 * 1. Ŭ����(class)
 *    - ��ü(object)
 *    1) ���Ը�� : ����ʵ�, �����ڸ޼���, ����޼���, ��øŬ����
 *    2) ��ü���� : �ν��Ͻ� ����
 *       [Ŭ������] [��ü��] = new [�����ڸ޼���(�谳����)];
 *    3) ����������(������)
 *       - private
 *       - (package) - ��Ӱ��迡���� ���� ���
 *       - protected
 *       - public - �������� ���� ���
 *    
 * 2. ĸ��ȭ(��������)
 *    - ����ʵ�� private
 *    - ����޼���� public
 *    
 * 3. ���
 *    1) ����Object�� ������ �����ϱ� ����
 *       - ����Object��?
 *         Ŭ���� ���ο� ������ Ŭ������ ������ �� �ִ� ��ü�� ������ �ִ� ����
 *    2) ���(Inheritance) : �θ�Ŭ������ ����� �ڽ� Ŭ������ �״�� �����޾� ����� �� �ִ� ���
 *       - Ű���� : extends
 *       - ����
 *         ���������� [���������] class �Ļ�Ŭ���� extends ���Ŭ����(....)
 *         ���Ŭ���� = ����Ŭ���� = �θ�Ŭ����
 *         �Ļ�Ŭ���� = ����Ŭ���� = �ڳ�Ŭ����
 *       - ���ϻ���� ������� �����ȴ�.
 *    3) �ڹٿ��� ������ �������� ���Ǵ� �͵�
 * 4. ������
 * 5. �߻�(abstract)
 * 6. ���߻��(�������̽� : interface)
 */
class A{
	int a=10;
}

class B extends A{
	int b=20;
	//A ap=new A(); // ���� Object
}

class C extends B{
	int c=30;
	//B bp=new B();
}

class D extends C{
	int d=40;
	//C cp=new C();
}
public class Exam_04 {
	public static void main(String[] ar){
		D dp=new D();
		
		System.out.println("a = "+dp.a);//.�������ϴ� ����Object�� ����
		System.out.println("b = "+dp.b);
		System.out.println("c = "+dp.c);
		System.out.println("d = "+dp.d);
		
	}
}