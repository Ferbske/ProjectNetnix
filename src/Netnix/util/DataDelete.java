package Netnix.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
This Class is made for deleting Entities in the Database
*/
public class DataDelete {
    public static void deleteAccount(String Abonneenummer){
        String SQL = "DELETE FROM Account WHERE Abonneenummer = " + Abonneenummer + ";";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
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
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
    public static void deleteProfiel(String Abonneenummer, String Profielnaam){
        String SQL = "DELETE FROM Profiel WHERE Abonneenummer = " + Abonneenummer + " AND Profielnaam = '" + Profielnaam +"';";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
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
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
    public static void deleteBekeken(String Abonneenummer, String Profielnaam, String Gezien){
        String SQL = "DELETE FROM Bekeken WHERE Abonneenummer = " + Abonneenummer + " AND Profielnaam = '" + Profielnaam + "' AND Gezien = " + Gezien + ";";
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";
        Connection con = null;
        Statement stmt = null;
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
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
}
