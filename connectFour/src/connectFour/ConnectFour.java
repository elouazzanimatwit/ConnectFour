package connectFour;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ConnectFour extends Application {
	
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception{
		// Beginning Startup for the Game!
		primaryStage.setTitle("Connect Four!");
		Pane p = new Pane();
		square q = new square(100, 100);
		XOPlacement h = new XOPlacement();
		p.getChildren().add(q.getGraphic());
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				Circle per = h.getPlacement()[i][j];
				p.getChildren().add(per);
			}
		}
		
		Scene s = new Scene(p,800,800);
		primaryStage.setScene(s);
		primaryStage.show();
		p.requestFocus();
		
		// Constantly updates the Scene determined by how many milliseconds is used!
		EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				for(int i = 5; i >= 0 ; i--) {
					for(int j = 0; j < 7; j++) {
						Circle per = h.getPlacement()[i][j];
						p.getChildren().add(per);
					}
				}
			}
		};
		
		p.setOnKeyPressed((e)->{
			if(e.getCode()==KeyCode.LEFT) {
				
			}else if(e.getCode() == KeyCode.RIGHT) {
				
			}
		});
		
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(30),eh));
		tl.setCycleCount(Timeline.INDEFINITE);
		tl.play();
	}

}
