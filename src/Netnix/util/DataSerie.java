package Netnix.util;

import Netnix.Classes.Serie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
This class is made for creating a List with all the Accounts so it can be used to get all the information in the Serie JTable
*/

public class DataSerie {
    private static List<Serie> series = new ArrayList<>();

    public static void createSeries(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Serie";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                String serie = rs.getString("Serie");
                String leeftijdSerie = rs.getString("Leeftijd");
                String taalSerie = rs.getString("Taal");
                String genreSerie = rs.getString("Genre");
                String lijktOp = rs.getString("LijktOp");
                Serie ser = new Serie(serie,leeftijdSerie,taalSerie,genreSerie,lijktOp);
                DataSerie.addSerie(ser);
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

    public static void addSerie(Serie serie){
        series.add(serie);
    }

    public static List<Serie> getSeries(){
        return series;
    }
}