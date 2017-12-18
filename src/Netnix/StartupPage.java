package Netnix;

import java.awt.*;
import javax.swing.*;

public class StartupPage implements Runnable {
    private JPanel panelMain;
    private JTabbedPane tabbedPane1;
    private JPanel PanelWest;
    private JPanel PanelNorth;
    private JPanel PanelSouth;
    private JPanel PanelCenter;
    private JLabel ImageNetnixLabel;
    private JPanel paneltab1;
    private JPanel paneltab2;
    private JPanel paneltab3;
    private JPanel paneltab4;

    public void run() {
        JFrame frame = new JFrame("Netnix Statistix");
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(new StartupPage().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void addComponents(Container container){
        container.setLayout(new BorderLayout());
        //NORTH adding
        createNorth(container);
        //SOUTH adding
        createSouth(container);
        //WEST adding
        createWest(container);
        //CENTER adding
        createCenter(container);
    }

    private void createNorth(Container container){
        PanelNorth = new JPanel();
        //Image
        ImageIcon imageNetnix = new ImageIcon("Images/netnix.PNG");
        ImageNetnixLabel = new JLabel(imageNetnix);
        //Setting Colors
        PanelNorth.setBackground(Color.DARK_GRAY);
        //Adding all components
        PanelNorth.add(ImageNetnixLabel);
        container.add(PanelNorth, BorderLayout.NORTH);
    }

    private void createSouth(Container container){
        PanelSouth = new JPanel();
        GridLayout layoutSouth = new GridLayout(1, 5);
        PanelSouth.setLayout(layoutSouth);
        PanelSouth.setPreferredSize(new Dimension(1,20));
        JLabel blank = new JLabel("");
        JLabel s1 = new JLabel("Netnix Statistix");
        s1.setForeground(Color.WHITE);
        JLabel s2 = new JLabel("Informatica | Jaar 2017 | Klas F | Rik Vanhijfte | Chino Zheng | Rick Voesenek", SwingConstants.RIGHT);
        s2.setForeground(Color.WHITE);
        //Setting Colors
        PanelSouth.setBackground(Color.DARK_GRAY);
        //Adding all components
        PanelSouth.add(s1);
        PanelSouth.add(blank);
        PanelSouth.add(blank);
        PanelSouth.add(blank);
        PanelSouth.add(s2);
        container.add(PanelSouth, BorderLayout.SOUTH);
    }

    private void createWest(Container container){
        PanelWest= new JPanel();
        PanelWest.setPreferredSize(new Dimension(250,50));
        //Setting Colors
        PanelWest.setBackground(Color.gray);
        //Adding all components
        container.add(PanelWest, BorderLayout.WEST);
    }

    private void createCenter(Container container){
        //Visual aspects tabs
        tabbedPane1.setOpaque(false);
        //Setting Colors
        tabbedPane1.setForeground(Color.BLACK);
        tabbedPane1.setBackground(Color.LIGHT_GRAY);
        paneltab1.setBackground(Color.LIGHT_GRAY);
        paneltab2.setBackground(Color.LIGHT_GRAY);
        paneltab3.setBackground(Color.LIGHT_GRAY);
        paneltab4.setBackground(Color.LIGHT_GRAY);
        PanelCenter.setBackground(Color.LIGHT_GRAY);
        //Adding all components
        container.add(PanelCenter);
    }
}