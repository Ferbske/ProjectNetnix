package Netnix.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
This Class is made for updating Entities in the Database
*/
public class DataUpdate {
    public static void updateAccount(String Abonneenummer, String Naam, String Straat, String Postcode, String Huisnummer, String Plaats){
        String SQL = "UPDATE Account " +
                "SET Naam = '" + Naam + "'," +
                "Straat = '" + Straat + "'," +
                "Postcode = '" + Postcode + "'," +
                "Huisnummer = " + Huisnummer + "," +
                "Plaats = '" + Plaats + "' " +
                "WHERE Abonneenummer = " + Abonneenummer + ";";
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
    public static void updateProfiel(String Abonneenummer, String Profielnaam, String Geboortedatum){
        String SQL = "UPDATE Profiel " +
                "SET Profielnaam = '" + Profielnaam + "'," +
                "Geboortedatum = '" + Geboortedatum + "' " +
                "WHERE Abonneenummer = " + Abonneenummer + ";";
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
    public static void updateBekeken(String Abonneenummer, String Profielnaam, String Gezien, String Procent){
        String SQL = "UPDATE Bekeken " +
                "SET Gezien = " + Gezien + "," +
                "Procent = " + Procent +
                " WHERE Abonneenummer = " + Abonneenummer + " AND Profielnaam = '" + Profielnaam + "';";
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
