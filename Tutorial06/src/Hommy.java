import java.io.*;
public class Hommy {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] name;
		int room=0;
		
		System.out.print("Room Length : ");
		room =Integer.parseInt(in.readLine());
		name=new String[room];
		while(true){
			System.out.println("1.���� 2.��� 3.���Ǻ��� 4.����");
			System.out.print("���� = ");
			int check=Integer.parseInt(in.readLine());
			
			switch(check){
			case 1:
			{
				int a=0;//�Է¹��� ���ȣ�� ������ ����
				do{
					System.out.print("������ ���ȣ = ");
					a=Integer.parseInt(in.readLine());
				}while(a<0 ||a>=room || name[a]!=null);
				System.out.print("������ �̸� : ");
				name[a]=in.readLine();
			}
				break;
			case 2:
			{
				int a=0;
				do{
					System.out.print("����� ���ȣ");
					a=Integer.parseInt(in.readLine());
					
				}while(a<0 || a>=room || name[a]==null);
				name[a]=null;
			}
				break;
			case 3:
				for(int i=0;i<name.length;i++){
					System.out.println(i+"���� ������ : "+name[i]);
				}
				break;
			case 4:
				System.out.println("���α׷� ����");
				System.exit(0);
			default:
				System.out.println("1 ~ 4�� �Է�");
			}
		}

	}

}
