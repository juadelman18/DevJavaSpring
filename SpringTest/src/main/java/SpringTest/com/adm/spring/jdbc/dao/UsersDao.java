package SpringTest.com.adm.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import SpringTest.com.adm.spring.jdbc.modelo.Users;

public interface UsersDao {
	
	public void setDataSource(DataSource ds);
	public void insert(String Username, String password, boolean enabled); 
	public Users selectById(String user);
	public List<Users> selectAll();
	public void delete(String  user);
	public void update(String user, String password, boolean enabled);

}
