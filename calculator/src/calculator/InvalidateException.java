package calculator;
//����� ���� ���� Ŭ����
public class InvalidateException extends Exception{
	private String msg;
	
	public InvalidateException(){
		msg="Not Yet....";
	}
	public InvalidateException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidateException(String message) {
		super(message);
	}
	
}
