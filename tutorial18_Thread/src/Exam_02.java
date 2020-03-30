class AA extends Thread{
	public void run(){
		System.out.println("\nAA start!@!@!");
		System.out.println("count : "+Thread.activeCount());
		System.out.println("cur Thread = "+Thread.currentThread());
		System.out.println("AA End!@!@");
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		System.out.println("Main start !!");

		int x=Thread.activeCount();
		System.out.println("count : "+x);
		
		try { //���ܰ� �߻��Ҹ��� �����Է�
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("�����߻� : "+e.getMessage());
			e.printStackTrace();
		}//3*1000, 3�� ����
		AA ap=new AA();
		ap.setPriority(Thread.MAX_PRIORITY);
		ap.setDaemon(false);
		
		ap.start();
		
		for(int i=0;i<=100;i++){
			System.out.print(i);
			if(i%10==0){
				System.out.println();
			}else
				System.out.print("\t");
		}
	}
}
