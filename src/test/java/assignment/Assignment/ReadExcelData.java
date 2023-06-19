package assignment.Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\source\\Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		System.out.println("name: "+sheet.getRow(1).getCell(0));
		System.out.println("password: "+sheet.getRow(1).getCell(1));
		
		Row row = sheet.getRow(1);
		Cell cell= row.getCell(1);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);	
	}
}
