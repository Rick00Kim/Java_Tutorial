
public class Exam_02 {
	public static void main(String[] ar){
		System.out.write(65);
		System.out.flush();//버퍼의 내용을 강제로 출력.
		System.out.println();//개행-단순히 줄바꿈을 수행할때.
		System.out.print(3.14f);
		System.out.print("Korea");
		System.out.print(100);
		System.out.print('\n');
		System.out.println("자바 공부 합시다.");
		System.out.println(42.195);
		System.out.printf("%6d\n", 5000);
		System.out.printf("%.2f\n",42.195);
		int x=100;
		float y=3.14528f;
		String str="JAVA";
		char z='A';
		System.out.printf("x = %d\n",x);
		System.out.printf("y = %f\n", y);
		System.out.printf("f = %.2f\n", y);
		System.out.printf("str = %s\n",str);
		System.out.printf("z = %c\n", z);
	}
}
