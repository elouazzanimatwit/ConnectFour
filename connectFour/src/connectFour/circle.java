package connectFour;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class circle extends XOPlacement{

	private double xPos;
	private double yPos;
	
	private Circle graphic;
	
	public circle(double xPos, double yPos, double radius, Color a) {
		this.xPos = xPos;
		this.yPos = yPos;
		
		graphic = new Circle(xPos, yPos, radius);
		graphic.setFill(a);
	}
	
	
	
	public void move(double a, double b) {
		if(a < 650 && b < 650) {
			xPos = a;
			yPos = b;
		} else if(a > 150 && b > 150){
			xPos = a;
			yPos = b;
		} else {
			System.out.println("Please move within the provided Play Area!");
		}
	}
	
	public void updateGraphic() {
		graphic.setCenterX(xPos);
		graphic.setCenterY(yPos);
	}


	public Circle getGraphic() {
		return graphic;
	}
	
	
}
