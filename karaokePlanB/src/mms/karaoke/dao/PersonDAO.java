package mms.karaoke.dao;

import java.sql.*;
import java.util.ArrayList;

import mms.karaoke.model.Person;
import static mms.karaoke.db.JdbcUtils.*;
public class PersonDAO {
	
	Connection conn;
	
	public PersonDAO(Connection conn){
		this.conn=conn;
	}
	public ArrayList<Person> selectAllPersonList(){
		String sql="select * from person";
		ArrayList<Person> personArr=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			personArr=new ArrayList<Person>();
			Person person=null;
			while(rs.next()){
				person=new Person(rs.getInt("id"),
								  rs.getString("name"),
								  rs.getString("gender"),
								  rs.getString("room"));
				personArr.add(person);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			close(stmt);
			close(rs);
			
			close(conn);
		}
		return personArr;
	}
	public Person selectOnePerson(int random){
		String sql="select * from person where id=?";
		Person temp=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, random);
			rs=pstmt.executeQuery();
			if(rs.next()){
				temp=new Person(rs.getInt("id"),
								rs.getString("name"),
								rs.getString("gender"),
								rs.getString("room")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(pstmt);
			close(rs);
			close(conn);
		}
		
		return temp;
	}
	public int insertNewPerson(Person newPerson) {
		String sql="insert into person values (person_id_seq.NEXTVAL,?,?,?)";
		int result=0;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, newPerson.getName());
			pstmt.setString(2, newPerson.getGender());
			pstmt.setString(3, newPerson.getRoom());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(rs);
			close(pstmt);
			close(conn);
		}
		
		return result;
	}
}
