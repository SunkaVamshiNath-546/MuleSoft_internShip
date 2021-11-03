package Internship;
import java.sql.*;
public class InsertDataStatic {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 System.out.println("Connection Established Succesfully :) ");
			 Statement stmt=con.createStatement();
			 int x=stmt.executeUpdate("insert into MoviesList values(1,'Jersey','Nani','Shraddha',2019,'Gowtam')");
			 System.out.println(x +" record inserted !");
		 }

	}

}
