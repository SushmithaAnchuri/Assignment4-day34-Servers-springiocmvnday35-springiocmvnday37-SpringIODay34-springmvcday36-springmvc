package ai.jobiak.mvc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SignupDAO {

	private JdbcTemplate mysqlTemplate;
	
	public JdbcTemplate getTemplate() {
		return mysqlTemplate;
	}
	
	public void setTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate=mysqlTemplate;
	}
	public Boolean insertRow(String fname, String email, long mobile) {

	
		String query="insert into signup values(?,?,?)";
		return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
			
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException, DataAccessException {
				ps.setString(1,fname);
				ps.setString(2,email);
				ps.setLong(3,mobile);
				
				return ps.execute();
				
			}
	
		});
	
		
	}	
}