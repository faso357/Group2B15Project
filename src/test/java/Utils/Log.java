package Utils;

import org.apache.log4j.Logger;

public class Log {

    public static Logger log = Logger.getLogger(Log.class.getName());
//log when test cases start
    public static void startTestCase(String testCaseName){
        log.info("*******************************************");
        log.info("********************************************");
        log.info("**************"+ testCaseName+"**************");
    }

    //log when test cases done
    public static void endTestCase(String testCaseName){
        log.info("##############################################");
        log.info("###############################################");
        log.info("#############"+testCaseName+"##################");

    }
    public static void info (String message){

        log.info(message);
    }
    public static  void warning (String warning){

        log.info(warning);
    }

}
