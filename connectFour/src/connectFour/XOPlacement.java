package connectFour;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class XOPlacement {

	protected Circle[][] bob = new Circle[6][7];
	
	protected XOPlacement() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				bob[i][j] = new Circle((150+(100*i)),(150+100*j), 40, Color.WHITE);
			}
		}
	}

	public Circle[][] getPlacement() {
		return bob;
	}
}
