package mms.karaoke.util;

import java.util.Random;
public class MakeRandom {
	
	Random r=new Random();
	
	public int getRan(int max){
		return r.nextInt(max);
	}
}
