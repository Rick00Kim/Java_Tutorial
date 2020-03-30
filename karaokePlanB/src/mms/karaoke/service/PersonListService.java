package mms.karaoke.service;

import java.sql.Connection;
import java.util.ArrayList;

import mms.karaoke.dao.PersonDAO;
import mms.karaoke.model.Person;
import static mms.karaoke.db.JdbcUtils.*;
public class PersonListService {
	public ArrayList<Person> loadPersonInfo(){
		ArrayList<Person> temp=null;
		Connection conn=getConnection();
		PersonDAO pdao=new PersonDAO(conn);
		temp=pdao.selectAllPersonList();
		return temp;
	}
}
