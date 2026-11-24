//view
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
		import javafx.scene.control.Separator;

import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.geometry.Pos;



public class RegScreen
{

			BorderPane root = new BorderPane();

			public RegScreen(){

					//Borderpane

					root.setPadding(new Insets(30));
					root.setTop(pagelbl);
					root.setCenter(create);
						BorderPane.setAlignment(pagelbl, Pos.CENTER);
					BorderPane.setMargin(pagelbl, new Insets(0, 0, 50, 0));

						// others
					pswrd.setId("password");          
					  pagelbl.setId("pagelbl");                                                    
					  	pswrd.setPromptText("Password");
					txf.setPromptText("Username");
					txf2.setPromptText("Name");
					txf3.setPromptText("Surname");
					txf4.setPromptText("Omang or Passport ID");
					txf5.setPromptText("email");
			}


			// Registration view
	private		Button create_btn = new Button("Create");

	private		Label pagelbl = new Label("Customer Registration");


	private		PasswordField pswrd = new PasswordField();
	private		TextField txf = new TextField();
	private		TextField txf2 = new TextField();
	private		TextField txf3 = new TextField();
		private		TextField txf4 = new TextField();
			private		TextField txf5 = new TextField();
	private		VBox create = new VBox(20, txf2, txf3, txf4, txf5, txf, pswrd, create_btn);   //THERE SHOULD BE A LOOP,checks of these ae true

				




			//Dashboard
}
