package control;
	
import java.io.IOException;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;


public class Main extends Application {
	private Stage primaryStage;
    private AnchorPane rootLayout;

	public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Escuela AID");

        primaryStage.show();
        initRootLayout();

    }
	
	private void initRootLayout() {
		try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/principal.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            
            
            	//Para cambiar el cursor del programa
            /*Image cursor = new Image("file:resources/Ratón.png");
            scene.setCursor(new ImageCursor(cursor));*/
            
            	//Añadir fuentes desde pagina externa o descargada
            Font.loadFont(getClass().getResourceAsStream("file:resources/fuentes/BLADRMF_.TTF"),30);
            Font.loadFont(getClass().getResourceAsStream("file:resources/fuentes/alienleague.ttf"),50);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
