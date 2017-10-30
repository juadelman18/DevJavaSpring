package SpringTest.com.adm.spring.jdbc.dao.imp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import SpringTest.com.adm.spring.jdbc.dao.UsersDao;
import SpringTest.com.adm.spring.jdbc.mappers.UsersMapper;
import SpringTest.com.adm.spring.jdbc.modelo.Users;

public class UsersDaoImp implements UsersDao{
	
	private DataSource datasource;
	private JdbcTemplate jdbobject;
	

	public void setDataSource(DataSource ds) {
		this.datasource=ds;
		this.jdbobject = new JdbcTemplate();
	}

	public void insert(String user, String pass, boolean act) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO `bbdd`.`users` (`username`, `password`, `enabled`) VALUES (?, ?, ?); ";
		jdbobject.update(sql, user, pass, act);
		System.out.println("Se ha creado el usuario: " + user + " Contraseña: " + pass + " Activo: " + act );
	}

	public Users selectById(String user) {
		String sql="SELECT * FROM bbdd.users where username= ?";
		Users usuario =jdbobject.queryForObject(sql, new Object[] { user }, new UsersMapper());
		return usuario;
	}

	public List<Users> selectAll() {
		String sql=" SELECT * FROM bbdd.users";
		List<Users> usuarios = jdbobject.query(sql,new UsersMapper());
		return usuarios;
	}

	public void delete(String user) {
		String sql="delete from bbdd.users where  username= ?";
		jdbobject.update(sql, user);
		System.out.println("Deleted al usuario = " + user);
	}

	public void update(String user, String password, boolean enabled) {
		String sql="UPDATE bbdd.users set user = ? where enabled = ?";
		jdbobject.update(sql, user,enabled);
		System.out.println("Updated usuario con enabled = " + enabled);
	}
	
	public void update2(String user, String password, boolean enabled) {
		String sql="UPDATE bbdd.users set user = ? where password = ?";
		jdbobject.update(sql, user,password);
		System.out.println("Updated usuario con password = " + password);
	}

}
