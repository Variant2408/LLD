package Client;

import Handler.Impl.DebugLogger;
import Handler.Impl.ErrorLogger;
import Handler.Impl.InfoLogger;
import Handler.Logger;

public class chainPatternDemo {
    public static Logger getChainLogger(){
        Logger infoLogger=new InfoLogger(Logger.INFO);
        Logger debugLogger=new DebugLogger(Logger.DEBUG);
        Logger errorLogger= new ErrorLogger(Logger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        return  infoLogger;
    }
}
