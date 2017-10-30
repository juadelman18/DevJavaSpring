package SpringTest.com.adm.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import SpringTest.com.adm.spring.jdbc.modelo.Group_members;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public class GroupMenbersMapper implements RowMapper<Group_members> {

	public Group_members mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Group_members miembro = new Group_members();
		miembro.setId(rs.getInt("id"));
		miembro.setUsername(rs.getString("username"));
		miembro.setGroup_id(rs.getInt("id"));
		return miembro;
	
	}

}
