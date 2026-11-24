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



public class DashScreen
{

		private	BorderPane root = new BorderPane();

			public DashScreen(){
				pagelbl.setId("pagelbl");
					root.setPadding(new Insets(30));
					root.setCenter(dashboard);
					pswrd.setId("password");          //setId to target it specifically mo css
					txf.setId("username");
					pswrd.setPromptText("Password");
					txf.setPromptText("Username");
			}


			// Login view
	private		Button dash_btn1 = new Button("");

	private			VBox nav = new VBox( ,sett_btn)
	private		Label pagelbl = new Label("Customer Login");


	private		Hyperlink link1 = new Hyperlink("Forgot Password");
	private		Hyperlink link2 = new Hyperlink("Create Account");
	private		VBox loginLinks = new HBox(50, link1, link2);


	private		PasswordField pswrd = new PasswordField();
	private		TextField txf = new TextField();
	private		VBox dashboard = new VBox(20, lbl, txf, pswrd, login_btn, loginLinks);

				





