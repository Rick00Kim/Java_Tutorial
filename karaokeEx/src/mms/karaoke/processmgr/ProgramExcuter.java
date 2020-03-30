package mms.karaoke.processmgr;

import java.io.IOException;

public class ProgramExcuter {
	String processInfo="C:\\KMPlayer\\KMPlayer.exe";
	//String processInfo="C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe";
	ProcessBuilder pb=null;
	Process sub=null;
	public void stt(String selection){
		pb=new ProcessBuilder(processInfo,selection);
		try {
			sub=pb.start();
			try {
				sub.waitFor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Song is over");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
