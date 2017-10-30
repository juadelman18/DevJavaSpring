package SpringTest.com.adm.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public class UsersMapper implements RowMapper<Users>{

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Users usuario = new Users();
		usuario.setUsername(rs.getString("username"));
		usuario.setPassword(rs.getString("password"));
		usuario.setEnabled(rs.getBoolean("enabled"));
		return usuario;
	}

}
