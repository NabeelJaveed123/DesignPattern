/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeexample;


    

public class UniversalRemote extends BasicRemote {

    public UniversalRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: maxbutton");
        device.setVolume(0);
    }
}
