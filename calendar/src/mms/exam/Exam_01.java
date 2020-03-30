package mms.exam;
import java.util.Calendar;
public class Exam_01 {
	public static void main(String[] ar){
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		Calendar cal2=Calendar.getInstance();
		cal2.set(2017, 1,1);
		System.out.println(cal.after(cal2));
		
	}
}
