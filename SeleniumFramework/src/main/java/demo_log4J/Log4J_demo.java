package demo_log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J_demo {
	
	private static Logger logger = LogManager.getFormatterLogger(Log4J_demo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello world \n");
		
		logger.trace("This is a trace message");
		logger.info("This is an info");
		logger.error("This is an error");
		logger.warn("This is a warning");
		logger.fatal("This is a fatal message");
		System.out.println("Completed \n");
		
	}

}
