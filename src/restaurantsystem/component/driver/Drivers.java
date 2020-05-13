package restaurantsystem.component.driver;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Drivers {

  public static Connection getConnection() throws Exception {
    String driver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://localhost/restaurant";
    String username = "root";
    String password = "root";

    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static void main(String[] args)throws Exception {
    String id = "001";
    String fileName = "item.txt";
    
    FileInputStream fis = null;
    PreparedStatement pstmt = null;
    Connection conn = null;
    try {
      conn = getConnection();
      conn.setAutoCommit(false);
      File file = new File(fileName);
      fis = new FileInputStream(file);
      pstmt = conn.prepareStatement("insert into items(item_name, item_name, item_quantity) values (?, ?, ?)");
      pstmt.setString(1, id);
      pstmt.setString(2, fileName);
      pstmt.setAsciiStream(3, fis, (int) file.length());
      pstmt.executeUpdate();
      conn.commit();
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
      e.printStackTrace();
    } finally {
      pstmt.close();
      fis.close();
      conn.close();
    }
  }
}