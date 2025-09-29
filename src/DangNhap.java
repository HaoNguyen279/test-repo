
/*
 * @ (#) DangNhapGUI.java   1.0     4/21/2025
 * Copyright (c) 2025 IUH, All rights reserved.
 */





import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class DangNhap extends JFrame implements ActionListener {
	private JLabel lblUsername, lblPassword, lblTitleLogin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private ImageIcon backgroundIcon = new ImageIcon("image/gradientBgLogin.png");
	private JFrame loginFrame;
	public DangNhap() {
		createLoginWindow();
	}

	private void createLoginWindow() {
		loginFrame = new JFrame();
		Font fntLogin = new Font("Roboto", Font.BOLD, 30);
		Font fntUserAndPassword = new Font("Roboto", Font.PLAIN,18);
		lblUsername = new JLabel("Username");
		lblUsername.setFont(fntUserAndPassword);
		lblPassword = new JLabel("Password");
		lblPassword.setFont(fntUserAndPassword);
		lblTitleLogin = new JLabel("Login");
		lblTitleLogin.setFont(fntLogin);

		txtUsername = new JTextField(20);
		txtUsername.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.BLACK));
		txtUsername.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtPassword = new JPasswordField(20);
		txtPassword.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
		txtPassword.setFont(new Font("Roboto", Font.PLAIN, 16));

		btnLogin = new JButton("Đăng nhập");
		btnLogin.setBorder(BorderFactory.createEmptyBorder());
		btnLogin.setSize(90,30);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Roboto", Font.PLAIN, 18));
		btnLogin.setBackground(new Color(124, 241, 144));
		btnLogin.setFocusPainted(false); // Tắt focus vào title của button, tạo ra border của text khó chịu vc

		LeftSubPanel pnlLeftPanel = new LeftSubPanel();
		JPanel pnlRight = new JPanel(null);

		// Panel chứ title
		JPanel test = new JPanel();
		test.add(lblTitleLogin);
		test.setBounds(0,60,400,100);

		// Panel chứa lbl username + txt username
		JPanel test2 = new JPanel(new BorderLayout());
		test2.setBorder(BorderFactory.createEmptyBorder(0,40,0,40));
		test2.add(lblUsername, BorderLayout.NORTH);
		test2.add(txtUsername);
		test2.setBounds(0,160,400,60);

		// Panel chứa lbl password + txt password
		JPanel test4 = new JPanel(new BorderLayout());
		test4.setBorder(BorderFactory.createEmptyBorder(0,40,0,40));
		test4.add(lblPassword, BorderLayout.NORTH);
		test4.add(txtPassword);
		test4.setBounds(0,240,400,60); //ada

		// Panel chứa button đăng nhập
		JPanel test6 = new JPanel(new BorderLayout());
		test6.setBorder(BorderFactory.createEmptyBorder(0,100,0,100));
		test6.add(btnLogin);
		test6.setBounds(0,340,400,60);

		// Thêm các component vào rightPanel
		pnlRight.add(test);
		pnlRight.add(test2);
		pnlRight.add(test4);
		pnlRight.add(test6);
		

		btnLogin.addActionListener(this);
		loginFrame.setLayout(new GridLayout(1,2));
		loginFrame.add(pnlLeftPanel);
		loginFrame.add(pnlRight);
		loginFrame.setSize(800,600);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		loginFrame.setVisible(true);
	}

		public static void main(String[] args) {
		new DangNhap();
	}
	class LeftSubPanel extends JPanel{
		public LeftSubPanel(){
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			ImageIcon icon = new ImageIcon(getClass().getResource("/img/hinh1.png"));
	        JLabel background = new JLabel(icon);
	        background.setLayout(new BoxLayout(background, BoxLayout.Y_AXIS));

	        background.add(Box.createVerticalStrut(50));
	        setBackground(new Color(248, 248, 248));
	        
			add(background);
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == btnLogin) {
			validateLogin();
		}
	}

	private void validateLogin() {
		try {
			String user = txtUsername.getText();
			String pwd = txtPassword.getText();
			
			
			//lay ten nhan vien
			
			
			
				
					if(user.equalsIgnoreCase("1")&&pwd.equalsIgnoreCase("1")) {
						loginFrame.dispose();
						
						new Menu();
						return;
						
					}
					
				
			

			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
