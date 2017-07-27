package com.bmpl.testengine.user.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.apache.log4j.Logger;

import com.bmpl.testengine.common.dto.CommonConstants;
import com.bmpl.testengine.common.dto.MessageDTO;
import com.bmpl.testengine.common.utils.CommonUtils;
import com.bmpl.testengine.quiz.view.Test;
import com.bmpl.testengine.user.dto.UserDTO;
import com.bmpl.testengine.user.helper.UserHelper;
import com.bmpl.testengine.user.helper.UserValidation;

public class LoginView extends JFrame  {
	Logger logger =Logger.getLogger(LoginView.class);
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel useriderror = new JLabel("");
	JLabel pwderror = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		logger.debug("Inside the LoginView Constructor and Here is the Design Start");
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 260);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginScreen = new JLabel("Login Screen");
		lblLoginScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginScreen.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblLoginScreen.setBounds(86, 6, 164, 32);
		contentPane.add(lblLoginScreen);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(38, 87, 61, 16);
		contentPane.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(101, 82, 192, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 137, 61, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 132, 192, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkUserAuth();
			}
		});
		btnLogin.setBounds(23, 182, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(147, 182, 117, 29);
		contentPane.add(btnReset);
		
		
		useriderror.setForeground(Color.RED);
		useriderror.setBounds(101, 63, 192, 16);
		contentPane.add(useriderror);
		
		
		pwderror.setForeground(Color.RED);
		pwderror.setBounds(101, 115, 192, 16);
		contentPane.add(pwderror);
		logger.debug("Inside the LoginView Constructor and Here is the Design Ends");
	}
	private void checkUserAuth(){
		String userid = textField.getText();
		String pwd = passwordField.getText();
		logger.debug("Userid is "+userid+" and Password is "+pwd);
		boolean isValidationFail = false;
		if(UserValidation.isBlank(userid)){
			useriderror.setText("Userid Can't be blank");
			isValidationFail = true;
		}
		else{
			useriderror.setText("");
		}
		if(UserValidation.checkMinLength(pwd, 4)){
			pwderror.setText("Password is Less than 4 Characters");
			isValidationFail = true;
		}
		else{
			pwderror.setText("");
		}
		if(isValidationFail){
			logger.debug("Validation Fail "+isValidationFail);
			return ;
		}
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		UserHelper userHelper = new UserHelper();
		MessageDTO messageDTO = null;
		try {
			messageDTO = userHelper.isCheckExist(userDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			JOptionPane.showMessageDialog(this, "Exception Raised... "+e);
			logger.error(CommonUtils.getPrintStackTrace(e));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			JOptionPane.showMessageDialog(this, "Exception Raised... "+e);
			logger.error(CommonUtils.getPrintStackTrace(e));
		}
		if(messageDTO.getStatus()==CommonConstants.SUCCESS){
			Test test = new Test(messageDTO.getMessage());
			test.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		else
		if(messageDTO.getStatus()==CommonConstants.FAIL)
		{
			JOptionPane.showMessageDialog(this, messageDTO.getMessage()+" "+messageDTO.getDate());
		}
		
	}
}
