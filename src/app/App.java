package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout; 
import java.awt.event.ItemEvent; 


public class App{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JToggleButton btngreen = new JToggleButton("Green");
		JToggleButton btnred= new JToggleButton("Red");
		JToggleButton btnorange= new JToggleButton("Orange");
		
		Font font = new Font("VERDANA",Font.BOLD,15);
		
		btngreen.setFont(font);
		btnred.setFont(font);
		btnorange.setFont(font);
		
		btngreen.setBounds(150,50,100,40);
		btngreen.setBackground(Color.LIGHT_GRAY);
		btngreen.setSize(100,35);	

		btnred.setBounds(150,150,100,40);
		btnred.setSize(100,35);
		btnred.setBackground(Color.LIGHT_GRAY);

		btnorange.setBounds(150, 250, 100, 40);
		btnorange.setBackground(Color.LIGHT_GRAY);
		btnorange.setSize(100,35);
		
		frame.add(btngreen);
		frame.add( btnred);
		frame.add(btnorange);
		
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
		frame.setBackground(Color.red);
		frame.setFont(font);
		ItemListener itemListenerRed = new ItemListener() { 	
            public void itemStateChanged(ItemEvent itemEvent) 
            { 
                int state = itemEvent.getStateChange(); 
                
                if (state == ItemEvent.SELECTED) { 
            		frame.getContentPane().setBackground( Color.red );
            		System.out.println("Color rojo"); 
                } 
            } 
        }; 
		ItemListener itemListenerGreen = new ItemListener() { 	
            public void itemStateChanged(ItemEvent itemEvent) 
            { 
                int state = itemEvent.getStateChange(); 
                
                if (state == ItemEvent.SELECTED) { 
            		frame.getContentPane().setBackground( Color.green );
            		System.out.println("Color Verde"); 
                } 

            } 
        }; 
		ItemListener itemListenerOrange = new ItemListener() { 	
            public void itemStateChanged(ItemEvent itemEvent) 
            { 
                int state = itemEvent.getStateChange(); 
                
                if (state == ItemEvent.SELECTED) { 
            		frame.getContentPane().setBackground( Color.orange );
            		System.out.println("Color Naranja"); 
                } 

            } 
        }; 
  
        btngreen.addItemListener(itemListenerGreen); 
        btnred.addItemListener(itemListenerRed); 
        btnorange.addItemListener(itemListenerOrange); 
	}
}