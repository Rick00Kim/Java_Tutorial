package mms.karaoke.service;

import static mms.karaoke.db.JdbcUtils.getConnection;

import java.sql.Connection;

import mms.karaoke.dao.PersonDAO;
import mms.karaoke.model.Person;

public class GetOneService {
	public Person getOnePerson(int random){
		Connection conn=getConnection();
		PersonDAO pdao=new PersonDAO(conn);
		Person temp=pdao.selectOnePerson(random);
		return temp;
	}
}
