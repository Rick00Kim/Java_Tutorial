package study;

public class Exam_04 {
	enum Week{��,ȭ,��,��,��,��}
	public static void main(String[] ar){
		int[] num={1,2,3,4,5};
		String[] name={"���","��","�ٳ���","ü��","����","����"};
		int sum=0;
		for(int k:num)
			sum+=k;
		System.out.println("���� : "+sum);
		
		for(String s:name)
			System.out.print(s+" ");
		System.out.println();
		
		for(Week day:Week.values())
			System.out.print(day+"���� ");
		System.out.println();
		
	}
}
