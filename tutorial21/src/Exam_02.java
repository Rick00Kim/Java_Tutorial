
public class Exam_02 {
	public static void main(String[] ar){
		String str1="홍길동";
		String str2="홍길동";
		
		if(str1==str2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		String s1=new String("홍길동");
		String s2=new String("홍길동");
		String s3=s1;
		if(s1==s2)//변수를 가르키는 주소를 비교
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(s1.equals(s2))//참조된 변수 안의 내용을 비교
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(s1.equals(s3))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
