package Handler.Impl;

import java.util.logging.Handler;
import Handler.Logger;

public class DebugLogger extends Logger {

    public DebugLogger(int level){
        this.level=level;
    }
    protected void write(String message){
        System.out.println("DebugLogger "+message);
    }
}
