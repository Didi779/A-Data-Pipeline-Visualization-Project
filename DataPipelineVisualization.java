
package datavisualization;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DataPipelineVisualization extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root pane
        Pane root = new Pane();

        // Create nodes representing stages in the data pipeline
        Label source = new Label("Source");
        Label processing1 = new Label("Processing 1");
        Label processing2 = new Label("Processing 2");
        Label sink = new Label("Sink");

        // Create lines connecting the stages
        Line line1 = new Line();
        line1.setStartX(100);
        line1.setStartY(50);
        line1.setEndX(200);
        line1.setEndY(50);

        Line line2 = new Line();
        line2.setStartX(300);
        line2.setStartY(50);
        line2.setEndX(400);
        line2.setEndY(50);

        Line line3 = new Line();
        line3.setStartX(500);
        line3.setStartY(50);
        line3.setEndX(600);
        line3.setEndY(50);

        // Position the nodes
        source.setLayoutX(50);
        source.setLayoutY(30);
        processing1.setLayoutX(200);
        processing1.setLayoutY(30);
        processing2.setLayoutX(400);
        processing2.setLayoutY(30);
        sink.setLayoutX(600);
        sink.setLayoutY(30);

        // Add nodes to the root pane
        root.getChildren().addAll(source, processing1, processing2, sink, line1, line2, line3);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 750, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Data Pipeline Visualization");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

