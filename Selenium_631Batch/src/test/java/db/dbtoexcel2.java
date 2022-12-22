package db;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dbtoexcel2 {
	private static Connection cnn;
	private static Statement stmt;
	private static ResultSet rs;
	
  @Test
  public void f() throws Exception {
	  String databaseURL = "jdbc:mysql://127.0.0.1:3306/sreenivas_database";
		String username = "root";
		String password = "admin@123";

		Class.forName("com.mysql.cj.jdbc.Driver");
		cnn = DriverManager.getConnection(databaseURL, username, password);

		// Write the sql query
		String myquery = "select * from student;";
		stmt = cnn.createStatement();

		// Run the sql query
		rs = stmt.executeQuery(myquery);
	  
	 	  
	     XSSFWorkbook wb=new XSSFWorkbook();
		 XSSFSheet nsheet =  wb.createSheet("dbdata");
		 XSSFRow rowhead = nsheet.createRow(0);
		 
		 rowhead.createCell(0).setCellValue("std_id");
		 rowhead.createCell(1).setCellValue("firstname");
		 rowhead.createCell(2).setCellValue("lastname");
		 rowhead.createCell(3).setCellValue("email");
		 rowhead.createCell(4).setCellValue("state");
		 rowhead.createCell(5).setCellValue("county");
	 
		 
		 int r=1;
		 while (rs.next()) {
			// for(int i =1;i<5;i++) {				
				String std_id = rs.getString(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String email = rs.getString(4);
				String state = rs.getString(5);
				String county = rs.getString(6);
			 
						 
			 XSSFRow row = nsheet.createRow(r++);
			 row.createCell(0).setCellValue(std_id);
			 row.createCell(1).setCellValue(firstname);
			 row.createCell(2).setCellValue(lastname);
			 row.createCell(3).setCellValue(email);
			 row.createCell(4).setCellValue(state);
			 row.createCell(5).setCellValue(county);
			 
			
		}
		 FileOutputStream fo = new FileOutputStream(".\\db2excel.xlsx");
		 wb.write(fo);
		 wb.close();
	  
  }
}