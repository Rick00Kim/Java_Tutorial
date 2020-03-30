package tutorial10;
/*
 * ���ڰ��� ���α׷��� Ŭ����ȭ
 * ���α׷� ���۽� ���� ������ ���� ������ �Է¹޾� �����Ѵ�.
 */
import java.io.*;
public class Exam_06 {
	//��� �ʵ�
	private BufferedReader in;
	private int floor;
	private int room;
	private String[][] names;
	//������ �޼���
	public Exam_06()throws IOException{
		in =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���� = ");
		floor=Integer.parseInt(in.readLine());
		System.out.print("���� ���� = ");
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
			System.out.println("1.����  2.��� 3.���Ǻ��� 4.����");
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
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
			System.out.println();
		}
	}
}
