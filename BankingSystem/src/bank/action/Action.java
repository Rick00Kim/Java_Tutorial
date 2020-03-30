package bank.action;
import java.io.*;

public interface Action {
	void execute(BufferedReader in)throws IOException;
}