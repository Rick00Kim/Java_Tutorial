package tutorial10;
/*
 * 숙박관리 프로그램의 클래스화
 * 프로그램 시작시 층의 개수와 방의 개수를 입력받아 구현한다.
 */
import java.io.*;
public class Exam_06 {
	//멤버 필드
	private BufferedReader in;
	private int floor;
	private int room;
	private String[][] names;
	//생성자 메서드
	public Exam_06()throws IOException{
		in =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("층의 개수 = ");
		floor=Integer.parseInt(in.readLine());
		System.out.print("방의 개수 = ");
		room=Integer.parseInt(in.readLine());
		names=new String[floor][room];
	}
	public Exam_06(int floor, int room){
		in = new BufferedReader(new InputStreamReader(System.in));
		this.floor=floor;
		this.room=room;
		names=new String[this.floor][this.room];
	}
	public void process()throws IOException{
		while(true){
			System.out.println("1.투숙  2.퇴실 3.객실보기 4.종료");
			int chk=Integer.parseInt(in.readLine());
			if(chk==1){
				int f=0;
				int r=0;
				do{
					System.out.print("Floor : ");
					f=Integer.parseInt(in.readLine());
				}while(f<0||f>=floor);
				do{
					System.out.print("Room : ");
					r=Integer.parseInt(in.readLine());
				}while(r<0 || r>=room||names[f][r]!=null);
				System.out.print("Name : ");
				names[f][r]=in.readLine();
				
			}else if(chk==2){
				int f=0;
				int r=0;
				do{
					System.out.print("Floor : ");
					f=Integer.parseInt(in.readLine());
				}while(f<0||f>=floor);
				do{
					System.out.print("Roomg : ");
					r=Integer.parseInt(in.readLine());
				}while(r<0||r>=room||names[f][r]==null);
				names[f][r]=null;
				System.out.println(names[f][r]+" Check Out");
				
			}else if(chk==3){
				for(int i=0;i<names.length;i++){
					for(int j=0;j<names[i].length;j++){
						System.out.print(i+"-"+j+" ("+names[i][j]+")\t");
					}
					System.out.println();
				}
				
			}else if(chk==4){
				System.out.println("Exit Program.....");
				break;
			}else{
				System.out.println("선택이 올바르지 않습니다.");
			}
			System.out.println();
		}
	}
}
