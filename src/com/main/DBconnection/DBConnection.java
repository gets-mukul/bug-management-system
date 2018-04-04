package com.main.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class DBConnection {
	//Logger log = Logger.getLogger(DBConnection.class);

	public Connection getConnection() {
		Connection con = null;
		String ip = "localhost";
		String port = "3306";
		String dbName = "dms";
		String username = "root";
		String password = "root";
		String DB_URL = "jdbc:mysql://" + ip + ":" + port + "/" + dbName + "";
		//log.info("DB_URL == " + DB_URL);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(DB_URL, username, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
}
