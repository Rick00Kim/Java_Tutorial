
public class Exam_01_1 {
	public static void star(int x){
		System.out.println("*****************");
		for(int i=0;i<x;i++)
			System.out.print("*");
		System.out.println();
	}
	public static void main(String[] ar){
		star(2); // Call by Name
		System.out.println("ź��");
		System.out.println("�ڱ���ź��");
		star(3);
		System.out.println("ź�ٵǴ�");
		star(2);
		System.out.println("�������� ~ û�ʹ�");
		star(1);
		System.out.println("�ݿ���");
		System.out.println("�ұ�");
		star(0);
	}

}
