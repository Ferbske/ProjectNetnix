package Netnix;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class UserInterface implements Runnable {

    private JFrame mainpage;

    public UserInterface() {
    }

    @Override
    public void run() {
        mainpage = new JFrame("Netnix Statisticks");
        mainpage.setExtendedState(mainpage.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(mainpage.getContentPane());

        mainpage.pack();
        mainpage.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        // NORTH adding
            createNorth(container);
        // EAST adding
            createEast(container);
        // SOUTH adding
            createSouth(container);
        // WEST adding
            createWest(container);
        // CENTER adding
            createCenter(container);
    }

    private void createNorth(Container container){
        // Image Netnix
            ImageIcon imageNetnix;
            JLabel labelNetnix;
            JPanel north = new JPanel();
            imageNetnix = new ImageIcon("Images/Netnix.PNG");
            labelNetnix = new JLabel(imageNetnix);
        // Temp testing area's
            north.setBackground(Color.darkGray);
        // Adding all components
            north.add(labelNetnix);
            container.add(north, BorderLayout.NORTH);
    }

    private void createEast(Container container){
        JPanel east = new JPanel();
        // Temp testing area's
            east.setBackground(Color.green);
        // ADding all components
        container.add(east, BorderLayout.EAST);
    }

    private void createSouth(Container container){
        JPanel south = new JPanel();
        // Temp testing area's
            south.setBackground(Color.blue);
        // ADding all components
            container.add(south, BorderLayout.SOUTH);
    }

    private void createWest(Container container){
        JPanel west = new JPanel();
        // Temp testing area's
            west.setBackground(Color.black);
        // ADding all components
            container.add(west, BorderLayout.WEST);
    }

    private void createCenter(Container container){
        JPanel center = new JPanel();
        // Temp testing area's
            center.setBackground(Color.gray);
        // ADding all components
            container.add(center, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return mainpage;
    }
}
