package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@PostConstruct -->after bean craete 

public class Students {

	private String driver;
	private String connectionURL;
	private String userName;
	private String password;

	Connection connection;

	//@PostConstruct  --> bean craeted -->> depency ll be stte --> this method ll be called
	public void setupConnection() throws SQLException, ClassNotFoundException  {
		Class.forName(driver);

		connection = DriverManager.getConnection(connectionURL, userName, password);

	}

//@PreDestroy	
	public void closeConnection() throws SQLException{
		connection.close();
	}

	public void displayAll() throws SQLException, ClassNotFoundException {
		setupConnection();
		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM employee");

		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)
			+" "+resultSet.getString(3)
			+" "+resultSet.getString(4));
		}
//		closeConnection();				
	}

	public void deleteRecord(int id) throws SQLException, ClassNotFoundException {
//		setupConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM employee WHERE id = "+id);
		System.out.println(id +"student with record number deleted");
//		closeConnection();
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
