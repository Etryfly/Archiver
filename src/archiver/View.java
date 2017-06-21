package archiver;

import javax.swing.*;
import java.awt.*;

/**
 * Created by etryfly on 20.06.17.
 */
public class View extends JFrame {
    private JButton buttonFile = new JButton("Select file for archivation");
    private JButton buttonArch = new JButton("Select output archive");
    private JButton buttonSubmit = new JButton("Archivate");
    public JLabel outputLable = new JLabel("Please, select file");
    public JLabel inputLable = new JLabel("Please, select file");
    private Controller controller;
    public View(Controller controller) {
        super("Archiver");
        this.controller = controller;

        this.setBounds(100, 100, 450, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.setBackground(Color.gray);

        controller.onListenArchiveSelect(buttonArch);
        controller.onListenFileSelect(buttonFile);
        controller.onListenSubmit(buttonSubmit);

        container.add(buttonFile);
        container.add(inputLable);
        container.add(buttonArch);
        container.add(outputLable);
        container.add(buttonSubmit);
    }



}
