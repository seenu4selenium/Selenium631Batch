package dataDrivernFW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(".\\testdata.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("fbLogin");

		Row row = s.getRow(0);
		Cell column = row.getCell(1);
		System.out.println(column);

		// row0,colum1

		Cell abc = row.createCell(2);
		// abc is to find the 0th row colum 2
		abc.setCellValue("Results");
		// Before write the testdata, user must close excel sheet(Do not open the sheet
		// by another user)
		FileOutputStream fo = new FileOutputStream(".\\testdata.xlsx");
		w.write(fo);
		w.close();

	}

}
