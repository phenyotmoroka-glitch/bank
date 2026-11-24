//view
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;



public class LogScreen
{

			 BorderPane root = new BorderPane();

			public LogScreen(){
					//borderpane 
						BorderPane.setAlignment(pagelbl, Pos.CENTER);

					BorderPane.setMargin(pagelbl, new Insets(0, 0, 50, 0));

					root.setPadding(new Insets(30));
					root.setTop(pagelbl);
					root.setCenter(login);

					//others
					pagelbl.setId("pagelbl");
					pswrd.setId("password");          //setId to target it specifically mo css
					pswrd.setPromptText("Password");
					txf.setPromptText("Username");
			}


			// Login view
			private Button login_btn = new Button("Login");

			private Label pagelbl = new Label("Customer Login");

			private Hyperlink link1 = new Hyperlink("Forgot Password");
			private Hyperlink link2 = new Hyperlink("Create Account");
			private HBox loginlinks = new HBox(50, link1, link2);


			private PasswordField pswrd = new PasswordField();
			private TextField txf = new TextField();
			private VBox login = new VBox(20, txf, pswrd, login_btn, loginlinks);

				




			//Dashboard



}
