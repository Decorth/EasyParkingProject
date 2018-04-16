import java.sql.*;
import java.lang.*;
import java.util.*;

/**
* Creates the tables for the database using SQL database definition language
*
* @author Dylan Connolly
* @version 24 Mar 2018
*/

public class DatabaseInstallerUser{

  private static String memberTable = "CREATE TABLE EasyParkingDatabase.Member (IDNo CHAR(9) NOT NULL, Name VARCHAR(30) NOT NULL, Username VARCHAR(15) NOT NULL, Password VARCHAR(15) NOT NULL, PlateNo VARCHAR(7) NOT NULL, PRIMARY KEY (IDNo), FOREIGN KEY (PlateNo) REFERENCES EasyParkingDatabase.Car (PlateNo))";

  private static String carTable = "CREATE TABLE EasyParkingDatabase.Car (PlateNo VARCHAR(7) NOT NULL, Manufacturer VARCHAR(30) NOT NULL, Model VARCHAR(15), CarTypeNum VARCHAR(4) NOT NULL, PRIMARY KEY (PlateNo), FOREIGN KEY (CarTypeNum) REFERENCES EasyParkingDatabase.TypeInfo (CarTypeNum))";

  private static String licenseTable = "CREATE TABLE EasyParkingDatabase.License (LicenseNo NOT NULL, ValidDate DATE NOT NULL, IDNo CHAR(9) NOT NULL, PRIMARY KEY (LicenseNo), FOREIGN KEY (IDNo) REFERENCES EasyParkingDatabase.Member (IDNo))";

  private static String parkingLotTable = "CREATE TABLE EasyParkingDatabase.ParkingLot (LotID VARCHAR(2) NOT NULL, Booking TEXT NOT NULL, Position VARCHAR(2) NOT NULL, PRIMARY KEY (LotID))";

  private static String typeInfoTable = "CREATE TABLE EasyParkingDatabase.TypeInfo (CarTypeNum VARCHAR(4) NOT NULL, CarType TEXT NOT NULL, ParkingTypeNumber INT NOT NULL, Price DEG(4,2) NOT NULL, PRIMARY KEY (CarTypeNum))";

  private static String parkingInfoTable = "CREATE TABLE EasyParkingDatabase.ParkingInfo (Position VARCHAR(2) NOT NULL, CarNum INT NOT NULL, LotID VARCHAR(2) NOT NULL, StartTime DEG(2,2) NOT NULL, PRIMARY KEY (Position), FOREIGN KEY (LotID) REFERENCES EasyParkingDatabase.ParkingLot (LotID))";

  private static String host = "jdbc:derby://localhost:1527/EasyParkingDatabase";
  private static String username = "administrator";
  private static String password = "admin";

  public static void main(String [] args){
    try{
      Connection con = DriverManager.getConnection(host, username, password);
      SQLParser Parser = new SQLParser();
      Parser.parse(parkingLotTable, con);
      Parser.parse(typeInfoTable, con);
      Parser.parse(parkingInfoTable, con);
      Parser.parse(carTable, con);
      Parser.parse(memberTable, con);
      Parser.parse(licenseTable, con);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
