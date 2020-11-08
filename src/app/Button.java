package app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Observer;
import model.Subject;

public class Button implements Subject {
	private JButton btn;
	private String color;
	private Observer observer;

	public Button(String color) {
		this.color = color;
		this.btn = new JButton(color);
		this.btn.setText(color);
		this.btn.setBackground(Color.LIGHT_GRAY);
		this.btn.setSize(100, 35);
		addEvent();

	}

	public void addEvent() {
		this.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				report();
			}
		});
	}

	@Override
	public void report() {
		this.observer.update(this.color);
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		this.btn.setText(color);
	}

	public Observer getObserver() {
		return observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
	}

}
