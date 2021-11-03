package Internship;
import java.sql.*;
public class CreateMovieTable {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 Statement stmt=con.createStatement();
			 System.out.println("Connection Established Succesfully :) ");
			 int n=stmt.executeUpdate("create table MoviesList(movieid int primary key,moviename text,leadactor text,actress text,year int,directorname text)");
			 System.out.println("Table Created Succesfully");
		 }

	}

}
