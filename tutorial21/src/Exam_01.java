

class A{
	
}

public class Exam_01 { //extends Object
	public static void main(String[] ar){
		A ap=new A();
		A bp=new A();
		
		System.out.println(ap.getClass());
		System.out.println(ap.hashCode());
		System.out.println(ap.toString());
		System.out.println();
		System.out.println(bp.getClass());
		System.out.println(bp.hashCode());
		System.out.println(bp.toString());
	}
}
