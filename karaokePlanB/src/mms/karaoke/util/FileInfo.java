package mms.karaoke.util;

import java.io.File;
import java.util.ArrayList;

public class FileInfo {
	public  ArrayList<String> setFileList(){
		ArrayList<String> songArr=new ArrayList<String>();
		String path="Song/";
		File dirFile=new File(path);
		File []fileList=dirFile.listFiles();
		for(File tempFile : fileList) {
		  if(tempFile.isFile()) {
		    String tempFileName=tempFile.getName();
		    songArr.add(tempFileName);
		  }
		}
		return songArr;
	}
}
