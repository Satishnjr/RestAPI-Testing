package com.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UrlBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);
    private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";
    private static URL basePath;
    
    static {
        try {
            Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);
            basePath = new URL(Props.getProp("dev.url"));
            
        
        } catch (MalformedURLException e) {
            LOG.error(e.getMessage());
        }

    }

    

    public static URI getBasePathURI() {
        return URI.create(Props.getProp("dev.url"));
    }


    public static String getUrl(String applicationUrl) {
        return Props.getProp(applicationUrl);
    }


    

    public static URL createUrl(String path) {
        try {
            return new URL(basePath.getProtocol(), basePath.getHost(), basePath.getPort(), path);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
