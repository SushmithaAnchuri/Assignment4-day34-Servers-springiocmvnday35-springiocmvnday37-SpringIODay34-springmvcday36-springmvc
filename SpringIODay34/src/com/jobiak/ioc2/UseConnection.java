package com.jobiak.ioc2;

import com.jobiak.ioc.*;

public class UseConnection {

	public UseConnection() {
		NewConnection con=new NewConnection();//1-N new is a nuisance
		con.getConnection();
		System.out.println("Connection obtained in:"+this.getClass());
	}
}
