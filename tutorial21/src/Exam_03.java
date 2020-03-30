class ToStringTest{
	String name;
	int kor;
	int eng;
	int math;
	
	ToStringTest(String name,int kor,int eng,int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String toString(){
		return "name : "+name+", kor : "+kor+", eng : "
				+"math : "+math;
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		ToStringTest obj1=new ToStringTest("홍길동",60,50,90);
		ToStringTest obj2=new ToStringTest("이순신",50,80,90);
		ToStringTest obj3=new ToStringTest("장보고",20,30,40);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}

