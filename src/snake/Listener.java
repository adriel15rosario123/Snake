/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Adriel Rosario
 */
public class Listener extends JFrame implements Runnable {

    public Listener(){
        setVisible(true);
        eventoTeclado teclado = new eventoTeclado();
        addKeyListener(teclado);
    }
    
    @Override
    public void run() {
        
    }
    
}

class eventoTeclado implements KeyListener{
    
    Evento evento = Evento.getEvent();
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_D) {
            evento.setEventoKey(KeyEvent.VK_D);   
	}
		
        if(e.getKeyCode() == KeyEvent.VK_A) {
            evento.setEventoKey(KeyEvent.VK_A);
	}
		
	if(e.getKeyCode() == KeyEvent.VK_W) {
            evento.setEventoKey(KeyEvent.VK_W);
	}
		
	if(e.getKeyCode() == KeyEvent.VK_S) {
            evento.setEventoKey(KeyEvent.VK_S);
	}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}