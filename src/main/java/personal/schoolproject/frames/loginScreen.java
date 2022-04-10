package personal.schoolproject.frames;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class loginScreen {
    final JPanel panel = new JPanel(new GridBagLayout());
    final JFrame frame = new JFrame("PAT");

    public loginScreen() {
        
        
        final JLabel loginLabel = new JLabel("Login", SwingConstants.CENTER);
            // loginLabel.setBorder(BorderFactory.createLineBorder(Color.black));
            loginLabel.setFont(new Font(loginLabel.getFont().getFontName(), Font.PLAIN, 28));

        final JTextField userTextField = new JTextField();

        final JPasswordField passwordField = new JPasswordField();  

        final JButton loginButton = new JButton("LOGIN");
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new mainScreen();
                    frame.dispose();
                }
            });

        final JButton resetButton = new JButton("RESET");    

        final JCheckBox showPassword = new JCheckBox("Show Password");    

        // Initalizing panel
        // placeComp(comp, panel, x, y, w, h);
            placeComp(loginLabel, panel, 3, 3, 2, 1);
            placeComp(Box.createVerticalStrut(10), panel, 3, 4, 1, 1);
            placeComp(userTextField, panel, 2, 5, 4, 1);
            placeComp(Box.createVerticalStrut(5), panel, 3, 6, 1, 1);
            placeComp(passwordField, panel, 2, 7, 4, 1);
            placeComp(showPassword, panel, 2, 8, 2, 1);
            placeComp(Box.createVerticalStrut(10), panel, 2, 9, 1, 1);
            placeComp(loginButton, panel, 3, 10, 2, 1);

            // panel.setBorder(BorderFactory.createLineBorder(Color.black));

        // Inializing Frame
            final JMenuBar mb = new JMenuBar();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setJMenuBar(mb);
            frame.pack();
            frame.setSize(300,300);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
    }

    public static void placeComp(Component comp, JPanel panel, int x, int y, int w, int h) {
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = 1;
        cons.gridx = x;
        cons.gridy = y;
        cons.gridwidth = w;
        cons.gridheight = h;
        panel.add(comp, cons);
    }



}
