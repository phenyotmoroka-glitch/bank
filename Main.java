import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
 
public class App extends Application {
 
 Stage FNB;
    @Override
    public void start(Stage stage) {
    	stage = FNB;//idk one before the other or something
        View view = new View();            // builds all x screens 
        new Controller(view);              // attaches every button action, i think
 
        ScrollPane scrl = new ScrollPane(view.getRoot());
        scroll.setFitToWidth(true);        // stretch to window width if theres too much content or something
 
        stage.setTitle("Banking System");
        stage.setScene(new Scene(scrl, 800, 650));   // one Scene, created once (name it something) or not
        stage.show();
    }
 
    public static void main(String[] phenyo) {
        launch(phenyo);
    }
}

