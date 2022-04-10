package personal.schoolproject.config;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class getPropertyValues {
    InputStream inputStream;
    Properties prop = new Properties();

    public getPropertyValues() throws IOException {
        try {
            String propFileName = "personal\\schoolproject\\resources\\config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
    }
    public String getPropS(String propName) {
        return prop.getProperty(propName);
    }
    public Boolean getPropB(String propName) {
        boolean isTrue = false;
        if (propName.equals("true")) {
            isTrue = true;
        }
        return isTrue;
    }

}
