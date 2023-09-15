/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

/**
 *
 * @author fa20-bse-061
 */
public class MountainBike extends Bicycle {
     public int seatHeight;

    public MountainBike(int gear, int speed,
                        int startHeight)
    {
       
        super(gear, speed);
        seatHeight = startHeight;
    }
 
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
    

