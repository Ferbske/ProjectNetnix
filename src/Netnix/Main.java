package Netnix;

import Netnix.util.*;

import javax.swing.*;
import java.sql.*;

/**
 * Dit is een voorbeeld Java toepassing waarin je verbinding maakt met een SQLServer database.
 */
public class Main {
    public static void main(String[] args) {

        // Dit zijn de instellingen voor de verbinding. Vervang de databaseName indien deze voor jou anders is.
        String connectionUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=TrioNetnix;integratedSecurity=true;portNumber=1433;";

        // Connection beheert informatie over de connectie met de database.
        Connection con = null;

        // Statement zorgt dat we een SQL query kunnen uitvoeren.
        Statement stmt = null;

        // ResultSet is de tabel die we van de database tergkrijgen.
        // We kunnen door de rows heen stappen en iedere kolom lezen.
        ResultSet rs = null;

        // Calling methodes to create all the Lists with all the Entities for the JTables
        DataAccount.createAccounts(connectionUrl,con,stmt,rs);
        DataAflevering.createAfleveringen(connectionUrl, con, stmt, rs);
        DataBekeken.createBekeken(connectionUrl,con,stmt,rs);
        DataFilm.createFilms(connectionUrl,con,stmt,rs);
        DataProfiel.createProfielen(connectionUrl,con,stmt,rs);
        DataSerie.createSeries(connectionUrl,con,stmt,rs);

        // Executing app
        UserInterface app = new UserInterface();
        SwingUtilities.invokeLater(app);
    }
}