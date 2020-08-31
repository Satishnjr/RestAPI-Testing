package com.helpers;

import java.io.IOException;
import java.util.Properties;

public class TestProfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		//properties.load(Props.class.getResourceAsStream("/profiles/dev/config.properties"));
		//System.out.println(properties);
		System.out.println(System.getenv("env"));
	}

}
