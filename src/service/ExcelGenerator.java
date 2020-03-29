package service;
// /*
package service;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Prograd;
//			Progression -1 
//Go to src/service. Open the ExcelGenerator and fill the logic inside the excelGenerate method.
//
//Stick to the instructions clearly. If you face any issue contact your mentor to get the guidance. 

public class ExcelGenerator {
	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Prograd prograd, List<Prograd> list) throws IOException {
		try {
			// Type your code here
			 XSSFWorkbook workbook = new XSSFWorkbook();
		        XSSFSheet filename = workbook.createSheet("Java Books");
		        int rowCount = 0;
		        for (Object[] aBook : list) {
		            Row row = filename.createRow(++rowCount);
		            int columnCount = 0;
		            for (Object field : aBook) {
		                Cell cell = row.createCell(++columnCount);
		                if (field instanceof String) {
		                    cell.setCellValue((String) field);
		                } else if (field instanceof Integer) {
		                    cell.setCellValue((Integer) field);
		                }
		            }
		        }
			}
			// Do not modify the lines given below
			 out = new FileOutputStream(filename);
			hwb.write(out);
		
			return hwb;
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			out.close();
		}
		return null;
		
	}
}
*/