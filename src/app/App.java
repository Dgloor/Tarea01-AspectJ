package app;

import javax.swing.JFrame;

public class App {
	
	public static void main(String[] args) {
		new App();
	}
	
	public App() {
		JFrame frame = new JFrame("Colors");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
