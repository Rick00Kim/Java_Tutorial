
public class Exam_03 {
	public static void main(String[] ar){// callback �ż���(�ý����� ȣ��)
		int x=10,y=0,result=0;
		try{
		result=x/y;
		System.out.println("result = "+result);
		}catch(ArithmeticException e){
			System.out.println("You can not divide for 0");
		}

	}
}
