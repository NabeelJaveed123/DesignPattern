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
public class SingleBorderedRectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside SingleBorderedRectangle::draw() method.");
   }
}