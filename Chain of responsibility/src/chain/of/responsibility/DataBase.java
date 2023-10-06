/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility;

/**
 *
 * @author fa20-bse-061
 */
public class DataBase extends AbstractLogger {

   public DataBase(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("DataBase Console::Logger: " + message);
   }
}

