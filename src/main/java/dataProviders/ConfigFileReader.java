package dataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    public final String CONFIG_FILE_PATH = "config.properties";
    public FileInputStream fileInputStream;
    public Properties properties;

    public ConfigFileReader() {
        try {
            fileInputStream = new FileInputStream(new File(CONFIG_FILE_PATH));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        properties = new Properties();
        try {
            properties.load(fileInputStream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

    public String getApplicationUrl() {
        return properties.getProperty("applicationUrl");
    }

    public String getDriverPath() {
        return properties.getProperty("driverPath");
    }
}
