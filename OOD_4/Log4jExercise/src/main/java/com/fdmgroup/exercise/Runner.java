package com.fdmgroup.exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		

		logger.debug("debug application started");
		logger.info("info application started");
		logger.warn("warn application started");
		logger.error("error application started");
		
	}
	
	public static double returnTaxableRate(String salaryString) {
		
		return 0.00;
	}

}
