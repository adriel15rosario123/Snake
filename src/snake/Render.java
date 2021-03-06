/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 *
 * @author Adriel Rosario
 */
public class Render extends Thread {
    
    public void run(){
        
        LinkedList<BodyPart> body = BodyPart.getBody();
        BodyPart.addBodyPart(2, 6);
        Apple apple = new Apple();
        boolean gameOver = false;
        String[][] campo = new String[20][20];
                
        //llenar el campo de punto
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                campo[i][j] = "   ";
            }
        }
        
        //INSERTAR LOS BODYPART EN EL CAMPO
        for(BodyPart bp: body){
            campo[bp.getfAct()][bp.getcAct()] = bp.getCuerpo();
        }
        
        //ASIGNAR POSICION RANDOM A LAS MANZANAS
        for (int i = 0; i < body.size(); i++) {
                
            if(apple.getRandomF() == body.get(i).getfAct() && apple.getRandomC() == body.get(i).getcAct()){
                apple.setRandomF(Apple.getRandomPos());
                apple.setRandomC(Apple.getRandomPos());
                i = 0;
            }                
        }
        
        try {
            
            //INICIO DEL JUEGO
            while(gameOver ==  false){

                //introducir snake al campo y actulizar las posiciones
                for(BodyPart bp: body){
                    campo[bp.getfAct()][bp.getcAct()] = bp.getCuerpo();
                }
                campo[body.getLast().getfAnt()][body.getLast().getcAnt()] = "   ";

                //--------------Agregar nuevo bodypart 
                if(apple.getRandomF() == body.getFirst().getfAct() && apple.getRandomC() == body.getFirst().getcAct()){
                    BodyPart.addBodyPart(body.getLast().getfAnt(), body.getLast().getcAnt());
                    
                    //asegurar que la posicion de la manzana nunca coincida con el snake
                    for (int i = 0; i < body.size(); i++) {

                        if(apple.getRandomF() == body.get(i).getfAct() && apple.getRandomC() == body.get(i).getcAct()){
                            apple.setRandomF(Apple.getRandomPos());
                            apple.setRandomC(Apple.getRandomPos());
                            i = 0;
                        }                
                    }
                }
                //introducir la manzana al campo
                campo[apple.getRandomF()][apple.getRandomC()] = apple.getAppleBody();

                //imprimir el campo
                for (int f = 0; f < 20; f++) {
                    System.out.println("");
                    for (int c = 0; c < 20; c++) {
                        System.out.print(campo[f][c]);
                    }
                }
                
                //mover el snake
                Evento evento = Evento.getEvent();
                if(evento.getEventoKey() == KeyEvent.VK_D){
                    BodyPart.moverDerecha();

                }
                if(evento.getEventoKey() == KeyEvent.VK_A){
                    BodyPart.moverIzquierda();

                }
                if(evento.getEventoKey() == KeyEvent.VK_W){
                    BodyPart.moverArriba();

                }
                if(evento.getEventoKey() == KeyEvent.VK_S){
                    BodyPart.moverAbajo();
                }

                //---------GameOver
                for (int i = 1; i < body.size(); i++) {

                    if(body.getFirst().getfAct() == body.get(i).getfAct() && body.getFirst().getcAct() == body.get(i).getcAct()){
                        gameOver = true;
                    }                
                }
                

                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
                
        } catch (Exception e) {
            Exception ex = new ArrayIndexOutOfBoundsException();
            if(e == ex){
                gameOver = true;
            }
        }
        
        System.out.println("Game Over");
        
    }
}
