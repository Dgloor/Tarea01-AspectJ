package app;

public class App {

	public static void main(String[] args) {
		Screen screen = new Screen();
		Button a = new Button("Green");
		a.setObserver(screen);
		Button b = new Button("Red");
		b.setObserver(screen);
		Button c = new Button("Orange");
		c.setObserver(screen);
		screen.addButton(a, 150, 100);
		screen.addButton(b, 150, 200);
		screen.addButton(c, 150, 300);

		screen.show();
	}
}