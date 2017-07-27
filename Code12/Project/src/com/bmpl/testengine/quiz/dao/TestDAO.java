package com.bmpl.testengine.quiz.dao;

import java.io.IOException;
import java.util.ArrayList;

import com.bmpl.testengine.common.dto.PropertyReader;
import com.bmpl.testengine.common.utils.ExcelReader;
import com.bmpl.testengine.questions.dto.QuestionDTO;

public class TestDAO {
	
	public ArrayList<QuestionDTO> getQuestions() throws IOException{
		return ExcelReader.getQuestions(PropertyReader.getExcelPath());
	}

}
