//view
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;


public class DashScreen
{

		BorderPane root = new BorderPane();

			public DashScreen(){
	BorderPane.setAlignment(pagelbl, Pos.CENTER);
					BorderPane.setMargin(pagelbl, new Insets(0, 0, 50, 0));
					// BorderPane.setAlignment(nav, Pos.WEST);
					BorderPane.setMargin(nav, new Insets(0, 0, 0, -30));
					BorderPane.setMargin(dashboard, new Insets(0, 0, 0, 20));

				pagelbl.setId("pagelbl");
					root.setPadding(new Insets(30));
					// root.setTop(pagelbl);
					root.setLeft(nav);
					root.setCenter(dashboard);
					root.setBottom(dashlinks);
					nav.setId("nav");
					cardRow.setId("cardRow");          //setId to target it specifically mo css
					pagelbl.setId("pagelbl");
					welcomelbl.setId("welcome");
					dashlinks.setId("footer");
							}


			//header/navbar
	private		Button unlog_btn = new Button("Logout");
	private		Button oacc_btn = new Button("Open Account");
	private		Button deposit_btn = new Button("Deposit");
	private		Button withdraw_btn = new Button("Withdraw");

private		Label pagelbl = new Label("Dashboard");
	private 	VBox nav = new VBox(oacc_btn, deposit_btn, withdraw_btn, unlog_btn);
	
	


				//content
	private Label welcomelbl = new Label("Welcome,    !");   //there should be a contantinator for  name



		private HBox cardRow = new HBox(20); //empty  //loop

		private VBox dashboard = new VBox(20, pagelbl, welcomelbl, cardRow);


			//footer
	private		Hyperlink link1 = new Hyperlink("History");
	private		Hyperlink link2 = new Hyperlink("Settings");
	private		HBox dashlinks = new HBox(50, link1, link2);




				}


