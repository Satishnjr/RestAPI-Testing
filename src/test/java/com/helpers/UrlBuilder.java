package com.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UrlBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);
    private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";
    private static String basePath;
    
    static {
        Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);
		basePath = Props.getProp("app.url");

    }

    

    public static String getBasePathURI() {
        return basePath;
    }

   

   
}
