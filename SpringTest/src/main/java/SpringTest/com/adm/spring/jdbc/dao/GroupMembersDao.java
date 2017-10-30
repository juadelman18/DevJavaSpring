package SpringTest.com.adm.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import SpringTest.com.adm.spring.jdbc.modelo.Group_members;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public interface GroupMembersDao {
	
	public void setDataSource(DataSource ds);
	public void insert(String username, int group_id); 
	public Group_members selectById(int id);
	public List<Group_members> selectAll();
	public void delete(int id);
	public void update(int id, String username, int group_id);

}
