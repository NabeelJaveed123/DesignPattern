/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fa20-bse-061
 */
public class DaughterExpression implements interpreter.Expression {
	 
   private interpreter.Expression expr1 = null;
   private interpreter.Expression expr2 = null;

   public DaughterExpression(interpreter.Expression expr1, interpreter.Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }

   @Override
   public boolean interpret(String context) {		
      return expr1.interpret(context) && expr2.interpret(context);
   }
}
