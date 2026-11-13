import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


//view
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
// import javafx.scene.control.ScrollPane;

public class Main extends Application{

//elements(view)
    Button btn = new Button("Press me please");
    TextField txf = new TextField();  //TODO:do u take any arguments
    Label lbl = new Label("Home Page");



@Override
public void start(Stage window){
        //scrollpane(optional ig)

        //layout
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(btn, txf, lbl);


        //scene
    Scene scn = new Scene(root, 1080,720);
    scn.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
lbl.getStyleClass().add("title");

    window.setTitle("Banking App");
    window.setScene(scn);
    window.show();



}







    public static void main(String[]phenyo){launch(phenyo);}
}
