
public class Exam_02 {
	public static void main(String[] ar){
		String str1="ȫ�浿";
		String str2="ȫ�浿";
		
		if(str1==str2)
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
		String s1=new String("ȫ�浿");
		String s2=new String("ȫ�浿");
		String s3=s1;
		if(s1==s2)//������ ����Ű�� �ּҸ� ��
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
		if(s1.equals(s2))//������ ���� ���� ������ ��
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
		if(s1.equals(s3))
			System.out.println("����");
		else
			System.out.println("�ٸ���");
	}
}
