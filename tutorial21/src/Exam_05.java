
public class Exam_05 {
	public static void main(String[] ar){
		StringBuffer sb=new StringBuffer(8);
		System.out.println(sb.capacity());
		
		sb.append("My Name");
		System.out.println(sb.capacity());
		sb.append(" is ");
		System.out.println(sb.capacity());
		sb.append("JAVA");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("My name");
		System.out.println(sb.capacity());
		System.out.println(sb);
		//sb "My name" 추가 후 버퍼크기 출력;
	}
}
