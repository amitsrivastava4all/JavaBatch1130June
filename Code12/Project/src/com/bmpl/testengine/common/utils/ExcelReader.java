package com.bmpl.testengine.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.bmpl.testengine.questions.dto.QuestionDTO;

public class ExcelReader {
	public static ArrayList<QuestionDTO> getQuestions(String filePath) throws IOException{
		ArrayList<QuestionDTO> questionList = new ArrayList<>();
		File file = new File(filePath);
		boolean firstRow = false;
		if(!file.exists()){
			throw new FileNotFoundException("Question File is Not Exist ");
		}
		int columnCount = 0;
		if(file.exists()){
		QuestionDTO questionDTO = null;	
		FileInputStream fs = new FileInputStream(file);
		HSSFWorkbook workBook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()){
			Row currentRow = rows.next();
			if(!firstRow){
				firstRow = true;
				continue;
			}
			Iterator<Cell> cells = currentRow.cellIterator();
			columnCount = 0;
			questionDTO = new QuestionDTO();
			while(cells.hasNext()){
				Cell cell = cells.next();
				if(cell.getCellType()== Cell.CELL_TYPE_STRING){
					columnCount++;
					if(columnCount==1){
						questionDTO.setId(Integer.parseInt(cell.getStringCellValue()));
					}
					else
					if(columnCount == 2){	
						questionDTO.setQuestion(cell.getStringCellValue());
					}
					else
					if(columnCount == 3){	
							questionDTO.setOptionOne(cell.getStringCellValue());
					}
					else
					if(columnCount == 4){	
						questionDTO.setOptionTwo(cell.getStringCellValue());
					}
					else
					if(columnCount == 5){	
						questionDTO.setOptionThree(cell.getStringCellValue());
					}
					else
						if(columnCount == 6){	
							questionDTO.setOptionFour(cell.getStringCellValue());
						}
						else
						if(columnCount ==7){	
							questionDTO.setRightAnswer(cell.getStringCellValue());
						}
						else
						if(columnCount ==8){
							questionDTO.setWeight(Integer.parseInt(cell.getStringCellValue()));
						}
						else
						if(columnCount ==9){
							questionDTO.setArea(cell.getStringCellValue());
						}
				}
				else
				if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){	
					columnCount++;
					if(columnCount==1){
						
						questionDTO.setId((int)cell.getNumericCellValue());
					}
					else
					if(columnCount==8){
						
						questionDTO.setWeight((int)cell.getNumericCellValue());
					}
				}
			}  // Cell Loop Ends Here
			questionList.add(questionDTO);
		}  // rows Loop Ends Here
		return questionList;
		
		
		} // if ends
		else{
			return null;
		}
	}
}
