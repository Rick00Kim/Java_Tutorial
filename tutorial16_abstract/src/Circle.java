
import java.io.*;
public class Circle extends Point{
	public int r;
	
	@Override
	public void input() throws IOException {
		System.out.print("x - ");
		x=Integer.parseInt(in.readLine());
		System.out.print("y - ");
		y=Integer.parseInt(in.readLine());
		System.out.print("r - ");
		r=Integer.parseInt(in.readLine());
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("===Circle===");
		System.out.println("Point ("+x+", "+y+")");
		System.out.println("r - "+r);
	}
}
