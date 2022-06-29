package com.nt.jdbc;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TableCreation  {

	public static void main(String[] args) {
		new TableCreation();

	}//main

	
	public TableCreation() {
		JFrame frame=new JFrame("TableCreation");
		String[][] rowsData= {{"Hari","Ram"},{"Krishna","Hari"}};
		String[] columns= {"Student Name","College"};
		JTable table=new JTable(rowsData,columns);
		JPanel panel=new JPanel();
		panel.add(table);
		frame.add(panel);
		
		frame.setSize(450, 350);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}//class
