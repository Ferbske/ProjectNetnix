package Netnix.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
This Class is made for writing new Entities in the Database
*/
public class DataWrite {
    public static void writeAccount(String a, String b, String c, String d, String f){
        //Query that needs to be executed:
        String SQL = "INSERT INTO Afleveringen (Aflevering_ID, Serie, Seizoen, Titel, Tijdsduur) VALUES (" + a + ",'" + b + "','" + c + "','" + d + "','" + f + "');";
        //Nessesary information for the connection with the Database
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
}
