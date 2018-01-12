package Netnix.util;

import Netnix.Aflevering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
This class is made for creating a List with all the Accounts so it can be used to get all the information in the Aflevering JTable
*/

public class DataAflevering {
    private static List<Aflevering> afleveringen = new ArrayList<>();

    public static void createAfleveringen(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Aflevering";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int Aflevering_ID = rs.getInt("Aflevering_ID");
                String Serie = rs.getString("Serie");
                String Seizoen = rs.getString("Seizoen");
                String Titel = rs.getString("Titel");
                String Tijdsduur = rs.getString("Tijdsduur");
                Aflevering afl = new Aflevering(Aflevering_ID, Serie, Seizoen, Titel, Tijdsduur);
                DataAflevering.addAflevering(afl);
            }
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

    public static void addAflevering(Aflevering aflevering){
        afleveringen.add(aflevering);
    }

    public static List<Aflevering> getAfleveringen(){
        return afleveringen;
    }
}
