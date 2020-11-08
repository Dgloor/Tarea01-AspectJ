package app;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JToggleButton;



public class App{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JToggleButton btngreen = new JToggleButton("Green");
		btngreen.setBounds(150,50,100,40);
		btngreen.setBackground(Color.LIGHT_GRAY);
		btngreen.setSize(100,35);
		Font font = new Font("VERDANA",Font.BOLD,15);
		btngreen.setFont(font);
		frame.add(btngreen);
	
		
		JToggleButton btnred= new JToggleButton("Red");
		btnred.setBounds(150,150,100,40);
		btnred.setSize(100,35);
		btnred.setBackground(Color.LIGHT_GRAY);
		Font font2 = new Font("VERDANA",Font.BOLD,15);
		btnred.setFont(font2);
		 
		 frame.add( btnred);
	
		
		JToggleButton btnorange= new JToggleButton("Orange");
		btnorange.setBounds(150, 250, 100, 40);
		btnorange.setBackground(Color.LIGHT_GRAY);
		btnorange.setSize(100,35);
		Font font3 = new Font("VERDANA",Font.BOLD,15);
		btnorange.setFont(font3);
		
		frame.add(btnorange);
		
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
		
		
	}
}