import java.io.*;
class Student{
	 BufferedReader in;
	 int num;
	 int[] subject=new int[4];
	 String[] sub_name=new String[]{"����","����","����"};
	 String name;
	 float avg=0.0f;
	 char grd;
	
	Student()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�й� = ");
		num=Integer.parseInt(in.readLine());
		System.out.print("���� = ");
		name=in.readLine();
		for(int i=0;i<subject.length-1;i++){
			do{
			System.out.print(sub_name[i]+" = ");
			subject[i]=Integer.parseInt(in.readLine());
			}while(subject[i]>100 || subject[i]<0);
			subject[3]+=subject[i];
		}
			avg=subject[3]/3.0f;
			switch((int)avg/10)
			{
			case 10:case 9:
				grd='A';
				break;
			case 8:
				grd='B';
				break;
			case 7:
				grd='C';
				break;
			case 6:
				grd='D';
				break;
			default:
				grd='F';	
				break;
			}
			System.out.println(name+"�� ������ ��ϵǾ����ϴ�.");
	}
	public void update()throws IOException{
		in=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<subject.length-1;i++){
			do{
			System.out.print("���� ���� : "+subject[i]+", ���� ���� : ");
			subject[i]=Integer.parseInt(in.readLine());
			}while(subject[i]>100 || subject[i]<0);
			subject[3]+=subject[i];
		}
			avg=subject[3]/3.0f;
			switch((int)avg/10)
			{
			case 10:case 9:
				grd='A';
				break;
			case 8:
				grd='B';
				break;
			case 7:
				grd='C';
				break;
			case 6:
				grd='D';
				break;
			default:
				grd='F';	
				break;
			}
	}
	public boolean find(String buf){
		if(name.equals(buf)==true)
		return true;
		else
		return false;
	}
	public char getGrd(){
		return grd;
	}

}
public class test_02 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Student[] std = new Student[5];
		char chk=0;
		int cnt=0;
		do{
			view_Menu();
			System.out.print("�޴� (1~5) = ");
			chk=(char)System.in.read();
			System.in.read();
			System.in.read();
			switch(chk)
			{
			case '1':
				std[cnt]=new Student();
				cnt++;
				break;
			case '2':
				int i=0;
				System.out.print("ã���� �̸� = ");
				for(i=0;i<std.length;i++){
					if(std[i].name.equals(in.readLine())==true){
						System.out.println("~~~");
					}else
						continue;
					break;
				}
				break;
			case '3':
				
				break;
			case '4':
				break;
			case '5':
				System.exit(0);
			default:
				System.out.println("�߸� �ԷµǾ����ϴ�.");	
			}
		}while(chk!='5');
	}
	static void view_Menu(){
		System.out.println("<����ó�����α׷�>");
		System.out.println("1. �л����");
		System.out.println("2. �����˻�");
		System.out.println("3. ��������");
		System.out.println("4. ��ü�л� ��������");
		System.out.println("5. ����");
	}
}
