package Netnix.util;

import Netnix.classes.Profiel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
This class is made for creating a List with all the Accounts so it can be used to get all the information in the Profielen JTable
*/

public class DataProfiel {
    private static List<Profiel> profielen = new ArrayList<>();

    public static void createProfielen(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Profiel";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int abonneenummerPro = rs.getInt("Abonneenummer");
                String profielNaamPro = rs.getString("Profielnaam");
                Date geboortedatum = rs.getDate("geboortedatum");
                Profiel pro = new Profiel(abonneenummerPro,profielNaamPro,geboortedatum);
                DataProfiel.addProfiel(pro);
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

    public static void addProfiel(Profiel profiel){
        profielen.add(profiel);
    }

    public static List<Profiel> getProfielen(){
        return profielen;
    }
}