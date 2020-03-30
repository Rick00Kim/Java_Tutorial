package mms.karaoke.action;

import java.io.BufferedReader;
import java.io.IOException;

import mms.karaoke.util.*;
import mms.karaoke.db.*;
import mms.karaoke.model.Person;
public class PersonSelectAction implements Action {
	public void excute(BufferedReader in)throws IOException, InterruptedException {
		PersonDB pdb=new PersonDB();
		pdb.init();
		int arrSize=pdb.getSize();
		MakeRandom mrd = new MakeRandom();
		int ran=mrd.getRan(arrSize);
		Person one=pdb.getOneSelect(ran);
		ConsoleUtils cu=new ConsoleUtils();
		String temp=cu.selectPerson(one);
		cu.showClient(temp);
	}
}
