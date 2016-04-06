/**
 * 
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author rashmiranjan
 *
 */

public class Test25 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.10.252:3307", "root", "yanaroot");

		Statement statement = connection.createStatement();
		
		/*CREATE TABLE emp
		(
		emp_id int,
		emp_name varchar(255),
		emp_salary varchar(255)
		); */
		
		//Perform Action
		statement.executeUpdate("insert into rashmi.emp values ('6','Guna','250')");
		
		//Validate database
		ResultSet res = statement
				.executeQuery("Select * from rashmi.emp where emp_id='10'");
		
		if(res.next()){
			System.out.println("Record present");
		}else{
			System.out.println("Record not present");
		}		
		connection.close();
	}

}
