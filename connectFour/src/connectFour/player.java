package connectFour;

import javafx.scene.control.Button;

public class player extends playerbase{


	public player(String color, String name) {
		super(name, color);
	}
	
	public void win() {
		System.out.printf("%s Wins!%n", name);
	}
	
	public void lose() {
		System.out.printf("%s Loses!%n", name);
	}
	
}
