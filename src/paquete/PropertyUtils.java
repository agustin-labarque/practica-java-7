package paquete;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {
    InputStream inputStream;

    /*
    ToDo hacerlo mas generico
    ahora tiene hardcodeado el getProperty("sorter")
     */
    public String parseSorterFromProperties(String fileName) throws IOException {

        try {
            Properties prop = new Properties();

            inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
            }

            return prop.getProperty("sorter");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }

        return null;
    }

}
