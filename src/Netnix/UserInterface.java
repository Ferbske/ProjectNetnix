package Netnix;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame mainpage;

    public UserInterface() {
    }

    @Override
    public void run() {
        mainpage = new JFrame("Netnix Statistix");
        mainpage.setExtendedState(mainpage.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addDefaultComponents(mainpage.getContentPane());
        addCenterComponent(mainpage.getContentPane());

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
    }

    private void addCenterComponent(Container container){
        // CENTER adding
            createCenter(container);
    }

    private void createNorth(Container container){
            JPanel north = new JPanel();
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
        JPanel south = new JPanel();
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

    private void createWest(Container container){
        JPanel west = new JPanel();
        GridLayout layoutWest = new GridLayout(50, 3);
        west.setLayout(layoutWest);
        west.setPreferredSize(new Dimension(275,50));
        for (int i = 0; i < 150; i++){
            west.add(new JLabel("Grid " + i));
        }
        // Temp testing area's
            west.setBackground(Color.gray);
        // ADding all components
            container.add(west, BorderLayout.WEST);
    }

    private void createCenter(Container container){
        JPanel center = new JPanel();
        GridLayout layoutCenter = new GridLayout(50,5);
        center.setLayout(layoutCenter);
        for (int i = 0; i < 250; i++)
            center.add(new JLabel("Grid " + i));
        // Temp testing area's
            center.setBackground(Color.lightGray);
        // ADding all components
            container.add(center, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return mainpage;
    }


}
