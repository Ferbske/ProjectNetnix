package Netnix.util;

import Netnix.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataFilm {
    private static List<Film> films = new ArrayList<>();

    public static void createFilms(String connectionUrl, Connection con, Statement stmt, ResultSet rs){
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Film";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int filmID = rs.getInt("Film_ID");
                String titelFilm = rs.getString("Titel");
                String leeftijdFilm = rs.getString("Leeftijdsindicatie");
                String taalFilm = rs.getString("Taal");
                String tijdsduurFilm = rs.getString("Tijdsduur");
                String genreFilm = rs.getString("Genre");
                Film fil = new Film(filmID,titelFilm,leeftijdFilm,taalFilm,tijdsduurFilm,genreFilm);
                DataFilm.addFilm(fil);
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

    public static void addFilm(Film film){
        films.add(film);
    }

    public static List<Film> getFilms(){
        return films;
    }
}