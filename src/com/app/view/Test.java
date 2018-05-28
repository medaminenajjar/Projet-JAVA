package com.app.view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.app.controller.*;
import com.app.model.*;
import com.app.view.*;
import java.awt.MediaTracker;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
public class Test {

	private JFrame frame;
	private SingleSelectionModel model;
	private JTable tab;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 998, 465);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
	
		frame.setVisible(true);
		frame.validate();
		frame.repaint();
	}


	public void setModell(Object[][] td, Vector tc) {
		DefaultTableModel tm = new DefaultTableModel(td, tc.toArray());
		table.setModel(tm);
		
		for (int i = 0; i < tc.size(); i++) {
			System.out.println(tc.get(i));
		}	
	}
	

}
