package com.simarezania.app.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class AbstractDaoDabaseImpl {
	
	protected Connection getConnection() {
		try {
			String url = "jdbc:postgresql://localhost/simadb";
			Properties props = new Properties();
			props.setProperty("user", "sima");
			props.setProperty("password", "sima");
			// props.setProperty("ssl","true");
			Connection conn = DriverManager.getConnection(url, props);

			Class.forName("org.postgresql.Driver");

			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
