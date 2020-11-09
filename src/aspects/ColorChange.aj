package aspects;
import model.Observer;


public aspect ColorChange {
	pointcut change(String x): call(void Observer.update(String)) && args(x);

	after(String color):change(color){
		System.out.println("New background color -> " + color + "\n");
	}
	
	before(String x): change(x){
		System.out.println("We are changing the background color to: "+x+"\n...please wait...\n");
	}
}
