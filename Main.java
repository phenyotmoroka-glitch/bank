import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;




public class Main extends Application{



@Override
public void start(Stage window){

LogScreen logview = new LogScreen();
RegScreen regView = new RegScreen();
DashScreen dashView = new DashScreen();
// OpenAccountScreen oAccView = new OpenAccountScreen();
// DepositScreen depView = new DepositScreen();
// WithdrawalScreen withView = new WithdrawalScreen();
// TransferScreen transView = new TransferScreen();
// HistoryScreen hisView = new HistoryScreen();
 
        //scene
     
    Scene scn = new Scene(dashView.root, 1080,720);
    scn.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
    

// new Controller(logview, regView, dashView, oAccView, depView, withView, transView, hisView, scn);
    // new Controller(logview, scn);

    window.setTitle("Banking App");
    window.setScene(scn);
    window.show();

}

    public static void main(String[]phenyo){launch(phenyo);}
}
