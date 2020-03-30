
public class Exam_04 {
	public static void main(String[] ar){
		//String 클래스 - 불변객체(내용을 변경할 수 없다.)
		String str=new String("JAVA");
		//내용이 바뀔때마다 새 인스턴스를 생성한다.
		str="HELLO";
		str+="JAVA";
		System.out.println(str);
	}
}
