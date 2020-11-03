/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.KeyEvent;

/**
 *
 * @author Adriel Rosario
 */
public class Evento {
    
    //ATRIBUTOS 
    private int eventoKey;
    private static Evento evento;
    
    //CONSTRUCTOR
    private Evento(){
        
    }
    
    //EN ESTA CLASE SE USA EL PATRON DE DISENO SINGLETON 
    public static Evento getEvent(){
        if(evento == null){
            evento = new Evento();
        }
        return evento;
    }
    
    //GETTERS AND SETTERS
    public int getEventoKey() {
        return eventoKey;
    }

    public void setEventoKey(int eventoKey) {
        this.eventoKey = eventoKey;
    }

}
