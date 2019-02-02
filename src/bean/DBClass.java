package bean;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

import com.mysql.jdbc.Connection;

public class DBClass {
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	public String getDriver() {
		return driver;
	}
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}
	@Required
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	public void displayConnectionInfo() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection connection = (Connection) DriverManager.getConnection(url,userName,password);
		
		System.out.println("Connection: "+connection);
		System.out.println("Driver: "+driver);
		System.out.println("Url: "+url);
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+password);
	}
}
