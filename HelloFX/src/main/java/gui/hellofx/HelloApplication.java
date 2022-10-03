package gui.hellofx;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTSKYBLUE);

        primaryStage.setTitle("HelloFX");
        Image icon = new Image("file:///home/darksoul/Documents/Programming/Java/HelloFX/src/main/java/assets/fire.png");
        primaryStage.getIcons().add(icon);

        primaryStage.setWidth(950);
        primaryStage.setHeight(550);
        primaryStage.setResizable(false);

        //Text
        Text text = new Text();
        text.setText("YO YO YO YO");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Space Mono", 50));
        text.setFill(Color.PURPLE);

        //Line
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(500);
        line.setStrokeWidth(10);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);

        //Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(150);
        rectangle.setY(30);
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setFill(Color.BLACK);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.YELLOWGREEN);
        rectangle.setCursor(Cursor.HAND);
        rectangle.setRotate(45);

        //Triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 200.0
            );
        triangle.setFill(Color.YELLOW);

        //Circle
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ROSYBROWN);

        //Image
        Image image = new Image("file:///home/darksoul/Documents/Programming/Java/HelloFX/src/main/java/assets/settings.gif");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        //Adding Process
        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}