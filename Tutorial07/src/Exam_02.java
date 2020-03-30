/**
 * ���������迭�� Ư¡
 * 1. �迭���� Reference ��ü�̴�.
 * 2. �迭���� 4byte ��ü�̴�.
 * 3. �迭�� ���̴� length �Ӽ��� �̿��� �� �ִ�.
 * 4. �迭�� ���� �����ʹ� Heap������ ����ȴ�.
 *    new �������� �ǹ� - Heap�� �Ҵ��Ѷ�� �ǹ�
 * 5. Garbage Collection�� ���� �Ҹ�ȴ�.
 * 6. �� ������ ÷�ڷ� ���еȴ�.(÷�ڴ� 0���� ���۵ȴ�.)
 * 7. ������ ���� �ڵ����� Default �ʱ�ȭ�ȴ�.
 * 8. �������� �Ҵ�ȴ�.
 */
/*
 * ������ ���� �۾��� �����ϴ� ���α׷� ����
 * �Է¹��� ������ ���� = n
 * ���� = AAABCCDEFF
 * 
 * A=3��
 * B=1��
 * C=2��
 * D=1��
 * E=1��
 * F=2��
 * ~
 * Z=0��
 * ó������
 * 1. ���α׷� ���۽� ó���� ������ ������ �Է¹޾� �迭�� ����
 * 2. �Է¹��� ���ڵ��� �� ���ĺ������� ������ �Բ� ��µǵ���
 */
import java.io.*;
public class Exam_02 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int cnt=0;
		char[] client;
		int[] alpha=new int[26];//0:A, 1:B, 2:C, 3:D......25:Z
		System.out.print("���� ���� =");
		cnt=Integer.parseInt(in.readLine());
		client=new char[cnt];
		System.out.print("���� = ");
		for(int i=0;i<cnt;i++){
			client[i]=(char)System.in.read();
		}
		//�� �Էµ� ������ ������ alpha�迭�� ��� �۾�
		//�Է¹��� ���ڰ� A=>alpha[0]++; alpha[0]=alpha[0]+1
		//A=65, B=66, C=67
		//alpha[client[i]-65]
		for(int i=0;i<client.length;i++){
			for(int j=0;j<alpha.length;j++){
				if(client[i]-65==j){
					alpha[j]++;
				break;
				}
			}
		}
		/*for(int i=0;i<client.length;i++){
			alpha[client[i]-65]++;
		}*/
		for(int i=0;i<alpha.length;i++){
			System.out.println((char)(i+65)+" = "+alpha[i]);
		}
	}
}
