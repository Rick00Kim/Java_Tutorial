/*
 * �޴�
 * 1. �ִ밪
 * 2. ������
 * 3. ������
 * 4. ����
 * 5. �۾�����
 * 
 * ���� = 
 * 
 * 1. �ִ밪�� �����ϸ� �� ���� ������ �Է¹޾� ū ���� ��µǵ��� ����
 * 2. �������� �����ϸ� �� ���� ���� ���̿� �׸� ������ �ڿ������� ���� ����Ͽ� ���
 * 3. �������� �����ϸ� �� ���� ������ �Է¹޾� ū�������
 * 4. ���⸦ �����ϸ� �� ���� ������ �ϳ��� ������ �Է� ����.
 * 5. �۾����Ḧ �������� loop
 * 6. ����ڰ� ���ϴ� �۾� ����ϵ���
 */
import java.io.*;
public class TeamQuiz {
	public static void main(String[] ar)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char yn=0,cli=0;
		int num1=0,num2=0,rst=0,i=0;
		do{
			System.out.println("====Menu====");
			System.out.println("1. �ִ밪");
			System.out.println("2. ������");
			System.out.println("3. ������");
			System.out.println("4. ����");
			System.out.println("5. �۾�����");
			System.out.println("============");
			
			cli=(char)(System.in.read()-'0');
			in.readLine();
			switch(cli){
			case 1:
				System.out.println("�ִ밪");
				do{
				System.out.print("1st : ");
				num1=Integer.parseInt(in.readLine());
				System.out.print("2nd : ");
				num2=Integer.parseInt(in.readLine());
				if(num1>num2)
					System.out.println("Max - "+num1);
				else
					System.out.println("Max - "+num2);
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 2:
				System.out.println("������");
				do{
					rst=0;
					System.out.print("num1 - ");
					num1=Integer.parseInt(in.readLine());
					System.out.print("num2 - ");
					num2=Integer.parseInt(in.readLine());
					if(num1>num2){
						for(i=num2;i<=num1;i++)
							rst+=i;
					}
					else{
						for(i=num1;i<=num2;i++)
							rst+=i;	
					}
				System.out.println("������ : "+rst);
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 3:
				System.out.println("������");
				do{
					
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			case 4:
				System.out.println("����");
				do{
					
				System.out.println("Exit?(y/n)");
				yn=(char)System.in.read();
				in.readLine();
				}while(yn=='N'||yn=='n');
				break;
			}
		}while(cli!=5);
		System.out.println("Exit Program....");
	}
}
