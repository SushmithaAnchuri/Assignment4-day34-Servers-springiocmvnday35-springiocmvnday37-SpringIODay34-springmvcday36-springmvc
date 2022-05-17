package com.jobiak.ioc;

import java.net.*;

import javax.net.ssl.HttpsURLConnection;
//great value class
public class Connection {

	public Connection getConnection() {
		
		System.out.println("Providing the connection...................");
		return new Connection();
	}
}
