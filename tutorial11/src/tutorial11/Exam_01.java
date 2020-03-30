package tutorial11;
/*
 * ��������� : this, static, final ����
 * 1. �ڱ� �ڽ��� ��ü�� �����ϴ� this
 * 		-this	-> super
 * 		-this()	-> super()
 * 		
 * 2. �����ʵ带 ���� static
 * 
 * 3. ��� �ʵ�� ������ ���� final
 * 
 * Class Type : Ŭ������ ����
 * 1. Entity Class = Model = DTO = VO = Java Bean
 *    -�ܼ��� �����͸��� ������ �������� �����Ǵ� Ŭ����
 *    
 * 2. Control Class = Handler Class = Action class
 *    - ���� ó���� ����ϴ� Ŭ����, main()�޼��带 ��� �ִ� Ŭ���� 
 */
class A{
	//��� �ʵ� -> ����������[���������] �ڷ��� ������; or ������=�ʱⰪ
	private int x;
	private int y;
	//������ �޼���	-> ��ü�� ������ ��, ����ʵ带 �ʱ�ȭ, �����ε�
	public A(){
		x=0;
		y=0;
	}
	public A(int x){
		this.x=x;
		y=0;
	}
	public A(int x,int y){
		this.x=x;
		this.y=y;
	}
	//��� �޼���
	public void disp(){
		System.out.println("x= "+this.x);
		System.out.println("y= "+this.y);
	}
	
}
public class Exam_01 {
	public static void main(String[] ar){
		//��ü ����  ��ü �迭
		A[] xp=new A[3];
		xp[0]=new A();
		xp[1]=new A(100);
		xp[2]=new A(100,200);
		for(int i=0;i<xp.length;i++)
			xp[i].disp();
		
	}
}
