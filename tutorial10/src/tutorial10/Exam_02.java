package tutorial10;
/*
 * �簢���� �߻�ȭ�ϴ� Ŭ���� Rect�� ����� ���� �־��� main()�� 
 * ����� �����ϵ��� ���α׷��� �Ͻÿ�.
 * 
 */
class Rect{
	//��� �ʵ�
	private int x;
	private int y;
	//������ �޼���
	public Rect(){
		x=2;
		y=2;
	}
	public Rect(int x){
		this.x=this.y=x;
	}
	public Rect(int x,int y){
		this.x=x;
		this.y=y;
	}
	//��� �޼���
	boolean isCheck(){
		if(this.x==this.y){
			return true;
		}else
			return false;
	}
}
public class Exam_02 {
	public static void main(String[] ar){
		//��ü ����
		Rect r1=new Rect();
		Rect r2=new Rect(3);
		Rect r3=new Rect(4,7);
		
		if(r1.isCheck()){
			System.out.println("r1 ��ü�� ���簢���Դϴ�.");
		}
		if(r2.isCheck()){
			System.out.println("r2 ��ü�� ���簢���Դϴ�.");
		}
		if(r3.isCheck()){
			System.out.println("r3 ��ü�� ���簢���Դϴ�.");
		}
	}
}
