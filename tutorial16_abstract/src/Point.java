/*
 * �ֻ��� Ŭ���� : ���� �߻�ȭ�ϴ� Ŭ����
 */
import java.io.*;
public abstract class Point {
	protected int x;
	protected int y;
	protected static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	public abstract void input()  throws IOException;
	
	public abstract void output();
	
}