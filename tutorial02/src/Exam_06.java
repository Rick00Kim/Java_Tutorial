
public class Exam_06 {
	public static void main(String[] ar){
		int x=100;
		long y=x;//Promotion(자동 형변환)
		byte z=(byte)x;
		
		char a=65;// =A
		short b=(short)a;// short -32768~32767
		
		byte c=100;
		short d=c;
		char e=(char)c;
		
		long f=100L;
		float g=f;
		
		float h=3.14f;
		long i=(long)h;
	}
}
