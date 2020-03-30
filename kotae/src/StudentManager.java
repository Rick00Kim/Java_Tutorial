import java.io.*;
public class StudentManager {
	// 멤버 필드
	Student[] student;	// 객체 배열
	int count;			// 객체 배열의 인덱스
	BufferedReader in;
	
	// 생성자 메서드
	public StudentManager(){
		in = new BufferedReader(new InputStreamReader(System.in));
		student = new Student[100];
		count = 0;
	}
	
	// 멤버 메서드
	public void showMenu(){
		System.out.println("==== 성적처리 프로그램 ====");
		System.out.println("1. 학생성적등록");
		System.out.println("2. 학생성적검색");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 전체학생성적");
		System.out.println("5. 프로그램종료");
	}
	
	public void newStudent()throws IOException{ // 학생성적등록
		System.out.println("==== 학생성적등록 ====");
		System.out.print("학번 = ");
		int num = Integer.parseInt(in.readLine());
		System.out.print("이름 = ");
		String name = in.readLine();
		System.out.print("국어 = ");
		int kor = Integer.parseInt(in.readLine());
		System.out.print("영어 = ");
		int eng = Integer.parseInt(in.readLine());
		System.out.print("수학 = ");
		int math = Integer.parseInt(in.readLine());
		
		student[count++] = new Student(num, name, kor, eng, math);
		//count++;
	}
	
	public void findStudent() throws IOException{
		System.out.println("검색할 학생의 이름을 입력하세요.");
		System.out.print("이름 = ");
		String name = in.readLine();
		
		for(int i = 0; i < count; i++){
			if(name.equals(student[i].getName())){
				// 입력한 이름이 존재한다면.....
				student[i].show();
				return;
			}//else{
//				System.out.println("입력한 이름은 존재하지 않습니다.");
//			}
		}
		System.out.println("입력한 이름은 존재하지 않습니다.");
	}
	
	public void editStudent() throws IOException{
		System.out.println("수정할 학생의 이름을 입력하세요.");
		System.out.print("이름 = ");
		String name = in.readLine();
		
		for(int i = 0; i<count; i++){
			if(name.equals(student[i].getName())){
				//입력한 이름이 존재한다면?
				System.out.print("이전학번 : " + student[i].getNum());
				System.out.print("수정학번 : ");
				int num = Integer.parseInt(in.readLine());
				student[i].setNum(num);
				System.out.print("이전국어 : " + student[i].getKor());
				System.out.print("국어 = ");				
				int kor = Integer.parseInt(in.readLine());
				student[i].setKor(kor);
				System.out.print("이전영어 : " + student[i].getEng());
				System.out.print("영어 = ");
				int eng = Integer.parseInt(in.readLine());
				student[i].setEng(eng);
				System.out.print("이전수학 : " + student[i].getMath());
				System.out.print("수학 = ");
				int math = Integer.parseInt(in.readLine());	
				student[i].setMath(math);
				return;
			}
		}
		System.out.println("입력한 이름은 존재하지 않습니다.");
	}
	
	public void showAllStudent(){
		
	}

}
