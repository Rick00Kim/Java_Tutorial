package mms.karaoke.db;

import java.util.*;
import mms.karaoke.model.*;
public class PersonDB {
	static ArrayList<Person> personArr=new ArrayList<Person>();
	public void init(){
		personArr.add(new Person(0,"����縶",24));
		personArr.add(new Person(1,"���ֿ�",25));
		personArr.add(new Person(2,"������",26));
		personArr.add(new Person(3,"õ���",25));
		personArr.add(new Person(4,"������",28));
		personArr.add(new Person(5,"�豸��",27));
	}
	public int getSize(){
		return personArr.size();
	}
	public Person getOneSelect(int index){
		Person temp=personArr.get(index);
		return temp;
	}
}
