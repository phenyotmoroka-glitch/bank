import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;


//view
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
// import javafx.scene.control.ScrollPane;

public class Main extends Application{

//elements(view)
   
    Label lbl = new Label("Home Page");
    Button btn = new Button("Do not press this");
    TextField txf = new TextField();  //TODO:do u take any arguments



@Override
public void start(Stage window){

    //view                                      //controller
           txf.setPromptText("Leina?");          btn.setOnAction(e -> {
                                                                        Alert alt = new Alert(Alert.AlertType.INFORMATION);
            lbl.getStyleClass().add("title");                                 alt.setTitle("Bruh");
                                                                            alt.setHeaderText(null);
                                                                            alt.setContentText("Why did you press that?");
                                                                            alt.showAndWait(); // This actually pops up the window
                                                                        } );
    


        //scrollpane(optional ig)

        //layout
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(lbl, txf, btn);


        //scene
    Scene scn = new Scene(root, 1080,720);
    scn.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
    
    window.setTitle("Banking App");
    window.setScene(scn);
    window.show();

}

    public static void main(String[]phenyo){launch(phenyo);}
}
