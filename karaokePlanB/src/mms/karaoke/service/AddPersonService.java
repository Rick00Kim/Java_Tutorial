package mms.karaoke.service;



import java.sql.Connection;

import mms.karaoke.dao.PersonDAO;
import mms.karaoke.model.Person;
import static mms.karaoke.db.JdbcUtils.*;
public class AddPersonService {
	public boolean addPerson(Person newPerson){
		int result=0;
		boolean chk=false;
		Connection conn=getConnection();
		PersonDAO dao=new PersonDAO(conn);
		result=dao.insertNewPerson(newPerson);
		if(result>0){
			commit(conn);
			chk=true;
		}else{
			rollback(conn);
		}
		return chk;
	}
}
