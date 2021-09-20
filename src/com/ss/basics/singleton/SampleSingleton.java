package com.ss.basics.singleton;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @edited Matthew Hader
 *
 */
public class SampleSingleton {

	private volatile static Connection conn = null;
	
	private volatile static SampleSingleton instance = null;
	
	private SampleSingleton() {
		
	}
	
	public static SampleSingleton getInstance() {
		
		if(instance == null) {
			synchronized(SampleSingleton.class) {
				if(instance == null)
					instance = new SampleSingleton();
			}
		}
		return instance;
	}
	
}
