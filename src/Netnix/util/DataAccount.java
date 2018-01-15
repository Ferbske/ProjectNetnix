package Netnix.util;

import Netnix.classes.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
This class is made for creating a List with all the Accounts so it can be used to get all the information in the Accounts JTable
*/

public class DataAccount {
    private static List<Account> accounts = new ArrayList<>();

    public static void createAccounts(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            accounts = new ArrayList<>();
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Account";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int abonneenummerAcc = rs.getInt("Abonneenummer");
                String naam = rs.getString("Naam");
                String straat = rs.getString("Straat");
                String postcode = rs.getString("Postcode");
                int huisnummer = rs.getInt("Huisnummer");
                String plaats = rs.getString("Plaats");
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