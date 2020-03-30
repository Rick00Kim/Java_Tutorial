// �� ���� �л��� ������ ��� Ŭ���� Student
import java.io.*;
public class Student {
	// ��� �ʵ�
	private int num;
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	
	private static BufferedReader in;
	static{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// ������ �޼���
	public Student(){		
		
	}
	
	public Student(int num, String name, int kor, int eng, int math){
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		calculator();
	}
	
	// ��� �޼���
	private void calculator(){
		tot = kor + eng + math;
		avg = tot / 3.0f;
		
		switch((int)(avg/10)){
		case 10 :
		case 9 : grade = 'A';	break;
		case 8 : grade = 'B';	break;
		case 7 : grade = 'C';	break;
		case 6 : grade = 'D';	break;
		default : grade = 'F';	
		}
	}
	
	public void show(){
		System.out.println("num : " + num);
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("math : " + math);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
		System.out.println("grade : " + grade);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}	
	
}
