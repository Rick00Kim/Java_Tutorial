/*
 * �޼����� ����
 */
public class Exam_03 {
	public static boolean aaa(){
		return true;
	}
	public static void bbb(){
		System.out.println("�޼����� ���� �ǽ�");
	}
	public static int ccc(){
		return 34;
	}
	public static float ddd(float a){
		return a;
	}
	public static void eee(int x,int y){
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	public static void main(String[] ar){
		System.out.println("Main�� ����!");
		System.out.println(aaa());  //�޼��� aaa
		bbb();						//�޼��� bbb
		System.out.println(ccc());	//�޼��� ccc
		System.out.println(ddd(3.1416f));//�޼��� ddd
		eee(100,50);				//�޼��� eee
		System.out.println("Main�� ��!");
	}
	
}
