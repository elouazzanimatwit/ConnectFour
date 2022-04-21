package connectFour;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class square {
	
	private Rectangle graphic;
	
	public square(double xPos, double yPos) {
		graphic = new Rectangle();
		graphic.setX(xPos);
		graphic.setY(yPos);
		graphic.setWidth(600);
		graphic.setHeight(600);
		graphic.setArcWidth(20);
		graphic.setArcHeight(20);
		graphic.setFill(Color.BLACK);
	}
	
	public Rectangle getGraphic() {
		return graphic;
	}
	
}
