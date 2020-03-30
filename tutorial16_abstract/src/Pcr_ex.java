/*
 * ���� �־��� �۾��� �����ϴ� ���α׷��� �����Ͻÿ�.

 * <����� ����>
 * 
 * 1.�� 2.�簢�� 3.�������� 4.����
 * ���� -> 1
 * x=
 * y=
 * r=
 * ���� -> 2
 * x=
 * y=
 * h=
 * w=
 * ���� -> 3
 * 
 * <ó������>
 * 1. 10���� ������ �Է¹޾� ó���ϵ��� ����
 *    �̶�, ������ ������ ���̵� �簢���̵� �������. �� ������ 10���� ������ �Է¹��� �� �ֵ���
 *    (��, ��-3, �簢��-7 or ��-6,  �簢��-4�� ��� ��)
 * 2. ����ڰ� ���ϴ� ������ �Է� ���� �� �ֵ��� ����.
 * 3. ����ڰ� ���ϸ� �������� ������ �Է¹��� ������ �� �� �ֵ���.
 * 4. ���α׷� �߰��� �������� ���ᰡ �� �� �ֵ���.
 * 5. �� �̻��� ������ ������� ��ü �迭 ���.
 */
import java.io.*;
public class Pcr_ex {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Point[] p=new Point[10];
		viewMenu();
		for(int i=0;i<p.length;i++){
			System.out.print("Select - ");
			int x=Integer.parseInt(in.readLine());
			
			switch(x)
			{
			case 1:
			{
				p[i]=new Circle();
				p[i].input();
				break;
			}
			case 2:
			{
				p[i]=new Rect();
				p[i].input();
				break;
			}
			case 3:
			{
				for(int a=0;a<i;a++){
					p[a].output();
				}
				i--;
				break;
			}
			case 4:
				break;
			default:
				System.out.println("Input Again");
			}
			if(x==4)break;
		}
		System.out.println("Exit Program....");
	}
	public static void viewMenu(){
		System.out.println("Menu - 1.Circle 2.Rect 3.View 4.Exit");
	}
}
