/**
 * 
 */
public class Exam_02 {
	public static int add(int a, int b){ // int a=x,int b=y;
		return a+b;
	}
	public static void main(String[] ar){
		int x=10,y=7,rst=0;
		rst=add(x,y);  // Call By Value
		System.out.println(x+" + "+y+" = "+rst);
	}
}
