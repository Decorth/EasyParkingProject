import javax.swing.*;
import java.awt.*;

/**
* Parses an SQL statement and uses a connection to a database to parse that sql statement over to the database management system to execute
*
* @author Dylan Connolly
* @version 31 Mar 2018
*/

public class LoginScreen extends JFrame{

  /**
   * Creates a JFrame with title "EasyParking System"
   */
  public LoginScreen() {
    super("EasyParking System");
  }
  
  public void LoginScreen(){
    this.JFrame("EasyParking System");  // NEED TO FIX THIS
    BuildLoginScreenTopPanel();
    BuildLoginScreenMiddlePanel();
    BuildLoginScreenBottomPanel();
  }



}
