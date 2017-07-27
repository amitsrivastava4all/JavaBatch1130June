package com.bmpl.testengine.user.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.bmpl.testengine.common.dto.CommonConstants;
import com.bmpl.testengine.common.dto.MessageDTO;
import com.bmpl.testengine.user.dto.UserDTO;
import com.bmpl.testengine.user.helper.UserHelper;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView frame = new RegisterView();
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
	public RegisterView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(139, 30, 61, 16);
		contentPane.add(lblRegister);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(25, 84, 61, 16);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(25, 140, 61, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(92, 79, 187, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 135, 181, 26);
		contentPane.add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
		btnRegister.setBounds(6, 189, 117, 29);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(141, 189, 117, 29);
		contentPane.add(btnReset);
	}
	
	private void doRegister(){
		String userid = textField.getText();
		String pwd = passwordField.getText();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		UserHelper userHelper = new UserHelper();
		try {
			MessageDTO msgDTO = userHelper.isRegister(userDTO);
			if(msgDTO.getStatus()==CommonConstants.SUCCESS){
				JOptionPane.showMessageDialog(this, msgDTO.getMessage());
			}
			else{
				JOptionPane.showMessageDialog(this, msgDTO.getMessage());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
