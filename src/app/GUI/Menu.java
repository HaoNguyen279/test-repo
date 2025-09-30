package app.GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MenuBar;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Menu extends JFrame{
	public Menu() {
		JFrame frame = new JFrame("Menu Demo");
	    JMenuBar menuBar = new JMenuBar();
	    
	    JLabel ten = new JLabel("Ten nv:Huynh Gia Man");
	    
	    menuBar.setPreferredSize(new Dimension(50,40));
	     
	    // Tạo menu chính
	    JMenu menuHeThong = new JMenu("Hệ thống");
	    JMenu menuDanhMuc = new JMenu("Danh mục");
	    JMenu menuCapNhat = new JMenu("Cập nhật");
	    JMenu menuTimKiem = new JMenu("Tìm kiếm");
	    JMenu menuXuLi = new JMenu("Xử lý");
	    JMenu menuThongKe = new JMenu("Thống kê");
	    
	    

	    menuHeThong.setHorizontalAlignment(SwingConstants.CENTER);
	    menuCapNhat.setHorizontalAlignment(SwingConstants.CENTER);
	    menuDanhMuc.setHorizontalAlignment(SwingConstants.CENTER);
	    menuThongKe.setHorizontalAlignment(SwingConstants.CENTER);
	    menuTimKiem.setHorizontalAlignment(SwingConstants.CENTER);
	    menuXuLi.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    
	    
	    JMenuItem openItem = new JMenuItem("Open");
	    JMenuItem exitItem = new JMenuItem("Exit");
	    JMenuItem testItem1 = new JMenuItem("Test menu");
	    JMenuItem testItem2 = new JMenuItem("Test menu");
	    JMenuItem testItem3 = new JMenuItem("Test menu");
	    JMenuItem testItem4 = new JMenuItem("Test menu");
	    
	    
	    openItem.setPreferredSize(new Dimension(60,20));
	    exitItem.setPreferredSize(new Dimension(60,20));
	    testItem1.setPreferredSize(new Dimension(60,20));
	    testItem2.setPreferredSize(new Dimension(60,20));
	    testItem3.setPreferredSize(new Dimension(60,20));
	    testItem4.setPreferredSize(new Dimension(60,20));
	    
	    testItem1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Demo menu chức năng"));
	    testItem2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Demo menu chức năng"));
	    testItem3.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Demo menu chức năng"));
	    testItem4.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Demo menu chức năng"));
	    
	    
	    exitItem.addActionListener(e -> System.exit(0));

	    menuHeThong.add(openItem);
	    menuHeThong.add(exitItem);
	    menuCapNhat.add(testItem1);
	    menuThongKe.add(testItem2);
	    menuTimKiem.add(testItem3);
	    menuXuLi.add(testItem4);
	    
	   
	    JMenuItem aboutItem = new JMenuItem("About");
	    aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Demo menu chức năng"));
	    menuDanhMuc.add(aboutItem);
	    menuXuLi.add(openItem);
	    
	    
	    ImageIcon icon = new ImageIcon(getClass().getResource("../../resources/image/hinh-anh-nha-thuoc.jpg"));
        JLabel background = new JLabel(icon);
      
        
	    menuBar.add(menuHeThong);
	    menuBar.add(menuDanhMuc);
	    menuBar.add(menuCapNhat);
	    menuBar.add(menuTimKiem);
	    menuBar.add(menuXuLi);
	    menuBar.add(menuThongKe);
	    menuBar.add(Box.createHorizontalGlue());
	    menuBar.add(ten);
	    menuBar.add(Box.createHorizontalStrut(10));
	   
	    frame.add(background);
	    frame.setJMenuBar(menuBar);
	    frame.setSize(1028, 720);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    setLocationRelativeTo(null);
	}
}
