package com.bmpl.testengine.user.helper;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.bmpl.testengine.common.dto.CommonConstants;
import com.bmpl.testengine.common.dto.MessageDTO;
import com.bmpl.testengine.user.dao.UserDAO;
import com.bmpl.testengine.user.dto.UserDTO;

public class UserHelper implements CommonConstants {
	Logger logger = Logger.getLogger(UserHelper.class);
	public MessageDTO isRegister(UserDTO userDTO) throws IOException{
		UserDAO userDAO = new UserDAO();
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setStatus(ERROR);
		if(userDAO.registerUser(userDTO)){
			messageDTO.setStatus(SUCCESS);
			messageDTO.setMessage("Register SuccessFully");
		}
		
		else{
			messageDTO.setStatus(FAIL);
			messageDTO.setMessage("Problem in Register....");
		}
		return messageDTO;
	}
	
	public MessageDTO isCheckExist(UserDTO userDTO) throws ClassNotFoundException, IOException{
		logger.debug("Inside LoggerHelper isCheckExist "+userDTO);
		UserDAO userDAO = new UserDAO();
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setStatus(ERROR);
		if(userDAO.checkUserExist(userDTO)){
			messageDTO.setStatus(SUCCESS);
			messageDTO.setMessage("Welcome "+userDTO.getUserid());
		}
		else
		{
			messageDTO.setStatus(FAIL);
			messageDTO.setMessage("Invalid Userid or Password ");
		}
		messageDTO.setDate(new Date());
		return messageDTO;
	}
	
}
