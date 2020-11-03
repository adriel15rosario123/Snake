/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.LinkedList;

/**
 *
 * @author Adriel Rosario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Listener listener = new Listener();
        Thread tListener = new Thread(listener);
        Render render = new Render();

        
        tListener.start();
        render.start();

    }
    
}
