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
			System.out.println("1.투숙 2.퇴실 3.객실보기 4.종료");
			System.out.print("선택 = ");
			int check=Integer.parseInt(in.readLine());
			
			switch(check){
			case 1:
			{
				int a=0;//입력받은 방번호를 저장할 변수
				do{
					System.out.print("투숙할 방번호 = ");
					a=Integer.parseInt(in.readLine());
				}while(a<0 ||a>=room || name[a]!=null);
				System.out.print("투숙객 이름 : ");
				name[a]=in.readLine();
			}
				break;
			case 2:
			{
				int a=0;
				do{
					System.out.print("퇴실할 방번호");
					a=Integer.parseInt(in.readLine());
					
				}while(a<0 || a>=room || name[a]==null);
				name[a]=null;
			}
				break;
			case 3:
				for(int i=0;i<name.length;i++){
					System.out.println(i+"번방 투숙객 : "+name[i]);
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("1 ~ 4만 입력");
			}
		}

	}

}
