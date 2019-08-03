package config.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	Connection conn;
	Statement stmt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	String user = "SCOTT";
	String pass = "tiger";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
public DBconnection(){
	try {
		Class.forName(this.driver);
		System.out.println("[INFO] oracle driver connect");
		
		this.conn = DriverManager.getConnection(url, user, pass);
		System.out.println("[INFO] Compalate Connection");
		this.stmt = conn.createStatement();
	}catch(SQLException e){
		e.printStackTrace();
		System.out.println("Fail to oracle Driver Connect!");
		System.exit(0);
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	
	} catch(Exception e) {
		e.printStackTrace();
	}
	
}

public ResultSet SelectQuery(String query) {

	ResultSet rs = null;
	try{
		rs = this.stmt.executeQuery(query);
		
	}catch (SQLException e){
		e.printStackTrace();
	}
	return rs;
}
}
