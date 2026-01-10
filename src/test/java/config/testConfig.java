package config;

import java.io.InputStream;
import java.util.Properties;

public class testConfig {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input =
                     testConfig.class
                             .getClassLoader()
                             .getResourceAsStream("config/test.properties")) {

            if (input == null) {
                throw new RuntimeException("test.properties not found");
            }
            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // generic
    public static String get(String key) {
        return properties.getProperty(key);
    }

}
