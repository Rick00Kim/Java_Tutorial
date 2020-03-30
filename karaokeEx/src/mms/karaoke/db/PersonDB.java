package mms.karaoke.db;

import java.util.*;
import mms.karaoke.model.*;
public class PersonDB {
	static ArrayList<Person> personArr=new ArrayList<Person>();
	public void init(){
		personArr.add(new Person(0,"조장사마",24));
		personArr.add(new Person(1,"이주영",25));
		personArr.add(new Person(2,"강문숙",26));
		personArr.add(new Person(3,"천기범",25));
		personArr.add(new Person(4,"이지선",28));
		personArr.add(new Person(5,"김구현",27));
	}
	public int getSize(){
		return personArr.size();
	}
	public Person getOneSelect(int index){
		Person temp=personArr.get(index);
		return temp;
	}
}
