package mms.karaoke.util;

import java.util.*;
public class MakeRandom {
	Random r=new Random();
	public int getRan(int limit){
		int ran=r.nextInt(limit);
		return ran;
	}
}
