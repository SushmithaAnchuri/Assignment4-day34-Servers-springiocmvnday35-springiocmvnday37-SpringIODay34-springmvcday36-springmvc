package ai.jobiak.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO {

	//performs CRUD operation with the customer table, hence needs JdbcTemplate
	
	private JdbcTemplate mysqlTemplate;
	
	public JdbcTemplate getTemplate(){
		return mysqlTemplate;
		
	}
	public void setTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate=mysqlTemplate;
		
	}
	public int insertRow() {
	return mysqlTemplate.update("insert into customer values(115,'Michel Lee',4000)");
	}
	/*
	 * public int updateRow() { return mysqlTemplate.
	 * update("update customer set balance = balance+1500 where custid=115"); }
	 * public int deleteRow() { return
	 * mysqlTemplate.update("delete from customer where custid=115"); }
	 */
		
	
}