import java.io.*;
public class StudentManager {
	BufferedReader in;
	Ex std[];
	int cnt=0;
	
	public StudentManager(){
		in =new BufferedReader(new InputStreamReader(System.in));
		std=new Ex[100];
		cnt=0;
	}
	
	public void showMenu(){
		System.out.println("<����ó�����α׷�>");
		System.out.println(" 1. �л����");
		System.out.println(" 2. �����˻�");
		System.out.println(" 3. ��������");
		System.out.println(" 4. ��ü�л� ��������");
		System.out.println(" 5. ����");
	}
	public void newStudent()throws IOException{
		System.out.print("�й� - ");
		int num=Integer.parseInt(in.readLine());
		System.out.print("�̸� - ");
		String name=in.readLine();
		System.out.println("���� - ");
		int kor=Integer.parseInt(in.readLine());
		System.out.print("���� - ");
		int eng=Integer.parseInt(in.readLine());
		System.out.print("���� - ");
		int math=Integer.parseInt(in.readLine());
		std[cnt++]=new Ex(num,name,kor,eng,math);
	}
	
	public void findStd()throws IOException{
		System.out.print("�˻��� �л��� �̸��� �Է��Ͻÿ�. - ");
		String name=in.readLine();
//		while(name!=std[cnt].getName())
		for(int i=0;i<cnt;i++){
			if(name.equals(std[i].getName())){
				std[i].show();
				return;
			}
//			}else{
//				System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
		}
		System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
	}
	public void editStd()throws IOException{
		System.out.print("������ �л��� �̸��� �Է��Ͻÿ�. - ");
		String name=in.readLine();
//		while(name!=std[cnt].getName())
		for(int i=0;i<cnt;i++){
			if(name.equals(std[i].getName())){
				System.out.print("�����й� : "+std[i].getNum());
				return;
			}
		}
		System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
	}
	public void showAll(){
		
	}
}
