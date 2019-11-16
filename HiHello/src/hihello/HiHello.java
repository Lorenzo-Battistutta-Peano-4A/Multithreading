/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hihello;

/**
 *
 * @author perilli.alberto
 */
public class HiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say hi = new Say("Hi");
        Say hello = new Say("Hello");
        hi.start();
        hello.start();
    }
    
}
