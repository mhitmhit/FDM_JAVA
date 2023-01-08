package com.fdmgroup.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	//created logger
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		System.out.println("Logger Name: " + logger.getName());
		logger.debug("Application started");
		logger.trace("trace application started");
		// change the value of 'argument' based on the code
		// in doLoggerStuff() to see all msg permutations
		String argument = "abcdefghijklmn";
		doLoggerStuff(argument);
		logger.debug("Application finished");
	}

	private static void doLoggerStuff(String argument) {
		logger.traceEntry("doLoggerStuff()");

		// Uncomment Try-Catch block when you want to see an Exception logged
//		 try {
//		 Integer someMathOperation = Integer.parseInt(argument) * 5;
//		 logger.info("The result is: " + someMathOperation);
//		 } catch (NumberFormatException nfe) {
//		 logger.fatal("This was really bad :", nfe);
//		 }

		if (argument == null || argument.isEmpty()) {
			logger.error("Not a valid entry");
		} else if (argument.length() > 10) {
			logger.warn("The string entered is longer than 10 characters!");
		} else if (argument.equalsIgnoreCase("A")) {
			logger.info("I got an 'A'!!!");
		} else {
			logger.debug("User Input: " + argument);
		}

		logger.traceExit("doLoggerStuff()");
	}

}
