package utilities;

import org.apache.log4j.Logger;

public class logCollection {
	
	//static Logger log= Logger.getLogger(log.class.getName());

	public static Logger log=Logger.getLogger(logCollection.class.getName());


	public static void info (String Message)

	{
		
		log.info(Message);
	}

	public static void debug (String Message)

	{
		
		log.debug(Message);
	}

	public static void error (String Message)

	{
		
		log.error(Message);
	}

	public static void log(String string) {
		// TODO Auto-generated method stub
		
	}


}
