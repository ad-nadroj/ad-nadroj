package personal.schoolproject;

import java.io.IOException;

import javax.swing.SwingUtilities;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;

import personal.schoolproject.config.getPropertyValues;
import personal.schoolproject.frames.loginScreen;
import personal.schoolproject.frames.mainScreen;

public class App {
    private static void createAndShowGUI() {
        try {
            getPropertyValues prop = new getPropertyValues();

            String uiTheme = prop.getPropS("uiTheme");
            System.out.println(uiTheme);
            if (uiTheme.equals("light")) {
                FlatLightLaf.setup();
            } else if (uiTheme.equals("dark")) {
                FlatDarkLaf.setup();
            } else FlatIntelliJLaf.setup();

            if (prop.getPropB("isLoggedIn")) {
                new mainScreen();
            } else new loginScreen();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::createAndShowGUI);
    }
}
