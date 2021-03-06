package org.mytests;

import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Properties;

/**
 * Project: java-selenium-practice-parent
 * Package: org.mytests
 * <p>
 * User: vamshi
 * Date: 4/23/18
 * Time: 4:57 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Hooks {
    public static Properties appProperties;
    private static boolean propertiesLoaded = false;
    private String appPropertiesLoc = "config/application.properties";
    private String log4JPropsLoc = "config/log4j2.properties";
    private Logger logger = Logger.getLogger(this.getClass());


    @Before
    public void loadProperties() throws IOException {

        if (!propertiesLoaded) {
            log4JProperties(this.log4JPropsLoc);
            loadAppProperties(this.appPropertiesLoc);
            logger.info("INFO");
            logger.debug("DEBUG");
            logger.error("ERROR");
            logger.warn("WARN");
            propertiesLoaded = true;
        }
    }

    public void loadAppProperties(String appPropertiesLoc) throws IOException {
        this.appPropertiesLoc = appPropertiesLoc;
        appProperties = new Properties();
        appProperties.load(new ClassPathResource(appPropertiesLoc.trim()).getInputStream());
    }

    public void log4JProperties(String log4JPropsLoc) throws IOException {
        this.log4JPropsLoc = log4JPropsLoc;
        PropertyConfigurator.configure(new ClassPathResource(log4JPropsLoc.trim()).getInputStream());

    }
}