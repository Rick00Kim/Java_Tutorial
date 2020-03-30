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
		System.out.println("<성적처리프로그램>");
		System.out.println(" 1. 학생등록");
		System.out.println(" 2. 성적검색");
		System.out.println(" 3. 성적수정");
		System.out.println(" 4. 전체학생 성적보기");
		System.out.println(" 5. 종료");
	}
	public void newStudent()throws IOException{
		System.out.print("학번 - ");
		int num=Integer.parseInt(in.readLine());
		System.out.print("이름 - ");
		String name=in.readLine();
		System.out.println("국어 - ");
		int kor=Integer.parseInt(in.readLine());
		System.out.print("영어 - ");
		int eng=Integer.parseInt(in.readLine());
		System.out.print("수학 - ");
		int math=Integer.parseInt(in.readLine());
		std[cnt++]=new Ex(num,name,kor,eng,math);
	}
	
	public void findStd()throws IOException{
		System.out.print("검색할 학생의 이름을 입력하시오. - ");
		String name=in.readLine();
//		while(name!=std[cnt].getName())
		for(int i=0;i<cnt;i++){
			if(name.equals(std[i].getName())){
				std[i].show();
				return;
			}
//			}else{
//				System.out.println("입력한 이름은 존재하지 않습니다.");
		}
		System.out.println("입력한 이름은 존재하지 않습니다.");
	}
	public void editStd()throws IOException{
		System.out.print("수정할 학생의 이름을 입력하시오. - ");
		String name=in.readLine();
//		while(name!=std[cnt].getName())
		for(int i=0;i<cnt;i++){
			if(name.equals(std[i].getName())){
				System.out.print("이전학번 : "+std[i].getNum());
				return;
			}
		}
		System.out.println("입력한 이름은 존재하지 않습니다.");
	}
	public void showAll(){
		
	}
}
