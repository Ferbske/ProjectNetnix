package Netnix.util;

import Netnix.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataAccount {
    private static List<Account> accounts = new ArrayList<>();

    public static void createAccounts(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Accounts";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int abonneenummerAcc = rs.getInt("Aflevering_ID");
                String naam = rs.getString("Serie");
                String straat = rs.getString("Seizoen");
                String postcode = rs.getString("Titel");
                int huisnummer = rs.getInt("Tijdsduur");
                String plaats = rs.getString("");
                Account acc = new Account(abonneenummerAcc,naam,straat,postcode,huisnummer,plaats);
                DataAccount.addAccounts(acc);
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

    public static void addAccounts(Account account){
        accounts.add(account);
    }

    public static List<Account> getAccounts(){
        return accounts;
    }
}