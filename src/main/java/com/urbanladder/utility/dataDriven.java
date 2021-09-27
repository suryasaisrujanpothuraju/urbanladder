package com.urbanladder.utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public static void main(String[] args) throws IOException {

		
		
	}
	
	public ArrayList<String> getData(String testcase, String parameter) throws IOException {
		
		
		//Make Array List to Store Row Data
		ArrayList<String> a = new ArrayList<String>();
		
		
		//Create an Object that can access the file and pass the location as argument
		FileInputStream fis = new FileInputStream("C:\\Users\\Surya Sai Srujan\\Desktop\\TestData.xlsx");
		
		//Create an Object for the Excel sheet and pass the 'fis' as an argument
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//Get the total number of sheets in the excel file
		int noofsheets =  workbook.getNumberOfSheets();
		//System.out.println("The Total Number of Sheets is "+noofsheets);
		
		//Initilize sheet variable
		XSSFSheet sheet;
		
		//Find the sheet we want
		for(int i = 0; i < noofsheets; i++) {
			
			//Check Name of Sheet
			if( workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				
				//get the sheet from the workbook
				sheet =  workbook.getSheetAt(i);
				
				//Get Access to First Row
				Iterator<Row> rows = sheet.iterator();
				Row first = rows.next();
				
				//get First Cell
				Iterator<Cell> ce =  first.cellIterator();
				
				int k = 0;
				int column = 0; 
				
				while(ce.hasNext()) {
					
					//Move to next cell
					Cell value = ce.next();
					
					//get Value of that cell
					if(value.getStringCellValue().equalsIgnoreCase(testcase)) {
						
					column = k;
					break;
						
					}
					
					k++;
							
				}
				
				//System.out.println(column);
				
				//Scan Entire Column for Amazon
				while(rows.hasNext()) {
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(parameter)){
						
						//get all data from the row
						Iterator<Cell> amz =  r.cellIterator();
						while(amz.hasNext()) {
							Cell c = amz.next();
							if(c.getCellType()==CellType.STRING) {
							a.add(c.getStringCellValue());
							}
							else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
						break;
						
					}	
					
				}
				
			}
			workbook.close();
		}
		
		return a;
	}

}
