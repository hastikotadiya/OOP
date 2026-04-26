import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class RegistrationForm extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Button submitBtn = new Button("Submit");
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);
        submitBtn.setOnAction(e -> {
            String roll = rollField.getText();
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();
            try {
                int rollNo = Integer.parseInt(roll);
                int ageVal = Integer.parseInt(age);
                if (!email.contains("@") || !email.contains(".")) {
                    showError("Invalid Email! Must contain @ and .");
                    return;
                }
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                File file = fileChooser.showSaveDialog(stage);
                if (file != null) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write("Roll No: " + rollNo + "\n");
                    writer.write("Name: " + name + "\n");
                    writer.write("Age: " + ageVal + "\n");
                    writer.write("Email: " + email + "\n");
                    writer.close();
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Registration Successful!");
                alert.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + ageVal +
                        "\nEmail: " + email
                );
                alert.showAndWait();
            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers!");
            }
        });
        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Validation Failed");
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
