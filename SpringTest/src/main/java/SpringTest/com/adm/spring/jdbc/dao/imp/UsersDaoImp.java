package SpringTest.com.adm.spring.jdbc.dao.imp;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import SpringTest.com.adm.spring.jdbc.dao.UsersDao;
import SpringTest.com.adm.spring.jdbc.mappers.UsersMapper;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public class UsersDaoImp implements UsersDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
		
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void insert(String user, String pass, boolean act) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO `bbdd`.`users` (`username`, `password`, `enabled`) VALUES (?, ?, ?); ";
		jdbcTemplate.update(sql, user, pass, act);
		System.out.println("Se ha creado el usuario: " + user + " Contraseña: " + pass + " Activo: " + act );
	}

	public Users selectById(String user) {
		String sql="SELECT * FROM bbdd.users where username= ?";
		Users usuario =jdbcTemplate.queryForObject(sql, new Object[] { user }, new UsersMapper());
		return usuario;
	}

	public List<Users> selectAll() {
		String sql=" SELECT * FROM bbdd.users";
		List<Users> usuarios = jdbcTemplate.query(sql,new UsersMapper());
		return usuarios;
	}

	public void delete(String user) {
		String sql="delete from bbdd.users where  username= ?";
		jdbcTemplate.update(sql, user);
		System.out.println("Deleted al usuario = " + user);
	}

	public void updateEnable(boolean enabled ,String user ) {
		String sql="UPDATE bbdd.users set  enabled = ? where user = ? ";
		jdbcTemplate.update(sql,enabled, user);
		System.out.println("Updated usuario con enabled = " + enabled);
	}
	
	public void updatePassw(String password, String user) {
		String sql="UPDATE bbdd.users set password = ? where username = ?";
		jdbcTemplate.update(sql, password,user);
		System.out.println("Updated usuario con password = " + password);
	}

	

}
