package mms.karaoke.action;
import java.io.*;
public interface Action {
	public void excute(BufferedReader in)throws IOException, InterruptedException;
}
