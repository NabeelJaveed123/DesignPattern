/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fa20-bse-061
 */
public class DoubleBorderedRoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DoubleBorderedRoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new DoubleBorderedRoundedSquare();	 
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new DoubleBorderedRoundedTriangle();
      }	 
      return null;
   }
}
