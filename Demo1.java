package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	// Common step which you need if you want to use log object in your class.
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// You can use debug(),info(),error() and fatal() methods

		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");

		log.fatal("this is fatal!!");

	}

}
