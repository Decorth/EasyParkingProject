import javax.swing.*;
import java.awt.*;

/**
* Parses an SQL statement and uses a connection to a database to parse that sql statement over to the database management system to execute
*
* @author Dylan Connolly
* @version 30 Mar 2018
*/

public class EasyParking{

  public static void main(String [] args){
    HomeInterface interface1 = new HomeInterface();
    interface1.setSize(900, 500);
    interface1.pack();
    interface1.setVisible(true);
  }
}
