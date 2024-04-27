package com.e2etests.automation.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private String propertyFilePath = "src/test/resources/configs/configFile.properties";

	public ConfigFileReader() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				System.out.println("Exception: ," + e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception: ," + e);
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("Exception: ," + e);
				}
			}
		}
	}

	public String getProperties(String prop) {
		String param = properties.getProperty(prop);
		if (param != null)
			return param;
		else
			throw new RuntimeException("url not specified in the configuration file !");
	}
}