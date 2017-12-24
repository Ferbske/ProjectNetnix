package Netnix;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame mainpage;
    private JPanel north;
    private JPanel south;
    private JPanel west;
    private JPanel pnlCenterMain;
    private JPanel pnlCenter1;
    private JPanel pnlCenter2;
    private JPanel pnlCenter3;
    private JPanel pnlCenter4;
    private JPanel pnlCenter5;

    public UserInterface() {
    }
    @Override
    public void run() {
        // Creating components
            mainpage = new JFrame("Netnix Statistix");
            north = new JPanel();
            south = new JPanel();
            west = new JPanel();
            pnlCenterMain = new JPanel();
            pnlCenter1 = new JPanel();
            pnlCenter2 = new JPanel();
            pnlCenter3 = new JPanel();
            pnlCenter4 = new JPanel();
            pnlCenter5 = new JPanel();
        // rest
            mainpage.setExtendedState(mainpage.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            addDefaultComponents(mainpage.getContentPane());
            mainpage.pack();
            mainpage.setVisible(true);
    }
    public void addDefaultComponents(Container container) {
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
            JLabel lblCenterMain = new JLabel("Welkom! Selecteer een categorie in de linker menu balk!");
            pnlCenterMain.add(lblCenterMain);
        // Panels Center Data
            pnlCenter1.setVisible(false);
            pnlCenter1.setPreferredSize(new Dimension(1500,800));
            pnlCenter2.setVisible(false);
            pnlCenter2.setPreferredSize(new Dimension(1500,800));
            pnlCenter3.setVisible(false);
            pnlCenter3.setPreferredSize(new Dimension(1500,800));
            pnlCenter4.setVisible(false);
            pnlCenter4.setPreferredSize(new Dimension(1500,800));
            pnlCenter5.setVisible(false);
            pnlCenter5.setPreferredSize(new Dimension(1500,800));
        // Background Panels
            pnlCenterMain.setBackground(Color.LIGHT_GRAY);
            pnlCenter1.setBackground(Color.RED);
            pnlCenter2.setBackground(Color.GREEN);
            pnlCenter3.setBackground(Color.BLUE);
            pnlCenter4.setBackground(Color.BLACK);
            pnlCenter5.setBackground(Color.WHITE);
        // Adding all components
            pnlCenterMain.add(pnlCenter1);
            pnlCenterMain.add(pnlCenter2);
            pnlCenterMain.add(pnlCenter3);
            pnlCenterMain.add(pnlCenter4);
            pnlCenterMain.add(pnlCenter5);
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
        // Blank spots
            JLabel blank1 = new JLabel(" ");
            JLabel blank2 = new JLabel(" ");
            JLabel blank3 = new JLabel(" ");
            JLabel blank4 = new JLabel(" ");
            blank1.setPreferredSize(new Dimension(100,20));
            blank2.setPreferredSize(new Dimension(100,20));
            blank3.setPreferredSize(new Dimension(100,20));
            blank4.setPreferredSize(new Dimension(100,20));
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
            container.add(west, BorderLayout.WEST);
    }
    public JFrame getFrame() {
        return mainpage;
    }
}
