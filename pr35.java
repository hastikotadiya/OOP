import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;
public class GradeBarChart extends Application {
    @Override
    public void start(Stage stage) {
        int scale = 5; 
        VBox projectBar = createBar("Projects — 20%", 20, Color.RED, scale);
        VBox quizBar = createBar("Quizzes — 10%", 10, Color.BLUE, scale);
        VBox midtermBar = createBar("Midterm Exams — 30%", 30, Color.GREEN, scale);
        VBox finalBar = createBar("Final Exam — 40%", 40, Color.ORANGE, scale);
        HBox root = new HBox(30, projectBar, quizBar, midtermBar, finalBar);
        root.setAlignment(Pos.BOTTOM_CENTER); 
        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }
    private VBox createBar(String labelText, int percentage, Color color, int scale) {
        Rectangle bar = new Rectangle(50, percentage * scale);
        bar.setFill(color);
        Text label = new Text(labelText);
        VBox vbox = new VBox(5, bar, label);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        return vbox;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
