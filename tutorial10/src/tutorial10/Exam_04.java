package tutorial10;
/*
 * ���� �߻�ȭ�ϴ� Ŭ���� Circle�� �����Ͻÿ�.
 * �Ӽ� : �������� ���� ����
 * ���  : ���� �������� �Է¹ް�, ����� �� �ֵ��� ������ ��.
 *        ���� ������ ����Ͽ� �ǵ����� �� �ֵ��� ������ ��.
 */
import java.io.*;
class Circle{
	//��� �ʵ�
	private int ban;
	public Circle(){
		ban=0;
	}
	public Circle(int r){
		ban=r;
	}
	public double myunJeok(){
		return 3.14*ban*ban;
	}
	public void setBan(int x){
		ban=x;
	}
	public int getBan() {
		return ban;
	}
}

public class Exam_04 {
	public static void main()throws IOException{
		//��ü ����
		Circle op=new Circle();
		op.setBan(1);
		System.out.println("op ��ü�� ���� = "+op.myunJeok());
		Circle bp=new Circle(10);
		System.out.println("bp ��ü�� ���� = "+bp.myunJeok());
	}
}
