package Internship;
import java.util.*;
import java.sql.*;
public class ShowDatabaseByactorName {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Scanner sc=new Scanner(System.in);
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 System.out.println("Connection Established Succesfully :) ");
			 System.out.println("Enter Actor name to Display The movies :");
			 String actor=sc.next();
			 String sql="select * from MoviesList where leadactor=?";
			 
			 PreparedStatement pstmt=con.prepareStatement(sql);
			 pstmt.setString(1,actor);
		 
			 ResultSet rs=pstmt.executeQuery();
		 
			 System.out.println("movieid\tmoviename\tleadactor\tactress\tyear\tdirectorname");
			 System.out.println("__________________________________________________________");
			 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6));
			 }
		 }
	}

}
