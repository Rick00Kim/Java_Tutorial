package student.score;

import java.util.ArrayList;
import java.io.*;

// 처리기능을 구현하기 위한 클래스 
// >_</ 꺄아아아 \>_<
// 하라는 코딩은 안하고 ㅍㅁㅍ!
// ㅠㅁㅠ 엉엉엉

public class StudentManager {
	// 멤버필드
	ArrayList<Student> list;
	BufferedReader in;
	
	// 생성자 메서드
	public StudentManager(){
		list = new ArrayList<Student>();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// 멤버 메서드 - 처리기능별 메서드 구현부
	public void showMenu(){
		System.out.println("\n==== 학생관리 프로그램 ====");
		System.out.println("1. 학생성적등록");
		System.out.println("2. 학생성적검색");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적출력");
		System.out.println("6. 프로그램종료");
		System.out.println("=============================");
		System.out.print("선택 = ");
	}
	
	public void addStudent() throws IOException{
		System.out.println("\n==== 학생성적등록 ====");
		System.out.print("학번 = ");
		String id = in.readLine();
		System.out.print("이름 = ");
		String name = in.readLine();
		System.out.print("국어 = ");
		int kor = Integer.parseInt(in.readLine()); 
		System.out.print("영어 = ");
		int eng = Integer.parseInt(in.readLine()); 
		System.out.print("수학 = ");
		int math = Integer.parseInt(in.readLine());
		
		Student stu = new Student(id, name, kor, eng, math);
		list.add(stu);
	}
	
	public void search() throws IOException{
		System.out.println("\n==== 학생성적검색 ====");
		System.out.println("검색할 학생의 학번을 입력하세요.");
		System.out.print("학번 = ");
		String id = in.readLine();
		int index = searchId(id);
		if(index == -1){
			System.out.println("입력한 학번에 해당하는 학생이 존재하지 않습니다.");
		}else{
			Student stu = list.get(index);
			System.out.println(stu);
		}
	}
	
	public void modify() throws IOException{
		System.out.println("\n==== 학생성적수정 ====");
		System.out.println("수정할 학생의 학번을 입력하세요.");
		System.out.print("학번 = ");
		String id = in.readLine();
		int index = searchId(id);
		
		if(index == -1){
			System.out.println("입력한 학번에 해당하는 학생이 존재하지 않습니다.");
		}else{
			Student stu = list.get(index);
			System.out.print("이전국어 : " + stu.getKor() + " , 수정국어 = ");
			int kor = Integer.parseInt(in.readLine());
			System.out.print("이전영어 : " + stu.getEng() + " , 수정영어 = ");
			int eng = Integer.parseInt(in.readLine());
			System.out.print("이전수학 : " + stu.getMath() + " , 수정수학 = ");
			int math = Integer.parseInt(in.readLine());
			
			Student imsi = new Student(stu.getId(), stu.getName(), kor, eng, math);
			list.add(imsi);			
			list.remove(stu);
		}
	}
	
	public void delete() throws IOException {
		System.out.println("\n===학생성적 삭제 ===");
		System.out.println("삭제할 학생의 학번을 입력하시오 ");
		System.out.print("학번 = ");
		String id = in.readLine();
		
		int index = searchId(id);
		if(index == -1){
			System.out.println("입력한 학번에 해당하는 학생이 존재하지 않습니다.");
		}else{			
			list.remove(index);
		}
	}
	
	private int searchId(String id){
		//Student stu = null;
		int index = -1; // -1(존재안함)
		
		for(int i = 0; i < list.size(); i++){
			if(id.equals(list.get(i).getId())){
				//stu = list.get(i);
				index = i;
			}
		}				
		return index;
	}
	
	public void showAllStudent(){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
}
