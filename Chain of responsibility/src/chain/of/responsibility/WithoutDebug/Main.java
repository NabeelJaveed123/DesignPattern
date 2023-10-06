/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility.WithoutDebug;

import chain.of.responsibility.AbstractLogger;
import chain.of.responsibility.ConsoleLogger;
import chain.of.responsibility.ErrorLogger;

public class Main {
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger DataBase = new ConsoleLogger(AbstractLogger.DATA);
      
      errorLogger.setNextLogger(consoleLogger);
      return errorLogger;	
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");
      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
      
      loggerChain.logMessage(AbstractLogger.DATA, 
         "This is an Database information.");
   }
}

