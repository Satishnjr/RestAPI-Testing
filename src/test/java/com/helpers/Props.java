package com.helpers;

import static java.lang.System.out;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Props {
    private static final Logger LOG = LoggerFactory.getLogger(Props.class);
    private static Properties environmentProps;
    private static Properties properties;


    /**
     * Gets the key from messages.properties for a Site
     *
     * @param key
     **/
    public static String getMessage(String key) {

        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return ResourceBundle.getBundle("props/messages").getString(key);

        }
    }

    /**
     * Gets the key from Config.properties related to chosen profile
     *
     * @param key
     **/

    public static String getProp(String key) {
        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return properties.getProperty(key);

        }
    }


    public static void loadRunConfigProps(String configPropertyFileLocation) {
        properties = new Properties();
        String env = System.getProperty("environment");
        System.out.println("Environment" + env);
        if(env == null) {
        	env = "uat";
        	
        }
        
        try (InputStream inputStream = Props.class.getResourceAsStream("/envs/"+env+"/config.properties")) {
            properties.load(inputStream);
            properties.list(out);
        } catch (IOException e) {
            LOG.error(e.getMessage());
        }
    }
}