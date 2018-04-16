import java.sql.*;

/**
* Parses an SQL statement and uses a connection to a database to parse that sql statement over to the database management system to execute
*
* @author Dylan Connolly
* @version 24 Mar 2018
*/

public class SQLParser{

  public void SQLParser(){
  }

  public void parse(String sqlstatement, Connection con) throws SQLException{
    try {
      Statement stmt = null;
      stmt = con.createStatement();
      stmt.executeUpdate(sqlstatement);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
