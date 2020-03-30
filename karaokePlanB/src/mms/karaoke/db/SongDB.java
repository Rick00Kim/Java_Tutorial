package mms.karaoke.db;
import java.util.*;

import mms.karaoke.util.FileInfo;
public class SongDB {
	static ArrayList<String> songArr = new ArrayList<String>();
	public void init(){
		FileInfo fi=new FileInfo();
		songArr=fi.setFileList();
	}
	public int getSize(){
		return songArr.size();
	}
	public String oneSelect(int index){
		String temp=songArr.get(index);
		return temp;
	}
}