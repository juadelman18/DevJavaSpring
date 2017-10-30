package SpringTest.com.adm.spring.jdbc.dao.imp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import SpringTest.com.adm.spring.jdbc.dao.GroupMembersDao;
import SpringTest.com.adm.spring.jdbc.mappers.GroupMenbersMapper;
import SpringTest.com.adm.spring.jdbc.mappers.UsersMapper;
import SpringTest.com.adm.spring.jdbc.modelo.Group_members;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public class GroupMembersDaoImp implements GroupMembersDao{
	
	private DataSource datasource;
	private JdbcTemplate jdbobject;

	public void setDataSource(DataSource ds) {	
		this.datasource=ds;
		this.jdbobject = new JdbcTemplate();
	}

	public void insert(String username, int group_id) {
		String sql1="INSERT INTO `bbdd`.`group_members` (`username`, `group_id`) VALUES (? , ?); ";
		jdbobject.update(sql1, username, group_id);
		System.out.println("Se ha creado el usuario: " + username + " Grupo: " + group_id );

		
	}

	public Group_members selectById(int id) {
		String sql="SELECT * FROM bbdd.group_members where id ?";
		Group_members grupi =jdbobject.queryForObject(sql, new Object[] { id }, new GroupMenbersMapper());
		return grupi;
	}

	public List<Group_members> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(int id, String username, int group_id) {
		// TODO Auto-generated method stub
		
	}



}
