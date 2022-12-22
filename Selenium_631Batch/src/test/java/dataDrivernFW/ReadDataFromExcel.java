package dataDrivernFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(".\\testdata.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("fbLogin");
		
		Row row = s.getRow(3);
		Cell column = row.getCell(1);
		System.out.println(column);
		
		//To get the row count
		System.out.println(s.getLastRowNum());
		

	}

}
