package Internship;
import java.sql.*;
public class DatabaseConnection {
	public static void main(String[] args) throws Exception {
		 Class.forName("org.sqlite.JDBC");
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 System.out.println("Connection Established Succesfully :) ");
		 }
	}
}
