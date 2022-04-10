package personal.schoolproject.frames;

import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JComponent;
import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.event.*;

public class settingsScreen{
    public settingsScreen(JFrame owner){
        UIManager.put( "TabbedPane.showTabSeparators", true );

        final JTabbedPane tabbedPane = new JTabbedPane();
            JComponent generalPanel = makeTextPanel();
                tabbedPane.addTab("General", null, generalPanel, null);
                tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

            JComponent accountPanel = makeTextPanel();
                tabbedPane.addTab("Account", null, accountPanel, null);
                tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

            JComponent securityPanel = makeTextPanel();
                tabbedPane.addTab("Security", null, securityPanel, null);
                tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
            
            JComponent themesPanel = makeTextPanel();
                tabbedPane.addTab("Themes", null, themesPanel, null);
                tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        final JMenuBar mb = new JMenuBar();

        final JDialog frame = new JDialog(owner, "Settings");
            frame.setModal(true);
            frame.setAlwaysOnTop( true );
            frame.add(tabbedPane);
            frame.setJMenuBar(mb);
            frame.pack();   
            frame.setSize(500, 350);
            frame.setLocationRelativeTo(owner);
            frame.setResizable(false);
            frame.setVisible(true);
            frame.toFront();
            frame.requestFocus();
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });
    }
    protected JComponent makeTextPanel() {
        JPanel panel = new JPanel(false);
        panel.setLayout(new GridLayout(1, 1));
        return panel;
    }
}