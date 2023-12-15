/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momento;

/**
 *
 * @author fa20-bse-061
 */
public interface Command {
    String getName();
    void execute();
}
