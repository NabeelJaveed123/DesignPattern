
import singleton.Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabeel
 */
public class Main {
        public static void main(String[] args) {
		Connection c = Connection.getInstance();
		c.getData();
                Configuration config = Configuration.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));
                Singleton ob = Singleton.getInstance();
                System.out.println(ob);
    }
    
}
