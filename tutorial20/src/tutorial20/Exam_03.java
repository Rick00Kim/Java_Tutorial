package tutorial20;
import java.io.*;
/*
 * �߻�Ŭ���� : Shape
 *  - �߻�޼��� : draw
 *  
 * Ŭ���� Circle -> '�� �׸���'��� �޽����� ��µǰ�
 * Ŭ���� Rect -> '�簢�� �׸���'��� �޽����� ��µǰ�
 * Ŭ���� Tri -> '�ﰢ�� �׸���'��� �޽����� ��µǰ� 
 */
abstract class Shape{
	public abstract void draw();
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Draw Circle.....");
	}
}
class Rect extends Shape{
	public void draw(){
		System.out.println("Draw Rect.....");
	}
}
class Tri extends Shape{
	public void draw(){
		System.out.println("Draw Triangle.....");
	}
}
public class Exam_03 {
	public static void main(String[] ar)throws IOException{
		Shape[] sh=new Shape[10];
		char cli=0;
		int shape_index=0;
		while(true){
			System.out.print("->");
			cli=(char)System.in.read();
			System.in.read();System.in.read();
			switch(cli)
			{
			case '1':
				if(shape_index==sh.length){
					System.out.println("�� ��������");
					break;
				}
				sh[shape_index]=new Circle();
				sh[shape_index].draw();
				shape_index++;
				break;
			case '2':
				if(shape_index==sh.length){
					System.out.println("�� ��������");
					break;
				}
				sh[shape_index]=new Rect();
				sh[shape_index].draw();
				shape_index++;
				break;
			case '3':
				if(shape_index==sh.length){
					System.out.println("�� ��������");
					break;
				}
				sh[shape_index]=new Tri();
				sh[shape_index].draw();
				shape_index++;
				break;
			case '4':
				System.out.println("Exit Programm....");
				System.exit(0);
			}
		}
	}
}