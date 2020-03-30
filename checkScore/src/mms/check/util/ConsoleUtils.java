package mms.check.util;
import java.io.*;
public class ConsoleUtils {
	
	public void startMsg(String msg){
		System.out.println(msg+" 채점입니다");
	}
	public void inputFailMessage(){
		System.out.println("잘못된 입력입니다 처음부터 다시시작하십시오");
	}
	public char getType() throws IOException{
		System.out.print("시험유형 입력 -> ");
		char cli=(char)System.in.read();
		System.in.read();System.in.read();
		return cli;
	}
	public char getHowCheck() throws IOException{
		System.out.print("입력유형(1번 : 한문제씩, 2번 : 5문제씩) ");
		char cli=(char)System.in.read();
		System.in.read();System.in.read();
		return cli;
	}
	public void scoreCheck(int[][] correct,String msg)throws IOException{
		String[] subName=null;
		if(msg.equals("정보처리기사"))
			subName=new String[]{"데이터베이스","전자계산기","운영체제","소프트웨어공학","데이터통신"};
		else if(msg.equals("정보처리산업기사"))		
			subName=new String[]{"데이터베이스","전자계산기","시스템분석설계","운영체제","정보통신개론"};
		else
			return;				

		int[] subSum=new int[5];
		int proNum=1;
		System.out.println("한 자씩 입력해주십시오.");
		for(int i=0;i<correct.length;i++){
			int cli;
			System.out.println(subName[i]);
			for(int j=0;j<correct[i].length;j++){
				System.out.print(proNum+"번 -> ");
				cli=System.in.read()-'0';
				System.in.read();System.in.read();
				if(cli==correct[i][j])
					subSum[i]++;
				proNum++;
			}
			System.out.println(subName[i]+" - "+subSum[i]+"개");
		}
		int total=0;
		for(int i=0;i<subSum.length;i++){
			System.out.println(subName[i]+" - "+subSum[i]+"개");
			total+=subSum[i];
		}
		if(subSum[0]>7&&subSum[1]>7&&subSum[2]>7&&subSum[3]>7&&subSum[4]>7&&total>=60){
			System.out.println("총점 = "+total);
		}else
			System.out.println("다음을 기약합시다 간바레");
	}
	public void scoreCheckF(int[][] correct,String msg)throws IOException{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String[] subName=null;
		if(msg.equals("정보처리기사"))
			subName=new String[]{"데이터베이스","전자계산기","운영체제","소프트웨어공학","데이터통신"};
		else if(msg.equals("정보처리산업기사"))		
			subName=new String[]{"데이터베이스","전자계산기","시스템분석설계","운영체제","정보통신개론"};
		else
			return;
		int[] subSum=new int[5];
		int total=0;
		System.out.println("다섯 자씩 입력해주십시오.");
		for(int i=0;i<subName.length;i++){
			System.out.println(subName[i]);
			String cli_temp="";
			int[] subScore=new int[20];
			for(int j=0;j<4;j++){
				System.out.print(((i*20)+(j*5)+1)+"번 ~ "+((i*20)+(j*5)+5)+"번 -> \t");
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
//			System.out.println(subName[i]+" - "+subSum[i]+"개");
		}
		for(int i=0;i<subName.length;i++){
			System.out.println(subName[i]+" - "+subSum[i]+"개");
			total+=subSum[i];
		}
		if(subSum[0]>7&&subSum[1]>7&&subSum[2]>7&&subSum[3]>7&&subSum[4]>7&&total>=60){
			System.out.println("총점 = "+total);
		}else
			System.out.println("다음을 기약합시다 간바레");
	}
}
