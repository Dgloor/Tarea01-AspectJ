package app;

import utilities.Utilities;

import javax.swing.JFrame;

import model.Observer;

public class Screen implements Observer {
	private JFrame frame;

	public Screen() {
		this.frame = new JFrame();
		this.frame.setSize(400, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setLayout(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setTitle("Just Homework");
	}

	public void show() {
		this.frame.setVisible(true);
	}

	public void addButton(Button btn, int x, int y) {
		this.frame.add(btn.getBtn());
		btn.getBtn().setBounds(x, y, 100, 40);
	}

	@Override
	public void update(String color) {
		this.frame.getContentPane().setBackground(Utilities.getColorByName(color));

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
