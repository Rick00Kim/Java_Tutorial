/*
 * ���ڰ������α׷�
 * ���� �־��� ���α׷��� �����ϵ��� �����Ͻÿ�.
 * <�Է� �� �������>
 * �۾�[1.���� 2.��� 3.���Ǻ��� 4.����]
 * ���� =1 
 * ������ ����?=
 * ������ �̸�?=
 * 
 * �۾�[1.���� 2.��� 3.���Ǻ��� 4.����]
 * ���� =2
 * ����濡 ���? =
 * 
 * �۾�[1.���� 2.��� 3.���Ǻ��� 4.����]
 * ���� =3
 * 0���� : ������= ȫ�浿
 * 1���� : ������ = �庸��
 *  
 * <ó������>
 * 1.���ڽü��� ������ ���� ������ 5���� �����Ͽ� ����
 * 2. �� �濡�� ���� �̸��� ��Ƽ� ����.
 *    �� ��, ���ȣ�� �迭�� �ε��� �̿�
 * 3. ������ �������� ���� ���ȣ�� �Է��Ͽ��ų� �̹� ���� ������ ���¶�� �ٽ� ���ȣ�� ���´�.
 * 4. ��ǽ� �������� �ʰų� �̹� ����� �� ������ ���, ���ȣ�� �ٽ� ���´�.
 * 5. ����ڰ� ���ϴ� �۾��� �����Ͽ� ������ �� �ֵ��� �����Ѵ�.
 * 6. ���Ḧ �����ϱ� ������ ���α׷��� ���� loop
 * 
 */
import java.io.*;
public class HomeWork {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//		String[] name;
//		int room=0;
		char cli=0;
		
		do{
			System.out.printf("1.Booking   (b) \n2.Check Out (c) "
					+ "\n3.Room list (l) \n4.Exit      (x) \n");
			System.out.print("==Choose Function -> ");
			cli=(char)(System.in.read());
			in.readLine();
			//Make Room
			switch(cli){
			case '1': case 'b': case 'B':
				System.out.println("Booking service");			
				
				break;
			case '2': case 'c': case 'C':
				System.out.println("Check Out");
				
				break;
			case '3': case 'l': case 'L':
				System.out.println("Room list");

				break;
			}
			System.out.println();
		}while(cli!='4' && cli!='x' && cli!='X');
		
		System.out.println("Exit Program.....");
	}
}
