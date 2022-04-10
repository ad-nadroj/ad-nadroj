package personal.schoolproject.frames;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class mainScreen {
    final JFrame frame = new JFrame("PAT");

    public mainScreen() {
        final JMenuItem settings = new JMenuItem("Settings");
            settings.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new settingsScreen(frame);
                }
            });

        final JMenu settingsMenu = new JMenu("Tools");
            settingsMenu.add(settings);

        final JMenuBar mb = new JMenuBar();
            mb.add(settingsMenu);

        final JPanel panel = new JPanel();

        //Frame Initialization
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setJMenuBar(mb);
            frame.pack();
            frame.setSize(1280, 720);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
    }
}
