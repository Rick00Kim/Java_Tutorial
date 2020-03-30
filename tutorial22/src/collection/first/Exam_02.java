package collection.first;
import java.util.*;
class Point{
	private int x,y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "Point(x,y) : ("+x+", "+y+")";
	}
	
}

public class Exam_02 {
	public static void main(String[] ar){
		Vector<Point> vp=new Vector<Point>();
		// vp에 객체 삽입 - 생성자를 이용.
		vp.add(new Point(2,3));
		vp.add(new Point(-5,20));
		vp.add(new Point(30,-8));
		//vp에 저장된 요소를 출력하는 작업
		pt(vp);
		
	}
	public static void pt(Vector vv){
		for(int i=0;i<vv.size();i++)
			System.out.println(vv.get(i));
	}
}
