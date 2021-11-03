package Internship;
import java.sql.*;
import java.util.Scanner;
public class ShowDatabase {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 System.out.println("Connection Established Succesfully :) ");
			 PreparedStatement pstmt=con.prepareStatement("select * from MoviesList");
			 ResultSet rs=pstmt.executeQuery();
			 System.out.println("movieid\tmoviename\tleadactor\tactress\tyear\tdirectorname");
			 System.out.println("__________________________________________________________");
			 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6));
			 }
		 }
			 
			 

	}

}
