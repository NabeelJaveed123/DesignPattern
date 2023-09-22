/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author Nabeel
 */
public class Singleton {

    private static volatile Singleton instance = null;

    public Singleton() {}

    public static Singleton getInstance() {
        Singleton instance = Singleton.instance;
        if (instance == null) {
            synchronized(Singleton.class) {
                instance = Singleton.instance;
                if (instance == null) {
                    Singleton.instance = instance = new Singleton();
                }
            }
        }
        return instance;
    }
}