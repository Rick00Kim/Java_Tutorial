package tutorial10;
/*
 * ����������(����������) : Ŭ���� ������ ����� ������ �����ϴ� ����� ���� Ű����
 * 1. private 	: ����, Ŭ���� �ۿ��� ������ ������� ���� ��
 * 2. protected : ���, ���� Ŭ����, ���� �������� ���� ���
 * 3. public 	: ����, ��ü�� ������ �ִٸ� ��𼭵� ������ ���
 * 
 *  ĸ��ȭ
 *  ����ʵ��� ���������ڴ� private
 *  ����޼���� ���������ڷ� public
 */

class Point{	//������� �� ���� �߻�ȭ�ϴ� Ŭ���� Point
	// ����ʵ� : ���е� ����ʵ� (��������)
	private int x;
	private int y;
	// ������ �޼���
	public Point(){	//default ������ - ����ʵ带 �ʱ�ȭ�����ִ� ������ �Ѵ�.
		x=0;
		y=0;
	}
	public Point(int x){
		this.x=x;
		y=0;
	}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	//��� �޼���
	public  void disp(){
		System.out.println("��(x,y) = ("+x+" , "+y+")");
	}
	//��� �޼��� : set~(����), get~(����)
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		//��ü ����
		Point ap1=new Point();
//		ap1.disp();
		ap1.setX(10);
		ap1.setY(20);
//		ap1.disp();
		System.out.println("��(x,y) = ("+ap1.getX()+" , "+ap1.getY()+")");
	}
}
