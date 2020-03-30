package student.score;

// �Ѹ��� �л��� ���� ������ �����ϱ� ���� Ŭ���� : �ڹ�'��'

public class Student {
	// ��� �ʵ�
	private String id;			// �й�
	private String name;		// �̸�
	private int kor, eng, math, tot;
	private double avg;
	
	// ������ �޼���
	public Student(){}
	
	public Student(String id, String name, int kor, int eng, int math){
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		calculator();
	}
	
	// ��� �޼���
	public void calculator(){
		tot = kor + eng + math;
		avg = tot / 3.0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	//toString() �������̵�
	public String toString(){
		return String.format("id : %s, name : %s, kor : %d, eng : %d, math : %d, tot : %d, avg : %.2f\n", id,name,kor,eng,math,tot,avg);
		/*return "id : " + id + " , name : " + name + " , kor : " + kor 
				+ " , eng : " + eng + " , math : " + math + " , tot : " + tot + " , avg : " + avg;*/
	}
}
