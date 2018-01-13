package Netnix;

import Netnix.util.*;

import javax.swing.*;
import java.sql.*;

/**
 * Dit is een voorbeeld Java toepassing waarin je verbinding maakt met een SQLServer database.
 */
public class Main {
    public static void main(String[] args) {
        UserInterface app = new UserInterface();
        SwingUtilities.invokeLater(app);
    }
}