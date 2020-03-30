package calculator;

public class Mycalculator implements Calculator{
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x, int y){
		try {
			throw new InvalidateException("Not Yet");
		} catch (InvalidateException e) {
			e.printStackTrace();
		}
		return x-y;
	}
	public int multi(int x, int y){
		return x*y;
	}
	public int div(int x, int y){
		return x/y;
	}
}
