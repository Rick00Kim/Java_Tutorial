package process;

import java.io.*;

public class TestProcess {
	public static void main(String[] ar) throws IOException, InterruptedException{
		ProcessBuilder psb=new ProcessBuilder("C:\\KMPlayer\\KMPlayer.exe","Brandy you're a fine girl - Looking Glass.mp4");
			   try {
			   // create a new process
				   System.out.println("Creating Process...") ;
				   Process p = psb.start();

			   // cause this process to stop until process p is terminated
				   p.waitFor() ;

			   // when you manually close notepad.exe program will continue here
				   System.out.println("Waiting over.") ;

			   } catch (Exception ex) {
				   ex.printStackTrace() ;
			   }
	
	
	}
}