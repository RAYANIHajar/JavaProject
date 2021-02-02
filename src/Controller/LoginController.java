package Controller;

import java.net.URL;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class LoginController implements Initializable{
	
    @FXML
    private FontAwesomeIcon fermer;

    @FXML
    private TextField email;

    @FXML
    private PasswordField motdepass;

    @FXML
    private Button confirmer;

    @FXML
    private Hyperlink reset;
    
    

	public void initialize(URL arg0, ResourceBundle arg1) {

		
	}

}
