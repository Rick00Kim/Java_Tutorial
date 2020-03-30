package mms.karaoke.util;

import java.io.File;
import javax.sound.sampled.*;

public class AudioManager {
	static Clip clip=null;
	static AudioInputStream ais;
	public AudioManager(String fileName){
		play(fileName);
	}
	public void play(String fileName){
        try{
            ais = AudioSystem.getAudioInputStream(new File(fileName));
            clip = AudioSystem.getClip();
            clip.stop();
            clip.open(ais);
            clip.start();
        }catch (Exception e) {
        	
        }
    }
}
