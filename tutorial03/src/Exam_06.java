/**
 * �̸��� ���̸� �Է¹޾� ����ϴ� ���α׷��� �����Ͻÿ�.
 */
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] ar){
		//���� : ������ �ڷ����� �ʱⰪ�� ���� ��
		Scanner buf = new Scanner(System.in);
		String name="";
		int age=0;
		//�Է¹� : �Է����Ŀ� �°� ���α׷��� ������ �� 
		System.out.print("�̸� = ");
		name=buf.nextLine();
		System.out.print("���� = ");
		age=buf.nextInt();
		//ó���� : ó���ϴ� ���� - ��ɾ ����� ���� ó��
		
		//��¹� : ������Ŀ� �°� ���α׷��� ������ ��
		System.out.println();
		System.out.printf("�̸� - %s\n���� - %d\n",name,age);
	}
}
