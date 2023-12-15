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
public class InterpreterPatternDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }
   public static interpreter.Expression getSonExpression(){
      interpreter.Expression shuart = new TerminalExpression("Shuart");
      interpreter.Expression robert = new TerminalExpression("Robert");
      return new OrExpression( shuart,robert);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
   public static interpreter.Expression getDaughterExpression(){
      interpreter.Expression samantha = new TerminalExpression("Samantha");
      interpreter.Expression julie = new TerminalExpression("Julie");
      return new OrExpression( samantha, julie);		
   }

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
       interpreter.Expression isSon = getSonExpression();
       interpreter.Expression isDaughter = getDaughterExpression();

      
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Shuart is a son of Robert? " + isSon.interpret("Shuart"));
      System.out.println("Samantha is a Daughter of julie? " + isDaughter.interpret("Samantha"));
   }
}
