package study;

public class Exam_04 {
	enum Week{월,화,수,목,금,토}
	public static void main(String[] ar){
		int[] num={1,2,3,4,5};
		String[] name={"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for(int k:num)
			sum+=k;
		System.out.println("합은 : "+sum);
		
		for(String s:name)
			System.out.print(s+" ");
		System.out.println();
		
		for(Week day:Week.values())
			System.out.print(day+"요일 ");
		System.out.println();
		
	}
}
