package Netnix;
import Netnix.Classes.*;
import Netnix.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UserInterface implements Runnable {

    private JFrame mainpage;
    private JPanel north, south, west, pnlCenterMain, pnlCenter1, pnlCenter2, pnlCenter3, pnlCenter4, pnlCenter5, pnlCenter6;
    private JTable table1, table2, table3, table4, table5, table6;
    private JLabel abonneenummerAcc, naam, straat, postcode, huisnummer, plaats, abonneenummerBek, profielnaamBek, gezien, procent, abonneenummerPro, profielnaamPro, geboortedatum;
    private JTextField abonneenummerAccField, naamField, straatField, postcodeField, huisnummerField, plaatsField, abonneenummerBekField, profielnaamBekField, gezienField, procentField, abonneenummerProField, profielnaamProField, geboortedatumField;
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
        // Creating all Center Panels
            pnlCenterMain = new JPanel();
            pnlCenter1 = new JPanel();
            pnlCenter2 = new JPanel();
            pnlCenter3 = new JPanel();
            pnlCenter4 = new JPanel();
            pnlCenter5 = new JPanel();
            pnlCenter6 = new JPanel();
        // Default run()
            mainpage.setExtendedState(mainpage.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            addDefaultComponents(mainpage.getContentPane());
            mainpage.pack();
            mainpage.setVisible(true);
    }
    private void addDefaultComponents(Container container) {
        container.setLayout(new BorderLayout());
        // Creating North panel
            createNorth(container);
        // Creating South panel
            createSouth(container);
        // Creating West panel
            createWest(container);
        // Creating Center panel
            createCenter(container);
    }
    private void createNorth(Container container){
        // Image Netnix
            ImageIcon imageNetnix;
            JButton buttonNetnix;
            imageNetnix = new ImageIcon("Images/Netnix.PNG");
            buttonNetnix = new JButton(imageNetnix);
            buttonNetnix.setContentAreaFilled(false);
            buttonNetnix.setBorderPainted(false);
            buttonNetnix.setOpaque(false);
            buttonNetnix.setFocusPainted(false);
        // Setting Background color
            north.setBackground(Color.darkGray);
        // Adding all components
            north.add(buttonNetnix);
            container.add(north, BorderLayout.NORTH);
    }
    private void createSouth(Container container){
        // Changing layout South panel
        GridLayout layoutSouth = new GridLayout(1, 5);
        south.setLayout(layoutSouth);
        south.setPreferredSize(new Dimension(1,20));
        // Creating all Components
        JLabel blank = new JLabel("");
        JLabel s1 = new JLabel("Netnix Statistix");
        s1.setForeground(Color.WHITE);
        JLabel s2 = new JLabel("Informatica | Jaar 2017 | Klas F | Rik Vanhijfte | Chino Zheng | Rick Voesenek  ", SwingConstants.RIGHT);
        s2.setForeground(Color.WHITE);
        // Setting Background color
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
            pnlCenterMain.setLayout(new CardLayout());
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
        // Adding Layout to West panel
        GridLayout layoutWest = new GridLayout(13, 1);
        west.setLayout(layoutWest);
        west.setPreferredSize(new Dimension(275,50));
        // Creating Button 1
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
        btnPanel1.setPreferredSize(new Dimension( 275, 100));
        // Creating Button 2
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
        btnPanel2.setPreferredSize(new Dimension( 275, 100));
        // Creating Button 3
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
        btnPanel3.setPreferredSize(new Dimension( 275, 100));
        // Creating Button 4
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
        btnPanel4.setPreferredSize(new Dimension( 275, 100));
        // Creating Button 5
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
        btnPanel5.setPreferredSize(new Dimension( 275, 100));
        // Creating Button 6
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
        btnPanel6.setPreferredSize(new Dimension( 275, 100));
        // Blank spaces Grid Layout
        JLabel blank1 = new JLabel(" ");
        JLabel blank2 = new JLabel(" ");
        JLabel blank3 = new JLabel(" ");
        JLabel blank4 = new JLabel(" ");
        JLabel blank5 = new JLabel(" ");
        JLabel blank6 = new JLabel(" ");
        JLabel blank7 = new JLabel(" ");
        blank1.setPreferredSize(new Dimension(275,20));
        blank2.setPreferredSize(new Dimension(275,20));
        blank3.setPreferredSize(new Dimension(275,20));
        blank4.setPreferredSize(new Dimension(275,20));
        blank5.setPreferredSize(new Dimension(275,20));
        blank6.setPreferredSize(new Dimension(275,20));
        blank7.setPreferredSize(new Dimension(275,20));
        // Setting Background color
        west.setBackground(Color.gray);
        // Adding all components
        west.add(blank1);
        west.add(btnPanel1);
        west.add(blank2);
        west.add(btnPanel2);
        west.add(blank3);
        west.add(btnPanel3);
        west.add(blank4);
        west.add(btnPanel4);
        west.add(blank5);
        west.add(btnPanel5);
        west.add(blank6);
        west.add(btnPanel6);
        west.add(blank7);
        container.add(west, BorderLayout.WEST);
    }
    private void createCenterPanel1(Container container){
        // Setting layout CenterSouth panel 1
        JPanel centerSouth1 = new JPanel(new GridLayout(1,9));
        // Creating Table 1
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
        // Getting all data for in Table 1
        accounts = DataAccount.getAccounts();
        for(Account acc : accounts){
            String[] temp = {acc.getAbonneenummerAcc()+"", acc.getNaam(), acc.getStraat(), acc.getPostcode(), acc.getHuisnummer()+"", acc.getPlaats()};
            model.addRow(temp);
        }
        // Creating Labels
        abonneenummerAcc = new JLabel(" Abonneenummer: ");
        naam = new JLabel(" Naam: ");
        straat = new JLabel(" Straat: ");
        postcode = new JLabel(" Postcode: ");
        huisnummer = new JLabel(" Huisnummer: ");
        plaats = new JLabel(" Plaats: ");
        // Creating Input fields
        abonneenummerAccField = new JTextField();
        naamField = new JTextField();
        straatField = new JTextField();
        postcodeField = new JTextField();
        huisnummerField = new JTextField();
        plaatsField = new JTextField();
        // Modification Buttons
        JButton btnAdd1 = new JButton("Add");
        JButton btnDelete1 = new JButton ("Delete");
        JButton btnUpdate1 = new JButton("Update");
        // Creating ScrollPane
        JScrollPane pane = new JScrollPane(table1);
        pane.setBounds(0, 0, 880, 200);
        // Creating ActionListeners for buttons
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
        // Setting table Model
        table1.setModel(model);
        // Adding all components
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
        // Setting Layout CenterSouth panel 2
        JPanel centerSouth2 = new JPanel(new GridLayout(1,9));
        // Creating Table 2
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
        // Getting all data for in Table 2
        profielen = DataProfiel.getProfielen();
        for(Profiel pro : profielen){
            String[] temp = {pro.getAbonneenummerPro()+"", pro.getProfielnaamPro(), pro.getGeboortedatum()+""};
            model.addRow(temp);
        }
        // Creating Labels
        abonneenummerPro = new JLabel(" Abonneenummer: ");
        profielnaamPro = new JLabel(" Profiel naam: ");
        geboortedatum = new JLabel(" Geboortedatum: ");
        // Creating Input fields
        abonneenummerProField = new JTextField();
        profielnaamProField = new JTextField();
        geboortedatumField = new JTextField();
        // Creating Buttons
        JButton btnAdd2 = new JButton("Add");
        JButton btnDelete2 = new JButton ("Delete");
        JButton btnUpdate2 = new JButton("Update");
        // Creating ScrollPane
        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setBounds(0, 0, 880, 200);
        // Creating ActionListeners for modification buttons
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
        // Adding all components
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
        // Setting Layout CenterSouth panel 3
        JPanel centerSouth3 = new JPanel(new GridLayout(1,9));
        // Creating table 3
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
        // Getting all the data for table 3
        bekeken = DataBekeken.getBekeken();
        for(Bekeken bek : bekeken){
            String[] temp = {bek.getAbonneenummerBek()+"", bek.getProfielnaamBek(), bek.getGezien()+"", bek.getProcent()+""};
            model.addRow(temp);
        }
        // Creating Labels
        abonneenummerBek = new JLabel(" Abonneenummer: ");
        profielnaamBek = new JLabel(" Profiel: ");
        gezien = new JLabel(" Gezien: ");
        procent = new JLabel(" Procent: ");
        // Creating Input fields
        abonneenummerBekField = new JTextField();
        profielnaamBekField = new JTextField();
        gezienField = new JTextField();
        procentField = new JTextField();
        // Creating Buttons
        JButton btnAdd3 = new JButton("Add");
        JButton btnDelete3 = new JButton ("Delete");
        JButton btnUpdate3 = new JButton("Update");
        // Creating ScrollPane
        JScrollPane pane = new JScrollPane(table3);
        pane.setBounds(0, 0, 880, 200);
        // Creating ActionListeners for modification buttons
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
        // Adding all components
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
        // Creating table 4
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
        // Getting all data for in Table 4
        films = DataFilm.getFilms();
        for(Film fil : films){
            String[] temp = {fil.getFilmID()+"", fil.getTitelFilm(), fil.getLeeftijdFilm(), fil.getTaalFilm(), fil.getTijdsduurFilm()+"", fil.getGenreFilm()};
            model.addRow(temp);
        }
        // Creating ScrollPane
        JScrollPane pane = new JScrollPane(table4);
        pane.setBounds(0, 0, 880, 200);
        // Adding all components
        container.add(pane);
    }
    private void createCenterPanel5(Container container){
        // Creating Table 5
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
        // Getting all data for in table 5
        series = DataSerie.getSeries();
        for(Serie ser : series){
            String[] temp = {ser.getSerie(), ser.getLeeftijdSerie(), ser.getTaalSerie(), ser.getGenreSerie(), ser.getLijktOp()};
            model.addRow(temp);
        }
        // Creating ScrollPane
        JScrollPane pane = new JScrollPane(table5);
        pane.setBounds(0, 0, 880, 200);
        // Adding all components
        container.add(pane);
    }
    private void createCenterPanel6(Container container){
        // Creating Table 6
        table6 = new JTable();
        table6.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
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
        // Getting all data for in Table 6
        afleveringen = DataAflevering.getAfleveringen();
        for(Aflevering afl : afleveringen) {
            String[] temp = {afl.getAfleveringID() + "", afl.getSerieAfl(), afl.getSeizoen(), afl.getTitelAfl(), afl.getTijdsduurAfl()};
            model.addRow(temp);
        }
        // Creating ScrollPane
        JScrollPane pane = new JScrollPane(table6);
        pane.setBounds(0, 0, 880, 200);
        // Adding all components
        container.add(pane);
    }
    public JFrame getFrame() {
        return mainpage;
    }
}