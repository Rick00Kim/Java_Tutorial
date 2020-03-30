package student.score;

// 한명의 학생에 대한 성적을 저장하기 위한 클래스 : 자바'빈'

public class Student {
	// 멤버 필드
	private String id;			// 학번
	private String name;		// 이름
	private int kor, eng, math, tot;
	private double avg;
	
	// 생성자 메서드
	public Student(){}
	
	public Student(String id, String name, int kor, int eng, int math){
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		calculator();
	}
	
	// 멤버 메서드
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
	
	//toString() 오버라이딩
	public String toString(){
		return String.format("id : %s, name : %s, kor : %d, eng : %d, math : %d, tot : %d, avg : %.2f\n", id,name,kor,eng,math,tot,avg);
		/*return "id : " + id + " , name : " + name + " , kor : " + kor 
				+ " , eng : " + eng + " , math : " + math + " , tot : " + tot + " , avg : " + avg;*/
	}
}
