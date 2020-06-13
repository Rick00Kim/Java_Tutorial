package mms.karaoke.util;

import java.io.IOException;

public class StartMusic {
	// private String prgPath = "C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe";
	private String prgPath = "C:\\KMPlayer\\KMPlayer.exe";
	private ProcessBuilder pb = null;
	private Process pc = null;

	public void processStart(String file) {
		pb = new ProcessBuilder(prgPath, "Song\\" + file);
		try {
			pc = pb.start();
			pc.waitFor();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
