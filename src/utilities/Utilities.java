package utilities;

import java.awt.Color;

public final class Utilities {
	
	
	public static Color getColorByName(String name) {
	    try {
	        return (Color)Color.class.getField(name.toUpperCase()).get(null);
	    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	        e.printStackTrace();
	        return null;
	    }
	}

}
