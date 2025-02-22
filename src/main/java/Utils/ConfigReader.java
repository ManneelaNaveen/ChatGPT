package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    // Static block to load properties only once
    
    static {
        try {
            // Load properties file from resources folder
        	
            FileInputStream file = new FileInputStream("src/main/resources/Config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
