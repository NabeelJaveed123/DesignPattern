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
public class SingleBorderedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new SingleBorderedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new SingleBorderedSquare();	 
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new SingleBorderedTriangle();
      }	 
      return null;
   }
}