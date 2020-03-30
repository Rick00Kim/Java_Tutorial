/*
 * abstract(�߻�) : ���赵(������)
 * 
 * 1. abstract Ŭ����
 *    - abstract �޼��带 �����ϰ� �ִ� Ŭ������ ������ ǥ������ ����ؾ��Ѵ�.
 *    - ��ü�� �߻���ų �� ���� ���� �����ϸ� �Ϲ� Ŭ������ �����ϴ�.
 *    
 * 2. abstract �޼���
 *    - �޼����� ����ΰ� ���ǵ��� ���� ���·� ��(������)�������� ���Ǵ� �޼���
 *    - �ݵ�� �������̵�(������) �Ǿ�� ����� �� �ִ�.
 */

import java.io.*;
abstract class Calculator{
	public abstract int sum(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
}
class MyCalculator extends Calculator{

	public int sum(int x, int y) {
		
		return x+y;
	}

	public int sub(int x, int y) {
		
		return x-y;
	}

	public int mul(int x, int y) {
		
		return x*y;
	}

	public int div(int x, int y) {
		
		return x/y;
	}
}
class FriendCalculator extends Calculator{


	public int sum(int x, int y) {
		return x+y;
	}

	public int sub(int x, int y) {
		return x-y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public int div(int x, int y) {
		return x/y;
	}
	
}
public class Exam_04 {
	public static void main(String[] ar){
		int x=10,y=20,rst=0;
		Calculator cal=new MyCalculator();
		
		
		System.out.println(x+" + "+y+" = "+rst);
	}
}
