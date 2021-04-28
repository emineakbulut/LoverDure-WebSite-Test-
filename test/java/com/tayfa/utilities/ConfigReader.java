package com.tayfa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {

        String path = "C:\\Users\\Work\\eclipse-workspace\\TestNGFramework2\\Configuration.properties";
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
