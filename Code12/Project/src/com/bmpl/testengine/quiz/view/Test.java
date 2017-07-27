package com.bmpl.testengine.quiz.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Test(String message) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTestStart = new JLabel("Test Start "+message);
		lblTestStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestStart.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblTestStart.setForeground(Color.RED);
		lblTestStart.setBackground(Color.ORANGE);
		lblTestStart.setBounds(37, 29, 385, 89);
		contentPane.add(lblTestStart);
		
		JLabel quesLbl = new JLabel("New label");
		quesLbl.setBounds(47, 109, 660, 107);
		contentPane.add(quesLbl);
		
		JRadioButton option1 = new JRadioButton("New radio button");
		option1.setBounds(47, 247, 567, 23);
		contentPane.add(option1);
		
		JRadioButton option2 = new JRadioButton("New radio button");
		option2.setBounds(47, 295, 567, 23);
		contentPane.add(option2);
		
		JRadioButton option3 = new JRadioButton("New radio button");
		option3.setBounds(47, 340, 567, 23);
		contentPane.add(option3);
		
		JRadioButton option4 = new JRadioButton("New radio button");
		option4.setBounds(47, 375, 567, 23);
		contentPane.add(option4);
		
		JLabel lblTimeleft = new JLabel("TimeLeft");
		lblTimeleft.setBounds(549, 29, 61, 16);
		contentPane.add(lblTimeleft);
	}
}
