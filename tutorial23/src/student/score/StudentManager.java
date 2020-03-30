package student.score;

import java.util.ArrayList;
import java.io.*;

// ó������� �����ϱ� ���� Ŭ���� 
// >_</ ���ƾƾ� \>_<
// �϶�� �ڵ��� ���ϰ� ������!
// �Ф��� ������

public class StudentManager {
	// ����ʵ�
	ArrayList<Student> list;
	BufferedReader in;
	
	// ������ �޼���
	public StudentManager(){
		list = new ArrayList<Student>();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// ��� �޼��� - ó����ɺ� �޼��� ������
	public void showMenu(){
		System.out.println("\n==== �л����� ���α׷� ====");
		System.out.println("1. �л��������");
		System.out.println("2. �л������˻�");
		System.out.println("3. �л���������");
		System.out.println("4. �л���������");
		System.out.println("5. �л��������");
		System.out.println("6. ���α׷�����");
		System.out.println("=============================");
		System.out.print("���� = ");
	}
	
	public void addStudent() throws IOException{
		System.out.println("\n==== �л�������� ====");
		System.out.print("�й� = ");
		String id = in.readLine();
		System.out.print("�̸� = ");
		String name = in.readLine();
		System.out.print("���� = ");
		int kor = Integer.parseInt(in.readLine()); 
		System.out.print("���� = ");
		int eng = Integer.parseInt(in.readLine()); 
		System.out.print("���� = ");
		int math = Integer.parseInt(in.readLine());
		
		Student stu = new Student(id, name, kor, eng, math);
		list.add(stu);
	}
	
	public void search() throws IOException{
		System.out.println("\n==== �л������˻� ====");
		System.out.println("�˻��� �л��� �й��� �Է��ϼ���.");
		System.out.print("�й� = ");
		String id = in.readLine();
		int index = searchId(id);
		if(index == -1){
			System.out.println("�Է��� �й��� �ش��ϴ� �л��� �������� �ʽ��ϴ�.");
		}else{
			Student stu = list.get(index);
			System.out.println(stu);
		}
	}
	
	public void modify() throws IOException{
		System.out.println("\n==== �л��������� ====");
		System.out.println("������ �л��� �й��� �Է��ϼ���.");
		System.out.print("�й� = ");
		String id = in.readLine();
		int index = searchId(id);
		
		if(index == -1){
			System.out.println("�Է��� �й��� �ش��ϴ� �л��� �������� �ʽ��ϴ�.");
		}else{
			Student stu = list.get(index);
			System.out.print("�������� : " + stu.getKor() + " , �������� = ");
			int kor = Integer.parseInt(in.readLine());
			System.out.print("�������� : " + stu.getEng() + " , �������� = ");
			int eng = Integer.parseInt(in.readLine());
			System.out.print("�������� : " + stu.getMath() + " , �������� = ");
			int math = Integer.parseInt(in.readLine());
			
			Student imsi = new Student(stu.getId(), stu.getName(), kor, eng, math);
			list.add(imsi);			
			list.remove(stu);
		}
	}
	
	public void delete() throws IOException {
		System.out.println("\n===�л����� ���� ===");
		System.out.println("������ �л��� �й��� �Է��Ͻÿ� ");
		System.out.print("�й� = ");
		String id = in.readLine();
		
		int index = searchId(id);
		if(index == -1){
			System.out.println("�Է��� �й��� �ش��ϴ� �л��� �������� �ʽ��ϴ�.");
		}else{			
			list.remove(index);
		}
	}
	
	private int searchId(String id){
		//Student stu = null;
		int index = -1; // -1(�������)
		
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
