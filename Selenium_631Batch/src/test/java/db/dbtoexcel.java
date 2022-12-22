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

public class dbtoexcel {
	private static Connection con;
	private static Statement sta;
	private ResultSet rs;
	
  @Test
  public void f() throws Exception {
		 String databaseURL = "jdbc:mysql://localhost:3306/database1";
		 String username ="root";
		 String pwd ="root";
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection(databaseURL,username, pwd);
		 String query ="select * from orders;";
		 sta= con.createStatement();
		 rs = sta.executeQuery(query);
	  
	 	  
	     XSSFWorkbook wb=new XSSFWorkbook();
		 XSSFSheet nsheet =  wb.createSheet("dbdata");
		 XSSFRow rowhead = nsheet.createRow(0);
		 
		 rowhead.createCell(0).setCellValue("orderNO");
		 rowhead.createCell(1).setCellValue("items");
		 rowhead.createCell(2).setCellValue("no_items");
		 rowhead.createCell(3).setCellValue("price");
		 
		 int r=1;
		 while (rs.next()) {
			 int Od_NO = rs.getInt("orderNO");
			 String item_name =rs.getString("items");
			 int total_items= rs.getInt("no_items");
			 Double Tprice = rs.getDouble("price");
			 
						 
			 XSSFRow row = nsheet.createRow(r++);
			 row.createCell(0).setCellValue(Od_NO);
			 row.createCell(1).setCellValue(item_name);
			 row.createCell(2).setCellValue(total_items);
			 row.createCell(3).setCellValue(Tprice);
			
		}
		 FileOutputStream fo = new FileOutputStream(".\\db2excel.xlsx");
		 wb.write(fo);
		 wb.close();
	  
  }
}