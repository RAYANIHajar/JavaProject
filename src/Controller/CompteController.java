package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class CompteController implements Initializable {
	
	 @FXML
	    private TextField volimpot;

	    @FXML
	    private TextField volstotal;

	    @FXML
	    private TextField voltotal;

	    @FXML
	    private TextField hoteltotal;

	    @FXML
	    private TextField hotelimpot;

	    @FXML
	    private TextField hotelstotal;

	    @FXML
	    private TextArea facture;

	    @FXML
	    void afficheinfo(MouseEvent event) {

	    }


	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
