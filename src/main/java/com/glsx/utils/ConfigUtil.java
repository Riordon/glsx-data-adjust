package com.glsx.utils;


import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by Riordon on 2016/11/1.
 */
public class ConfigUtil {
    private ConfigUtil() {}

    private static CompositeConfiguration config = null;

    public static CompositeConfiguration getConfigUtil() {
        if (config == null) {
            synchronized (ConfigUtil.class) {
                if (config == null) {
                    config = new CompositeConfiguration();
                    try {
                        config.addConfiguration(new PropertiesConfiguration("conf/my.properties"));
                    } catch (ConfigurationException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return config;
    }

    public static void main(String[] args) {
//        System.out.println(Constants.MYSQL_JDBC_URL);
    }
}
