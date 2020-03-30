package mms.check.util;
import java.io.*;
public class ConsoleUtils {
	
	public void startMsg(String msg){
		System.out.println(msg+" ä���Դϴ�");
	}
	public void inputFailMessage(){
		System.out.println("�߸��� �Է��Դϴ� ó������ �ٽý����Ͻʽÿ�");
	}
	public char getType() throws IOException{
		System.out.print("�������� �Է� -> ");
		char cli=(char)System.in.read();
		System.in.read();System.in.read();
		return cli;
	}
	public char getHowCheck() throws IOException{
		System.out.print("�Է�����(1�� : �ѹ�����, 2�� : 5������) ");
		char cli=(char)System.in.read();
		System.in.read();System.in.read();
		return cli;
	}
	public void scoreCheck(int[][] correct,String msg)throws IOException{
		String[] subName=null;
		if(msg.equals("����ó�����"))
			subName=new String[]{"�����ͺ��̽�","���ڰ���","�ü��","����Ʈ�������","���������"};
		else if(msg.equals("����ó��������"))		
			subName=new String[]{"�����ͺ��̽�","���ڰ���","�ý��ۺм�����","�ü��","������Ű���"};
		else
			return;				

		int[] subSum=new int[5];
		int proNum=1;
		System.out.println("�� �ھ� �Է����ֽʽÿ�.");
		for(int i=0;i<correct.length;i++){
			int cli;
			System.out.println(subName[i]);
			for(int j=0;j<correct[i].length;j++){
				System.out.print(proNum+"�� -> ");
				cli=System.in.read()-'0';
				System.in.read();System.in.read();
				if(cli==correct[i][j])
					subSum[i]++;
				proNum++;
			}
			System.out.println(subName[i]+" - "+subSum[i]+"��");
		}
		int total=0;
		for(int i=0;i<subSum.length;i++){
			System.out.println(subName[i]+" - "+subSum[i]+"��");
			total+=subSum[i];
		}
		if(subSum[0]>7&&subSum[1]>7&&subSum[2]>7&&subSum[3]>7&&subSum[4]>7&&total>=60){
			System.out.println("���� = "+total);
		}else
			System.out.println("������ ����սô� ���ٷ�");
	}
	public void scoreCheckF(int[][] correct,String msg)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String[] subName=null;
		if(msg.equals("����ó�����"))
			subName=new String[]{"�����ͺ��̽�","���ڰ���","�ü��","����Ʈ�������","���������"};
		else if(msg.equals("����ó��������"))		
			subName=new String[]{"�����ͺ��̽�","���ڰ���","�ý��ۺм�����","�ü��","������Ű���"};
		else
			return;
		int[] subSum=new int[5];
		int total=0;
		System.out.println("�ټ� �ھ� �Է����ֽʽÿ�.");
		for(int i=0;i<subName.length;i++){
			System.out.println(subName[i]);
			String cli_temp="";
			int[] subScore=new int[20];
			for(int j=0;j<4;j++){
				System.out.print(((i*20)+(j*5)+1)+"�� ~ "+((i*20)+(j*5)+5)+"�� -> \t");
				String tmp=in.readLine();
				cli_temp+=tmp;
			}
			char[] cl=cli_temp.toCharArray();
			for(int j=0;j<subScore.length;j++){
				subScore[j]=cl[j]-'0';
			}
			for(int j=0;j<correct[i].length;j++){
				if(subScore[j]==correct[i][j])
					subSum[i]++;
			}
//			System.out.println(subName[i]+" - "+subSum[i]+"��");
		}
		for(int i=0;i<subName.length;i++){
			System.out.println(subName[i]+" - "+subSum[i]+"��");
			total+=subSum[i];
		}
		if(subSum[0]>7&&subSum[1]>7&&subSum[2]>7&&subSum[3]>7&&subSum[4]>7&&total>=60){
			System.out.println("���� = "+total);
		}else
			System.out.println("������ ����սô� ���ٷ�");
	}
}
