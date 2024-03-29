package Netnix.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
This Class is made for writing new Entities in the Database
*/
public class DataWrite {
    public static void writeAccount(String Abonneenummer, String Naam, String Straat, String Postcode, String Huisnummer, String Plaats){
        String SQL = "INSERT INTO Account (Abonneenummer, Naam, Straat, Postcode, Huisnummer, Plaats) " +
                "VALUES (" + Abonneenummer + ",'" + Naam + "','" + Straat + "','" + Postcode + "'," + Huisnummer + ",'" + Plaats + "');";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();
            stmt.executeQuery(SQL);
//            rs = stmt.executeQuery(SQL);
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
    public static void writeProfiel(String Abonneenummer, String Profielnaam, String Geboortedatum){
        String SQL = "INSERT INTO Profiel (Abonneenummer, Profielnaam, Geboortedatum) " +
                "VALUES (" + Abonneenummer + ",'" + Profielnaam + "','" + Geboortedatum + "');";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();
            stmt.executeQuery(SQL);
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
    public static void writeBekeken(String Abonneenummer, String Profielnaam, String Gezien, String Procent){
        String SQL = "INSERT INTO Bekeken (Abonneenummer, Profielnaam, Gezien, Procent) " +
                "VALUES (" + Abonneenummer + ",'" + Profielnaam + "'," + Gezien + "," + Procent + ");";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();
            stmt.executeQuery(SQL);
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
