package ai.jobiak.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.jdbc.Driver;

@Controller
public class JdbcController {
	
	@RequestMapping(value="sign",method=RequestMethod.POST)
	
	public String dosignup(Jdbc jd,ModelMap map) {
		
		try {
		String user="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=null;
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			con= DriverManager.getConnection(url,user,password);
			
			int custid=jd.getCustid();
			String title=jd.getTitle();
			double balance=jd.getBalance();
			
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?)");
			ps.setInt(1,custid);
			ps.setString(2,title);
			ps.setDouble(3, balance);
			
			int count=ps.executeUpdate();
			System.out.println(count);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 map.put("custid",jd.getCustid());
		 map.put("title",jd.getTitle());
		 map.put("balance",jd.getBalance());
		
		
		return "jd";
		
	}
}