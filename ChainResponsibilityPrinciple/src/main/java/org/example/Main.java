package org.example;

// src/main/java/org/example/Main.java

import Handler.Logger;
import Client.chainPatternDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Logger loggingObj = chainPatternDemo.getChainLogger();
        // Example usage
        loggingObj.logMessage(Logger.INFO, "This is an information.");
        loggingObj.logMessage(Logger.DEBUG, "This is a debug level information.");
         loggingObj.logMessage(Logger.ERROR, "This is an error information.");
    }
}
