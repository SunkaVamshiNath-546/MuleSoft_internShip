package Internship;
import java.sql.*;
import java.util.Scanner;
public class InsertDataDynamic {

	public static void main(String[] args) throws Exception{
		Class.forName("org.sqlite.JDBC");
		 java.sql.Connection  con = DriverManager.getConnection("jdbc:sqlite:MoviesList.db");
		 if(con!=null){
			 System.out.println("Connection Established Succesfully :) ");
			 PreparedStatement pstmt=con.prepareStatement("insert into MoviesList values(?,?,?,?,?,?)");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the Movie Id");
			 int movieid=sc.nextInt();
			 System.out.println("Enter the Movie Name");
			 String moviename=sc.next();
			 System.out.println("Enter the Movie Lead Actor");
			 String leadactor=sc.next();
			 System.out.println("Enter the Movie Actress");
			 String actress=sc.next();
			 System.out.println("Enter the Movie year");
			 int year=sc.nextInt();
			 System.out.println("Enter the Movie director name");
			 String directorname=sc.next();
			 pstmt.setInt(1,movieid);
			 pstmt.setString(2,moviename);
			 pstmt.setString(3,leadactor);
			 pstmt.setString(4,actress);
			 pstmt.setInt(5,year);
			 pstmt.setString(6,directorname);
			 int n=pstmt.executeUpdate();
			 System.out.println(n);
		 }
	}

}
