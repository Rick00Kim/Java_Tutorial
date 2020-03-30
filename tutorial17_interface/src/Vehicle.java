import java.io.*;
public class Vehicle {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int cli=0;
		Car c1=new Car();
//		c1.view_Status();
		System.out.println(c1);
		while(cli!=3){
			System.out.println("1.Accel 2.Break 3.Exit");
			System.out.print("function : ");
			cli=Integer.parseInt(in.readLine());
			switch(cli)
			{
			case 1:
				c1.up_spd();
				c1.view_Status();
				break;
			case 2:
				c1.down_spd();
				c1.view_Status();
				break;
			case 3:
				
				break;
			default:
				System.out.println("nono");	
				break;
			}
		}
		System.out.println("Trun off");
	}
	
	
}
