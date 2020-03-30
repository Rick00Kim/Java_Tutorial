import java.io.*;
public class StudentManager {
	// ��� �ʵ�
	Student[] student;	// ��ü �迭
	int count;			// ��ü �迭�� �ε���
	BufferedReader in;
	
	// ������ �޼���
	public StudentManager(){
		in = new BufferedReader(new InputStreamReader(System.in));
		student = new Student[100];
		count = 0;
	}
	
	// ��� �޼���
	public void showMenu(){
		System.out.println("==== ����ó�� ���α׷� ====");
		System.out.println("1. �л��������");
		System.out.println("2. �л������˻�");
		System.out.println("3. �л���������");
		System.out.println("4. ��ü�л�����");
		System.out.println("5. ���α׷�����");
	}
	
	public void newStudent()throws IOException{ // �л��������
		System.out.println("==== �л�������� ====");
		System.out.print("�й� = ");
		int num = Integer.parseInt(in.readLine());
		System.out.print("�̸� = ");
		String name = in.readLine();
		System.out.print("���� = ");
		int kor = Integer.parseInt(in.readLine());
		System.out.print("���� = ");
		int eng = Integer.parseInt(in.readLine());
		System.out.print("���� = ");
		int math = Integer.parseInt(in.readLine());
		
		student[count++] = new Student(num, name, kor, eng, math);
		//count++;
	}
	
	public void findStudent() throws IOException{
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
		System.out.print("�̸� = ");
		String name = in.readLine();
		
		for(int i = 0; i < count; i++){
			if(name.equals(student[i].getName())){
				// �Է��� �̸��� �����Ѵٸ�.....
				student[i].show();
				return;
			}//else{
//				System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
//			}
		}
		System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
	}
	
	public void editStudent() throws IOException{
		System.out.println("������ �л��� �̸��� �Է��ϼ���.");
		System.out.print("�̸� = ");
		String name = in.readLine();
		
		for(int i = 0; i<count; i++){
			if(name.equals(student[i].getName())){
				//�Է��� �̸��� �����Ѵٸ�?
				System.out.print("�����й� : " + student[i].getNum());
				System.out.print("�����й� : ");
				int num = Integer.parseInt(in.readLine());
				student[i].setNum(num);
				System.out.print("�������� : " + student[i].getKor());
				System.out.print("���� = ");				
				int kor = Integer.parseInt(in.readLine());
				student[i].setKor(kor);
				System.out.print("�������� : " + student[i].getEng());
				System.out.print("���� = ");
				int eng = Integer.parseInt(in.readLine());
				student[i].setEng(eng);
				System.out.print("�������� : " + student[i].getMath());
				System.out.print("���� = ");
				int math = Integer.parseInt(in.readLine());	
				student[i].setMath(math);
				return;
			}
		}
		System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
	}
	
	public void showAllStudent(){
		
	}

}
