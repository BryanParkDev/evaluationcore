package aidEval;

import java.sql.*;

public class MysqlConnector {

		
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","wanrltw123");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM USER");  
			while(rs.next())  
				System.out.println(
						"Name: "+rs.getString("name")+"\n"+
						"UID: "+rs.getString("student_id")+"\n"+
						"Original Code String :"+rs.getString("original_code_string")+"\n"
						);
			
			String stmtStr = "INSERT INTO USER"
					+"(name, original_code_string, accuracy, overall_grade, simlarity,"
					+ "loc, timeComplexity, spaceComplexity) "
					+"VALUES('BRYAN', 'print(\"Hello JAVA!\")', 3, 'B', 3, 2, 3, 2)";
			
			stmt.executeUpdate(stmtStr);
			System.out.println("UPDATE COMPLETED!");
			
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
	
}


