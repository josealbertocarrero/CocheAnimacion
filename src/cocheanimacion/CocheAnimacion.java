package cocheanimacion;
import java.io.File;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CocheAnimacion extends Application {    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene ventana = new Scene(root, 600, 400);
        primaryStage.setScene(ventana);
        primaryStage.show();
        //Carretera
        File file = new File("carretera.jpg");
        Image img1 = new Image(file.toURI().toString());
        ImageView verimagen1 = new ImageView(img1);
        root.getChildren().add(verimagen1);
        //Coche
        File coche = new File("coche.png");
        Image img2 = new Image(coche.toURI().toString());
        ImageView verimagen2 = new ImageView(img2);
        root.getChildren().add(verimagen2);
        verimagen2.setY(500);
         AnimationTimer animationcar = new AnimationTimer() {
             int verimagen2setX=300;
             int verimagen2setY=200;
             int verimagen2CurrentSpeedX=3;
             int verimagen2CurrentSpeedY=3;
            @Override
            public void handle(long now) {
                verimagen2.setX(verimagen2setX);
                verimagen2setX+= verimagen2CurrentSpeedX;
                if(verimagen2setX >= 600){
                    verimagen2setX = -3;
                }
                if(verimagen2setX <= 0){
                    verimagen2CurrentSpeedX = 3;
                }
                verimagen2.setY(verimagen2setY);
                verimagen2setY+= verimagen2CurrentSpeedY;
                if(verimagen2setY >= 400){
                    verimagen2CurrentSpeedY = -3;
                }
                if(verimagen2setY <= 0){
                    verimagen2CurrentSpeedY = 3;
                }
            };
        };
    animationcar.start();
    }
}
