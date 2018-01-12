package Netnix;
import Netnix.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class UserInterface implements Runnable {

    private JFrame mainpage;
    private JPanel north;
    private JPanel south;
    private JPanel west;
    private JPanel pnlCenterMain;
    private JPanel pnlCenter1, pnlCenter2, pnlCenter3, pnlCenter4, pnlCenter5, pnlCenter6;
    private JTable table1, table2, table3, table4, table5, table6;
    private JLabel abonneenummerAcc, naam, straat, postcode, huisnummer, plaats;
    private JTextField abonneenummerAccField, naamField, straatField, postcodeField, huisnummerField, plaatsField;
    private JLabel abonneenummerPro, profielnaamPro, geboortedatum;
    private JTextField abonneenummerProField, profielnaamProField, geboortedatumField;
    private JLabel abonneenummerBek, profielnaamBek, gezien, procent;
    private JTextField abonneenummerBekField, profielnaamBekField, gezienField, procentField;
    private JLabel filmID, titelFilm, leeftijdFilm, taalFilm, tijdsduurFilm, genreFilm;
    private JTextField filmIDField, titelFilmField, leeftijdFilmField, taalFilmField, tijdsduurFilmField, genreFilmField;
    private JLabel serie, leeftijdSerie, taalSerie, genreSerie, lijktOp;
    private JTextField serieField, leeftijdSerieField, taalSerieField, genreSerieField, lijktOpField;
    private JLabel afleveringID, serieAfl, seizoen, titelAfl, tijdsduurAfl;
    private JTextField afleveringIDField, serieAflField, seizoenField, titelAflField, tijdsduurAflField;
    private TableModel model;
    private List<Aflevering> afleveringen;
    private List<Account> accounts;
    private List<Profiel> profielen;
    private List<Bekeken> bekeken;
    private List<Film> films;
    private List<Serie> series;

    public UserInterface() {
    }
    @Override
    public void run() {
        // Creating components
            mainpage = new JFrame("Netnix Statistix");
            north = new JPanel();
            south = new JPanel();
            west = new JPanel();
            //pnlCenterMain = new JPanel();
            pnlCenter1 = new JPanel();
            pnlCenter2 = new JPanel();
            pnlCenter3 = new JPanel();
            pnlCenter4 = new JPanel();
            pnlCenter5 = new JPanel();
            pnlCenter6 = new JPanel();
        // rest
            mainpage.setExtendedState(mainpage.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            addDefaultComponents(mainpage.getContentPane());
            mainpage.pack();
            mainpage.setVisible(true);
    }
    private void addDefaultComponents(Container container) {
        container.setLayout(new BorderLayout());
        // NORTH adding
            createNorth(container);
        // SOUTH adding
            createSouth(container);
        // WEST adding
            createWest(container);
        // CENTER adding
            createCenter(container);
    }
    private void createNorth(Container container){
        // Button Image
            ImageIcon imageNetnix;
            JButton buttonNetnix;
            imageNetnix = new ImageIcon("Images/Netnix.PNG");
            buttonNetnix = new JButton(imageNetnix);
            buttonNetnix.setContentAreaFilled(false);
            buttonNetnix.setBorderPainted(false);
            buttonNetnix.setOpaque(false);
            buttonNetnix.setFocusPainted(false);
            buttonNetnix.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mainpage.setVisible(true);
                }
            });
        // Temp testing area's
            north.setBackground(Color.darkGray);
        // Adding all components
            north.add(buttonNetnix);
            container.add(north, BorderLayout.NORTH);
    }
    private void createSouth(Container container){
        GridLayout layoutSouth = new GridLayout(1, 5);
        south.setLayout(layoutSouth);
        south.setPreferredSize(new Dimension(1,20));
        JLabel blank = new JLabel("");
        JLabel s1 = new JLabel("Netnix Statistix");
        s1.setForeground(Color.WHITE);
        JLabel s2 = new JLabel("Informatica | Jaar 2017 | Klas F | Rik Vanhijfte | Chino Zheng | Rick Voesenek", SwingConstants.RIGHT);
        s2.setForeground(Color.WHITE);
        // Temp testing area's
            south.setBackground(Color.DARK_GRAY);
        // Adding all components
            south.add(s1);
            south.add(blank);
            south.add(blank);
            south.add(blank);
            south.add(s2);
            container.add(south, BorderLayout.SOUTH);
    }
    private void createCenter(Container container){
        // Main Panel
            //JLabel lblCenterMain = new JLabel("Welkom! Selecteer een categorie in de linker menu balk!");
            pnlCenterMain = new JPanel();
        // Panels Center Data
            pnlCenter1.setVisible(false);
            pnlCenter2.setVisible(false);
            pnlCenter3.setVisible(false);
            pnlCenter4.setVisible(false);
            pnlCenter5.setVisible(false);
            pnlCenter6.setVisible(false);
        // Testing Panels
            pnlCenter1.setBackground(Color.RED);
            pnlCenter2.setBackground(Color.GREEN);
            pnlCenter3.setBackground(Color.BLUE);
            pnlCenter4.setBackground(Color.BLACK);
            pnlCenter5.setBackground(Color.YELLOW);
            pnlCenter6.setBackground(Color.PINK);
        // Panel 1 Accounts
        createCenterPanel1(pnlCenter1);
        // Panel 2 Profielen
        createCenterPanel2(pnlCenter2);
        // Panel 3 Bekeken
        createCenterPanel3(pnlCenter3);
        // Panel 4 Films
        createCenterPanel4(pnlCenter4);
        // Panel 5 Series
        createCenterPanel5(pnlCenter5);
        // Panel 6 Afleveringen
        createCenterPanel6(pnlCenter6);
        //Adding panels
        pnlCenterMain.add(pnlCenter1);
        pnlCenterMain.add(pnlCenter2);
        pnlCenterMain.add(pnlCenter3);
        pnlCenterMain.add(pnlCenter4);
        pnlCenterMain.add(pnlCenter5);
        pnlCenterMain.add(pnlCenter6);
        container.add(pnlCenterMain, BorderLayout.CENTER);
    }
    private void createWest(Container container){
        GridLayout layoutWest = new GridLayout(20, 1);
        west.setLayout(layoutWest);
        west.setPreferredSize(new Dimension(275,50));
        // Button 1
            JButton btnPanel1 = new JButton("Accounts");
            btnPanel1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pnlCenter1.setVisible(true);
                    pnlCenter2.setVisible(false);
                    pnlCenter3.setVisible(false);
                    pnlCenter4.setVisible(false);
                    pnlCenter5.setVisible(false);
                    pnlCenter6.setVisible(false);
                }
            });
            btnPanel1.setBackground(Color.DARK_GRAY);
            btnPanel1.setForeground(Color.WHITE);
            btnPanel1.setBorderPainted(false);
            btnPanel1.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnPanel1.setBackground(Color.decode("#380101"));
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    btnPanel1.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnPanel1.setBackground(Color.decode("#380101"));
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btnPanel1.setBackground(Color.decode("#380101"));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btnPanel1.setBackground(Color.DARK_GRAY);
                }
            });
            btnPanel1.setPreferredSize(new Dimension( 100, 100));
        // Button 2
            JButton btnPanel2 = new JButton("Profielen");
            btnPanel2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pnlCenter1.setVisible(false);
                    pnlCenter2.setVisible(true);
                    pnlCenter3.setVisible(false);
                    pnlCenter4.setVisible(false);
                    pnlCenter5.setVisible(false);
                    pnlCenter6.setVisible(false);
                }
            });
            btnPanel2.setBackground(Color.DARK_GRAY);
            btnPanel2.setForeground(Color.WHITE);
            btnPanel2.setBorderPainted(false);
            btnPanel2.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnPanel2.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnPanel2.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnPanel2.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnPanel2.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnPanel2.setBackground(Color.DARK_GRAY);
                }
            });
            btnPanel2.setPreferredSize(new Dimension( 100, 100));
        // Button 3
            JButton btnPanel3 = new JButton("Bekeken");
            btnPanel3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pnlCenter1.setVisible(false);
                    pnlCenter2.setVisible(false);
                    pnlCenter3.setVisible(true);
                    pnlCenter4.setVisible(false);
                    pnlCenter5.setVisible(false);
                    pnlCenter6.setVisible(false);
                }
            });
            btnPanel3.setBackground(Color.DARK_GRAY);
            btnPanel3.setForeground(Color.WHITE);
            btnPanel3.setBorderPainted(false);
            btnPanel3.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnPanel3.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnPanel3.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnPanel3.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnPanel3.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnPanel3.setBackground(Color.DARK_GRAY);
                }
            });
            btnPanel3.setPreferredSize(new Dimension( 100, 100));
        // Button 4
            JButton btnPanel4 = new JButton("Films");
            btnPanel4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pnlCenter1.setVisible(false);
                    pnlCenter2.setVisible(false);
                    pnlCenter3.setVisible(false);
                    pnlCenter4.setVisible(true);
                    pnlCenter5.setVisible(false);
                    pnlCenter6.setVisible(false);
                }
            });
            btnPanel4.setBackground(Color.DARK_GRAY);
            btnPanel4.setForeground(Color.WHITE);
            btnPanel4.setBorderPainted(false);
            btnPanel4.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnPanel4.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnPanel4.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnPanel4.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnPanel4.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnPanel4.setBackground(Color.DARK_GRAY);
                }
            });
            btnPanel4.setPreferredSize(new Dimension( 100, 100));
        // Button 5
            JButton btnPanel5 = new JButton("Series");
            btnPanel5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pnlCenter1.setVisible(false);
                    pnlCenter2.setVisible(false);
                    pnlCenter3.setVisible(false);
                    pnlCenter4.setVisible(false);
                    pnlCenter5.setVisible(true);
                    pnlCenter6.setVisible(false);
                }
            });
            btnPanel5.setBackground(Color.DARK_GRAY);
            btnPanel5.setForeground(Color.WHITE);
            btnPanel5.setBorderPainted(false);
            btnPanel5.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnPanel5.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnPanel5.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnPanel5.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnPanel5.setBackground(Color.decode("#380101"));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnPanel5.setBackground(Color.DARK_GRAY);
                }
            });
            btnPanel5.setPreferredSize(new Dimension( 100, 100));
        // Button 6
        JButton btnPanel6 = new JButton("Afleveringen");
        btnPanel6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlCenter1.setVisible(false);
                pnlCenter2.setVisible(false);
                pnlCenter3.setVisible(false);
                pnlCenter4.setVisible(false);
                pnlCenter5.setVisible(false);
                pnlCenter6.setVisible(true);
            }
        });
        btnPanel6.setBackground(Color.DARK_GRAY);
        btnPanel6.setForeground(Color.WHITE);
        btnPanel6.setBorderPainted(false);
        btnPanel6.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                btnPanel6.setBackground(Color.decode("#380101"));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                btnPanel6.setBackground(Color.decode("#380101"));
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                btnPanel6.setBackground(Color.decode("#380101"));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btnPanel6.setBackground(Color.decode("#380101"));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnPanel6.setBackground(Color.DARK_GRAY);
            }
        });
        btnPanel6.setPreferredSize(new Dimension( 100, 100));
        // Blank spots
            JLabel blank1 = new JLabel(" ");
            JLabel blank2 = new JLabel(" ");
            JLabel blank3 = new JLabel(" ");
            JLabel blank4 = new JLabel(" ");
            JLabel blank5 = new JLabel(" ");
            blank1.setPreferredSize(new Dimension(100,20));
            blank2.setPreferredSize(new Dimension(100,20));
            blank3.setPreferredSize(new Dimension(100,20));
            blank4.setPreferredSize(new Dimension(100,20));
            blank5.setPreferredSize(new Dimension(100,20));
        // Background
            west.setBackground(Color.gray);
        // Adding all components
            west.add(btnPanel1);
            west.add(blank1);
            west.add(btnPanel2);
            west.add(blank2);
            west.add(btnPanel3);
            west.add(blank3);
            west.add(btnPanel4);
            west.add(blank4);
            west.add(btnPanel5);
            west.add(blank5);
            west.add(btnPanel6);
            container.add(west, BorderLayout.WEST);
    }
    private void createCenterPanel1(Container container){
        JPanel centerSouth1 = new JPanel(new GridLayout(1,9));
        table1 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Abonneenummer", "Naam", "Straat", "Post Code", "Huisnummer", "Plaats"};
        DefaultTableModel model = new DefaultTableModel(new String[]{"Abonneenummer", "Naam", "Straat", "Post Code", "Huisnummer", "Plaats"}, 0);
        model.setColumnIdentifiers(columns);
        table1.setBackground(Color.LIGHT_GRAY);
        table1.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table1.setFont(font);
        table1.setRowHeight(30);
        Object[] rows = new Object [6];
        accounts = DataAccount.getAccounts();
        for(Account acc : accounts){
            String[] temp = {acc.getAbonneenummerAcc()+"", acc.getNaam(), acc.getStraat(), acc.getPostcode(), acc.getHuisnummer()+"", acc.getPlaats()};
            model.addRow(temp);
        }
        // Labels
            abonneenummerAcc = new JLabel(" Abonneenummer: ");
            naam = new JLabel(" Naam: ");
            straat = new JLabel(" Straat: ");
            postcode = new JLabel(" Postcode: ");
            huisnummer = new JLabel(" Huisnummer: ");
            plaats = new JLabel(" Plaats: ");
        // Input fields
            abonneenummerAccField = new JTextField();
            naamField = new JTextField();
            straatField = new JTextField();
            postcodeField = new JTextField();
            huisnummerField = new JTextField();
            plaatsField = new JTextField();
        // Buttons
            JButton btnAdd1 = new JButton("Add");
            JButton btnDelete1 = new JButton ("Delete");
            JButton btnUpdate1 = new JButton("Update");
        // ScrollPane
            JScrollPane pane = new JScrollPane(table1);
            pane.setBounds(0, 0, 880, 200);
        // ActionListeners
            btnAdd1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String a = abonneenummerAccField.getText();
                    String b = naamField.getText();
                    String c = straatField.getText();
                    String d = postcodeField.getText();
                    String f = huisnummerField.getText();
                    String g = plaatsField.getText();
                    model.addRow(new Object[]{a,b,c,d,f,g});
                    abonneenummerAccField.setText("");
                    naamField.setText("");
                    straatField.setText("");
                    postcodeField.setText("");
                    huisnummerField.setText("");
                    plaatsField.setText("");
                }
            });
            btnDelete1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   int i = table1.getSelectedRow();
                   if (i >= 0) {
                       model.removeRow(i);

                   }
                   else{
                       System.out.println("Delete Error");
                   }
                    abonneenummerAccField.setText("");
                    naamField.setText("");
                    straatField.setText("");
                    postcodeField.setText("");
                    huisnummerField.setText("");
                    plaatsField.setText("");
                }
            });
            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    int i = table1.getSelectedRow();
                    abonneenummerAccField.setText(model.getValueAt(i, 0).toString());
                    naamField.setText(model.getValueAt(i, 1).toString());
                    straatField.setText(model.getValueAt(i, 2).toString());
                    postcodeField.setText(model.getValueAt(i, 3).toString());
                    huisnummerField.setText(model.getValueAt(i, 4).toString());
                    plaatsField.setText(model.getValueAt(i, 5).toString());
                }
            });

            btnUpdate1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = table1.getSelectedRow();
                    if (i >= 0) {
                        model.setValueAt(abonneenummerAccField.getText(), i, 0);
                        model.setValueAt(naamField.getText(), i, 1);
                        model.setValueAt(straatField.getText(), i, 2);
                        model.setValueAt(postcodeField.getText(), i, 3);
                        model.setValueAt(huisnummerField.getText(), i, 4);
                        model.setValueAt(plaatsField.getText(), i, 5);
                    }
                    else{
                        System.out.println("Update Error");
                    }
                }
            });
        // Setting Model
        table1.setModel(model);
        // Adding all the things
        container.add(pane);
        centerSouth1.add(abonneenummerAcc);
        centerSouth1.add(abonneenummerAccField);
        centerSouth1.add(naam);
        centerSouth1.add(naamField);
        centerSouth1.add(straat);
        centerSouth1.add(straatField);
        centerSouth1.add(postcode);
        centerSouth1.add(postcodeField);
        centerSouth1.add(huisnummer);
        centerSouth1.add(huisnummerField);
        centerSouth1.add(plaats);
        centerSouth1.add(plaatsField);
        centerSouth1.add(btnAdd1);
        centerSouth1.add(btnDelete1);
        centerSouth1.add(btnUpdate1);
        container.add(centerSouth1, BorderLayout.SOUTH);
    }
    private void createCenterPanel2(Container container){
        JPanel centerSouth2 = new JPanel(new GridLayout(1,9));
        table2 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Abonnenummer", "Profiel Naam", "Geboortedatum"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table2.setModel(model);
        table2.setBackground(Color.LIGHT_GRAY);
        table2.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table2.setFont(font);
        table2.setRowHeight(30);
        Object[] rows = new Object [3];
        profielen = DataProfiel.getProfielen();
        for(Profiel pro : profielen){
            String[] temp = {pro.getAbonneenummerPro()+"", pro.getProfielnaamPro(), pro.getGeboortedatum()+""};
            model.addRow(temp);
        }
        // Labels
        abonneenummerPro = new JLabel(" Abonneenummer: ");
        profielnaamPro = new JLabel(" Profiel naam: ");
        geboortedatum = new JLabel(" Geboortedatum: ");
        // Input fields
        abonneenummerProField = new JTextField();
        profielnaamProField = new JTextField();
        geboortedatumField = new JTextField();
        // Buttons
        JButton btnAdd2 = new JButton("Add");
        JButton btnDelete2 = new JButton ("Delete");
        JButton btnUpdate2 = new JButton("Update");
        // ScrollPane
        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setBounds(0, 0, 880, 200);
        // ActionListeners
        btnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    rows[0] = abonneenummerProField.getText();
                    rows[1] = profielnaamProField.getText();
                    rows[2] = geboortedatumField.getText();
                    model.addRow(rows);
                    abonneenummerProField.setText("");
                    profielnaamProField.setText("");
                    geboortedatumField.setText("");
            }
        });
        btnDelete2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table2.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);

                } else {
                    System.out.println("Delete Error");
                }
                abonneenummerProField.setText("");
                profielnaamProField.setText("");
                geboortedatumField.setText("");
            }
        });

        table2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = table2.getSelectedRow();
                    abonneenummerProField.setText(model.getValueAt(i, 0).toString());
                    profielnaamProField.setText(model.getValueAt(i, 1).toString());
                    geboortedatumField.setText(model.getValueAt(i, 2).toString());
            }
        });

        btnUpdate2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table2.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(abonneenummerProField.getText(), i, 0);
                    model.setValueAt(profielnaamProField.getText(), i, 1);
                    model.setValueAt(geboortedatumField.getText(), i, 2);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        // Adding all the things
        container.add(pane2);
        centerSouth2.add(abonneenummerPro);
        centerSouth2.add(abonneenummerProField);
        centerSouth2.add(profielnaamPro);
        centerSouth2.add(profielnaamProField);
        centerSouth2.add(geboortedatum);
        centerSouth2.add(geboortedatumField);
        centerSouth2.add(btnAdd2);
        centerSouth2.add(btnDelete2);
        centerSouth2.add(btnUpdate2);
        container.add(centerSouth2, BorderLayout.SOUTH);
    }
    private void createCenterPanel3(Container container){
        JPanel centerSouth3 = new JPanel(new GridLayout(1,9));
        table3 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Abonneenummer", "Profielnaam", "Gezien", "Procent"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table3.setModel(model);
        table3.setBackground(Color.LIGHT_GRAY);
        table3.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table3.setFont(font);
        table3.setRowHeight(30);
        Object[] rows = new Object [4];
        bekeken = DataBekeken.getBekeken();
        for(Bekeken bek : bekeken){
            String[] temp = {bek.getAbonneenummerBek()+"", bek.getProfielnaamBek(), bek.getGezien()+"", bek.getProcent()+""};
            model.addRow(temp);
        }
        // Labels
        abonneenummerBek = new JLabel(" Abonneenummer: ");
        profielnaamBek = new JLabel(" Profiel: ");
        gezien = new JLabel(" Gezien: ");
        procent = new JLabel(" Procent: ");
        // Input fields
        abonneenummerBekField = new JTextField();
        profielnaamBekField = new JTextField();
        gezienField = new JTextField();
        procentField = new JTextField();
        // Buttons
        JButton btnAdd3 = new JButton("Add");
        JButton btnDelete3 = new JButton ("Delete");
        JButton btnUpdate3 = new JButton("Update");
        // ScrollPane
        JScrollPane pane = new JScrollPane(table3);
        pane.setBounds(0, 0, 880, 200);
        // ActionListeners
        btnAdd3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    rows[0] = abonneenummerBekField.getText();
                    rows[1] = profielnaamBekField.getText();
                    rows[2] = gezienField.getText();
                    rows[3] = procentField.getText();
                    model.addRow(rows);
                    abonneenummerBekField.setText("");
                    profielnaamBekField.setText("");
                    gezienField.setText("");
                    procentField.setText("");
            }
        });
        btnDelete3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table3.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
                abonneenummerBekField.setText("");
                profielnaamBekField.setText("");
                gezienField.setText("");
                procentField.setText("");
            }
        });

        table3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = table3.getSelectedRow();
                abonneenummerBekField.setText(model.getValueAt(i, 0).toString());
                profielnaamBekField.setText(model.getValueAt(i, 1).toString());
                gezienField.setText(model.getValueAt(i, 2).toString());
                procentField.setText(model.getValueAt(i, 3).toString());
            }
        });

        btnUpdate3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table3.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(abonneenummerBekField.getText(), i, 0);
                    model.setValueAt(profielnaamBekField.getText(), i, 1);
                    model.setValueAt(gezienField.getText(), i, 2);
                    model.setValueAt(procentField.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        // Adding all the things
        container.add(pane);
        centerSouth3.add(abonneenummerBek);
        centerSouth3.add(abonneenummerBekField);
        centerSouth3.add(profielnaamBek);
        centerSouth3.add(profielnaamBekField);
        centerSouth3.add(gezien);
        centerSouth3.add(gezienField);
        centerSouth3.add(procent);
        centerSouth3.add(procentField);
        centerSouth3.add(btnAdd3);
        centerSouth3.add(btnDelete3);
        centerSouth3.add(btnUpdate3);
        container.add(centerSouth3, BorderLayout.SOUTH);
    }
    private void createCenterPanel4(Container container){
        JPanel centerSouth4 = new JPanel(new GridLayout(1,9));
        table4 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Film ID", "Titel", "Leeftijdsindicatie", "Taal", "Tijdsduur", "Genre"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table4.setModel(model);
        table4.setBackground(Color.LIGHT_GRAY);
        table4.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table4.setFont(font);
        table4.setRowHeight(30);
        Object[] rows = new Object [6];
        films = DataFilm.getFilms();
        for(Film fil : films){
            String[] temp = {fil.getFilmID()+"", fil.getTitelFilm(), fil.getLeeftijdFilm(), fil.getTaalFilm(), fil.getTijdsduurFilm()+"", fil.getGenreFilm()};
            model.addRow(temp);
        }
        // Labels
        filmID = new JLabel(" Film ID: ");
        titelFilm = new JLabel(" Titel: ");
        leeftijdFilm = new JLabel(" Leeftijd: ");
        taalFilm = new JLabel(" Taal: ");
        tijdsduurFilm = new JLabel(" Tijdsduur: ");
        genreFilm = new JLabel(" Genre: ");
        // Input fields
        filmIDField = new JTextField();
        titelFilmField = new JTextField();
        leeftijdFilmField = new JTextField();
        taalFilmField = new JTextField();
        tijdsduurFilmField = new JTextField();
        genreFilmField = new JTextField();
        // Buttons
        JButton btnAdd4 = new JButton("Add");
        JButton btnDelete4 = new JButton ("Delete");
        JButton btnUpdate4 = new JButton("Update");
        // ScrollPane
        JScrollPane pane = new JScrollPane(table4);
        pane.setBounds(0, 0, 880, 200);
        // ActionListeners
        btnAdd4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    rows[0] = filmIDField.getText();
                    rows[1] = titelFilmField.getText();
                    rows[2] = leeftijdFilmField.getText();
                    rows[3] = taalFilmField.getText();
                    rows[4] = tijdsduurFilmField.getText();
                    rows[5] = genreFilmField.getText();
                    model.addRow(rows);
                    filmIDField.setText("");
                    titelFilmField.setText("");
                    leeftijdFilmField.setText("");
                    taalFilmField.setText("");
                    tijdsduurFilmField.setText("");
                    genreFilmField.setText("");
            }
        });
        btnDelete4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table4.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
                filmIDField.setText("");
                titelFilmField.setText("");
                leeftijdFilmField.setText("");
                taalFilmField.setText("");
                tijdsduurFilmField.setText("");
                genreFilmField.setText("");
            }
        });

        table4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = table4.getSelectedRow();
                filmIDField.setText(model.getValueAt(i, 0).toString());
                titelFilmField.setText(model.getValueAt(i, 1).toString());
                leeftijdFilmField.setText(model.getValueAt(i, 2).toString());
                taalFilmField.setText(model.getValueAt(i, 3).toString());
                tijdsduurFilmField.setText(model.getValueAt(i, 4).toString());
                genreFilmField.setText(model.getValueAt(i, 5).toString());
            }
        });

        btnUpdate4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table4.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(filmIDField.getText(), i, 0);
                    model.setValueAt(titelFilmField.getText(), i, 1);
                    model.setValueAt(leeftijdFilmField.getText(), i, 2);
                    model.setValueAt(taalFilmField.getText(), i, 3);
                    model.setValueAt(tijdsduurFilmField.getText(), i, 4);
                    model.setValueAt(genreFilmField.getText(), i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        // Adding all the things
        container.add(pane);
        centerSouth4.add(filmID);
        centerSouth4.add(filmIDField);
        centerSouth4.add(titelFilm);
        centerSouth4.add(titelFilmField);
        centerSouth4.add(leeftijdFilm);
        centerSouth4.add(leeftijdFilmField);
        centerSouth4.add(taalFilm);
        centerSouth4.add(taalFilmField);
        centerSouth4.add(tijdsduurFilm);
        centerSouth4.add(tijdsduurFilmField);
        centerSouth4.add(genreFilm);
        centerSouth4.add(genreFilmField);
        centerSouth4.add(btnAdd4);
        centerSouth4.add(btnDelete4);
        centerSouth4.add(btnUpdate4);
        container.add(centerSouth4, BorderLayout.SOUTH);
    }
    private void createCenterPanel5(Container container){
        JPanel centerSouth5 = new JPanel(new GridLayout(1,9));
        table5 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Serie", "Leeftijdsindicatie", "Taal", "Genre", "Lijkt op"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table5.setModel(model);
        table5.setBackground(Color.LIGHT_GRAY);
        table5.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table5.setFont(font);
        table5.setRowHeight(30);
        Object[] rows = new Object [5];
        series = DataSerie.getSeries();
        for(Serie ser : series){
            String[] temp = {ser.getSerie(), ser.getLeeftijdSerie(), ser.getTaalSerie(), ser.getGenreSerie(), ser.getLijktOp()};
            model.addRow(temp);
        }
        // Labels
        serie = new JLabel(" Serie: ");
        leeftijdSerie = new JLabel(" Leeftijd: ");
        taalSerie = new JLabel(" Taal: ");
        genreSerie = new JLabel(" Genre: ");
        lijktOp = new JLabel(" Lijkt op: ");
        // Input fields
        serieField = new JTextField();
        leeftijdSerieField = new JTextField();
        taalSerieField = new JTextField();
        genreSerieField = new JTextField();
        lijktOpField = new JTextField();
        // Buttons
        JButton btnAdd5 = new JButton("Add");
        JButton btnDelete5 = new JButton ("Delete");
        JButton btnUpdate5 = new JButton("Update");
        // ScrollPane
        JScrollPane pane = new JScrollPane(table5);
        pane.setBounds(0, 0, 880, 200);
        // ActionListeners
        btnAdd5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    rows[0] = serieField.getText();
                    rows[1] = leeftijdSerieField.getText();
                    rows[2] = taalSerieField.getText();
                    rows[3] = genreSerieField.getText();
                    rows[4] = lijktOpField.getText();
                    model.addRow(rows);
                    serieField.setText("");
                    leeftijdSerieField.setText("");
                    taalSerieField.setText("");
                    genreSerieField.setText("");
                    lijktOpField.setText("");
            }
        });
        btnDelete5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table5.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
                serieField.setText("");
                leeftijdSerieField.setText("");
                taalSerieField.setText("");
                genreSerieField.setText("");
                lijktOpField.setText("");
            }
        });

        table5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = table5.getSelectedRow();
                serieField.setText(model.getValueAt(i, 0).toString());
                leeftijdSerieField.setText(model.getValueAt(i, 1).toString());
                taalSerieField.setText(model.getValueAt(i, 2).toString());
                genreSerieField.setText(model.getValueAt(i, 3).toString());
                lijktOpField.setText(model.getValueAt(i, 4).toString());
            }
        });

        btnUpdate5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table5.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(serieField.getText(), i, 0);
                    model.setValueAt(leeftijdSerieField.getText(), i, 1);
                    model.setValueAt(taalSerieField.getText(), i, 2);
                    model.setValueAt(genreSerieField.getText(), i, 3);
                    model.setValueAt(lijktOpField.getText(), i, 4);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        // Adding all the things
        container.add(pane);
        centerSouth5.add(serie);
        centerSouth5.add(serieField);
        centerSouth5.add(leeftijdSerie);
        centerSouth5.add(leeftijdSerieField);
        centerSouth5.add(taalSerie);
        centerSouth5.add(taalSerieField);
        centerSouth5.add(genreSerie);
        centerSouth5.add(genreSerieField);
        centerSouth5.add(lijktOp);
        centerSouth5.add(lijktOpField);
        centerSouth5.add(btnAdd5);
        centerSouth5.add(btnDelete5);
        centerSouth5.add(btnUpdate5);
        container.add(centerSouth5, BorderLayout.SOUTH);
    }
    private void createCenterPanel6(Container container){
        JPanel centerSouth6 = new JPanel(new GridLayout(1,9));
        table6 = new JTable();
        container.setLayout(new BorderLayout());
        Object[] columns = {"Aflevering ID", "Serie", "Seizoen", "Titel", "Tijdsduur"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table6.setModel(model);
        table6.setBackground(Color.LIGHT_GRAY);
        table6.setForeground(Color.BLACK);
        Font font = new Font("",1,22);
        table6.setFont(font);
        table6.setRowHeight(30);
        Object[] rows = new Object [5];
        afleveringen = DataAflevering.getAfleveringen();
        for(Aflevering afl : afleveringen){
            String[] temp = {afl.getAfleveringID()+"", afl.getSerieAfl(), afl.getSeizoen(), afl.getTitelAfl(), afl.getTijdsduurAfl()};
            model.addRow(temp);
        }
        // Labels
        afleveringID = new JLabel(" Aflevering ID: ");
        serieAfl = new JLabel(" Serie: ");
        seizoen = new JLabel(" Seizoen: ");
        titelAfl = new JLabel(" Titel: ");
        tijdsduurAfl = new JLabel(" Tijdsduur: ");
        // Input fields
        afleveringIDField = new JTextField();
        serieAflField = new JTextField();
        seizoenField = new JTextField();
        titelAflField = new JTextField();
        tijdsduurAflField = new JTextField();
        // Buttons
        JButton btnAdd6 = new JButton("Add");
        JButton btnDelete6 = new JButton ("Delete");
        JButton btnUpdate6 = new JButton("Update");
        // ScrollPane
        JScrollPane pane = new JScrollPane(table6);
        pane.setBounds(0, 0, 880, 200);
        // ActionListeners
        btnAdd6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rows[0] = afleveringIDField.getText();
                rows[1] = serieAflField.getText();
                rows[2] = seizoenField.getText();
                rows[3] = titelAflField.getText();
                rows[4] = tijdsduurAflField.getText();
                model.addRow(rows);
                DataWrite.writeAflevering(afleveringIDField.getText(), serieAflField.getText(), seizoenField.getText(), titelAflField.getText(), tijdsduurAflField.getText());
                afleveringIDField.setText("");
                serieAflField.setText("");
                seizoenField.setText("");
                titelAflField.setText("");
                tijdsduurAflField.setText("");
            }
        });
        btnDelete6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table6.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
                afleveringIDField.setText("");
                serieAflField.setText("");
                seizoenField.setText("");
                titelAflField.setText("");
                tijdsduurAflField.setText("");
            }
        });

        table6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int i = table6.getSelectedRow();
                afleveringIDField.setText(model.getValueAt(i, 0).toString());
                serieAflField.setText(model.getValueAt(i, 1).toString());
                seizoenField.setText(model.getValueAt(i, 2).toString());
                titelAflField.setText(model.getValueAt(i, 3).toString());
                tijdsduurAflField.setText(model.getValueAt(i, 4).toString());
            }
        });

        btnUpdate6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table6.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(afleveringIDField.getText(), i, 0);
                    model.setValueAt(serieAflField.getText(), i, 1);
                    model.setValueAt(seizoenField.getText(), i, 2);
                    model.setValueAt(titelAflField.getText(), i, 3);
                    model.setValueAt(tijdsduurAflField.getText(), i, 4);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        // Adding all the things
        container.add(pane);
        centerSouth6.add(afleveringID);
        centerSouth6.add(afleveringIDField);
        centerSouth6.add(serieAfl);
        centerSouth6.add(serieAflField);
        centerSouth6.add(seizoen);
        centerSouth6.add(seizoenField);
        centerSouth6.add(titelAfl);
        centerSouth6.add(titelAflField);
        centerSouth6.add(tijdsduurAfl);
        centerSouth6.add(tijdsduurAflField);
        centerSouth6.add(btnAdd6);
        centerSouth6.add(btnDelete6);
        centerSouth6.add(btnUpdate6);
        container.add(centerSouth6, BorderLayout.SOUTH);
    }
    public JFrame getFrame() {
        return mainpage;
    }
}