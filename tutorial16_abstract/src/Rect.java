import java.io.*;
public class Rect extends Point{
	public int h;
	public int w;
	
	@Override
	public void input() throws IOException {
		// TODO Auto-generated method stub
		System.out.print("x - ");
		x=Integer.parseInt(in.readLine());
		System.out.print("y - ");
		y=Integer.parseInt(in.readLine());
		System.out.print("h - ");
		h=Integer.parseInt(in.readLine());
		System.out.print("w - ");
		w=Integer.parseInt(in.readLine());
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("====Rect====");
		System.out.println("h : "+h+", w : "+w);
	}
}