package mms.karaoke.db;
import java.util.*;
public class SongDB {
	static ArrayList<String> songArr = new ArrayList<String>();
	public void init(){
		songArr.add("Song\\1.mp4");
		songArr.add("Song\\2.mp4");
		songArr.add("Song\\3.mp4");
		songArr.add("Song\\4.mp4");
		songArr.add("Song\\5.mp4");
		songArr.add("Song\\6.mp4");
	}
	public int getSize(){
		return songArr.size();
	}
	public String oneSelect(int index){
		String temp=songArr.get(index);
		return temp;
	}
}