/*
 * Thread(������)�� ����(Exception) �׸��� Collection(�÷���)
 * 1. Thread(������) Multi - Programming Multi - Tasking �������α׷���
 *    - �������� ���� �׸��� �������� ������ �ηõ� �ϳ��� �۾� ����(�帧)
 *    - �������α׷��� = ���Ͻ����� (main�� �ϳ���� ���� ���� ���Ͻ�����)
 *    - callback �޼��� (�ý��� ���ҿ� ���� ȣ��)
 *    - Time Sharing System(TSS) : �ú���ó�� Round-Robin(RR)
 *    1) Thread �����ϴ� ��� : Thread Ŭ������ Runnable �������̽�
 * 	  - ������ Ŭ������ ������ �� Thread�� ��ӹ޴´�.
 *    - run() �޼��带 �������̵�(������)�Ѵ�. 
 *    - main()���� �ش� Ŭ������ ��ü�� ������ ��, Thread�� ȣ���ϴ� �޼���(start())�� ����.
 *    
 *    2) Runnable �������̽��� �̿��ϴ� ���
 *    - ������ Ŭ������ ������ �� Runnable�� ��ӹ޾� ����.
 *    - run() �޼��带 �������̵� �Ѵ�.
 *    - Runnable�� start() �޼��带 ������ ���� �ʾ� ������ Thread ��ü�� ������ �� �Ű�������
 *      Runnable ��ü�� ��� start() �����Ѵ�.
 *      
 * 2. Multi-Thread(��Ƽ������) : ����ȭ
 *    ����, ����(�ȵ���̵� ��-��׶���)
 *    
 */

class A extends Thread{
	public void run(){ // main()�޼���� ���� ���� ����
		System.out.println("AAA");
	}
}
class B extends Object implements Runnable{
	public void run(){
		System.out.println("BBB");
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		A ap=new A();
		B bp=new B();
		
		ap.run(); // �޼��� ȣ��
		ap.start();//Thread ȣ��
		new Thread(bp).start();
		
		for(int i=1;i<101;i++){
			System.out.print(i);
			if(i%10==0) System.out.println();
			else System.out.print("\t");
		}
		
	}
}
