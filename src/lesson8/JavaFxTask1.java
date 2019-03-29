package lesson8;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Base64;


public class JavaFxTask1 {

    //Utwórz aplikację, która zaszyfruje podany ciąg znaków algorytmem base64 oraz wyświetli wynik w postaci łatwej do skopiowania.
    // Wykorzystaj klasę Base64 do zakodowania tekstu.

    public static void main(String[] args) {
        // launch (args);

    }

    public void start(Stage stage) {
        Button button = new Button("Button");
        Text text = new Text ("Click the button");
        button.setOnAction(e -> text.setText("clicked"));
        TextField textField = new TextField();
        Base64.getEncoder();


        Label label = new Label();
        ObjectProperty<Font> fontProperty = label.fontProperty();
        fontProperty.setValue(new Font(24));
        textField.setOnAction(e -> label.setText(textField.getText()));

        VBox vBox = new VBox();

        ObservableList<Node> children = vBox.getChildren();
        children.addAll(button, text, textField, label);

        stage.setTitle("Without FXML");
        stage.setScene(new Scene(vBox, 300, 200));
        stage.show();
    }

}
