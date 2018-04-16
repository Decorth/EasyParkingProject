import java.sql.*;
import java.lang.*;
import java.util.*;

/**
* Verifies whether the user has input the correct username or password
*
* @author Dylan Connolly
* @version 27 Mar 2018
*/

public class LoginAuthenticator(){

    private static String host = "jdbc:derby://localhost:1527/EasyParkingDatabase";
    private static String serverUsername = "administrator";
    private static String serverPassword = "admin";

  public boolean LoginAuthenticator(String clientUsername, String clientPassword){
      try{
        Connection con = DriverManager.getConnection(host, serverUsername, serverPassword);
        SQLParser Parser = new SQLParser();
        if (Parser.parse("SELECT Password FROM Member WHERE Username = " + ClientUsername, con) == ClientPassword){
          return true;
        }
        else {
          return false;
        }
      } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
