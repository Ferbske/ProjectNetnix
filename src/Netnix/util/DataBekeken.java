package Netnix.util;

import Netnix.classes.Bekeken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
This class is made for creating a List with all the Accounts so it can be used to get all the information in the Bekeken JTable
*/

public class DataBekeken {
    private static List<Bekeken> bekekenList = new ArrayList<>();

    public static void createBekeken(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Bekeken";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int abonneenummerBek = rs.getInt("Abonneenummer");
                String profielNaamBek = rs.getString("Profielnaam");
                int gezien = rs.getInt("Gezien");
                int procent = rs.getInt("Procent");
                Bekeken bek = new Bekeken(abonneenummerBek,profielNaamBek,gezien,procent);
                DataBekeken.addBekeken(bek);
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

    public static void addBekeken(Bekeken bekeken){
        bekekenList.add(bekeken);
    }

    public static List<Bekeken> getBekeken(){
        return bekekenList;
    }
}