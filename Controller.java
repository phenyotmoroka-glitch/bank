import javafx.scene.control.Alert;
import javafx.scene.Scene;


public class Controller{

private Scene scn;

private LogScreen logview = new LogScreen();
// private RegScreen regView = new RegScreen();
// private DashScreen dashView = new DashScreen();
// private OpenAccountScreen oAccView = new OpenAccountScreen();
// private DepositScreen depView = new DepositScreen();
// private WithdrawalScreen withView = new WithdrawalScreen();
// private TransferScreen transView = new TransferScreen();
// private HistoryScreen hisView = new HistoryScreen();


Controller(LogScreen logview, Scene scn){
this.scn = scn;
this.logview = logview;

	actions();
}








public void actions(){



}





public void alert(){}
}









// //controller
//           btn.setOnAction(e -> {
//                             Alert alt = new Alert(Alert.AlertType.INFORMATION);
//             //lbl.getStyleClass().add("title");  makes it that homepage gets css after alert                               
//                                       alt.setTitle("Bruh");
//                                         alt.setHeaderText(null);
//                                         alt.setContentText("Why did you press that?");
//                                         alt.showAndWait(); // This actually pops up the window
//                                     } );