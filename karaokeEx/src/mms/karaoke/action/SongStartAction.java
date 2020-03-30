package mms.karaoke.action;

import java.io.BufferedReader;
import java.io.IOException;

import mms.karaoke.db.*;
import mms.karaoke.processmgr.*;
import mms.karaoke.util.MakeRandom;
public class SongStartAction implements Action {
	public void excute(BufferedReader in)throws IOException {
		SongDB sdb=new SongDB();
		sdb.init();
		int arrSize=sdb.getSize();
		MakeRandom mrd = new MakeRandom();
		int ran=mrd.getRan(arrSize);
		String one=sdb.oneSelect(ran);
		ProgramExcuter pex =new ProgramExcuter();
		pex.stt(one);
	}
}
