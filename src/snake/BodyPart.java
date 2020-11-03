/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import com.sun.glass.events.KeyEvent;
import java.util.LinkedList;

/**
 *
 * @author Adriel Rosario
 */
public class BodyPart {
    
    //ATRIBUTOS DE LA CLASE BODY PART
    private final String cuerpo = " o ";
    private int fAct;
    private int cAct;
    private int fAnt;
    private int cAnt;
    
    private static LinkedList<BodyPart> body;
    
    //CONSTRUCTOR
    private BodyPart(){
        
    }
    
    //EN ESTA CLASE SE USA EL PATRON DE DISENO SINGLETON 
    public static LinkedList<BodyPart> getBody(){
        if(body == null){
            body = new LinkedList<BodyPart>();
        }
        return body;
    }
    
    //GETTERS AND SETTERS
    public String getCuerpo() {
        return cuerpo;
    }

    public int getfAct() {
        return fAct;
    }

    public void setfAct(int fAct) {
        this.fAct = fAct;
    }

    public int getcAct() {
        return cAct;
    }

    public void setcAct(int cAct) {
        this.cAct = cAct;
    }

    public int getfAnt() {
        return fAnt;
    }

    public void setfAnt(int fAnt) {
        this.fAnt = fAnt;
    }

    public int getcAnt() {
        return cAnt;
    }

    public void setcAnt(int cAnt) {
        this.cAnt = cAnt;
    }

    //-----------Insertar un BodyPart
    public static void addBodyPart(int fAct,int cAct){
        BodyPart bp = new BodyPart();
        bp.setfAct(fAct);
        bp.setcAct(cAct);   
        body.add(bp);
    }
    
    //-----------METODOS PARA EL MOVIMIENTO
    public static void moverDerecha(){
       
        int ftemp = 0;
        int ctemp = 0;
        
  
        for(BodyPart bp: body){
            
            
            if(bp == body.getFirst()){
                bp.setcAnt(bp.getcAct());
                bp.setfAnt(bp.getfAct());
                bp.setcAct(bp.getcAct() + 1);
                
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
            else{
                bp.setfAnt(bp.getfAct());
                bp.setcAnt(bp.getcAct());
                bp.setfAct(ftemp);
                bp.setcAct(ctemp);
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
            
        }
            
    }
    
    public static void moverIzquierda(){
        
        int ftemp = 0;
        int ctemp = 0;
       
    
            for(BodyPart bp: body){

                if(bp == body.getFirst()){
                    bp.setcAnt(bp.getcAct());
                    bp.setfAnt(bp.getfAct());
                    bp.setcAct(bp.getcAct() - 1);
                    
                    ftemp = bp.getfAnt();
                    ctemp = bp.getcAnt();
                }
                else{
                    bp.setfAnt(bp.getfAct());
                    bp.setcAnt(bp.getcAct());
                    bp.setfAct(ftemp);
                    bp.setcAct(ctemp);
                    ftemp = bp.getfAnt();
                    ctemp = bp.getcAnt();
                }
            }
     
         
    }
    
    public static void moverArriba(){
        
        int ftemp = 0;
        int ctemp = 0;
        
        for(BodyPart bp: body){
            
            if(bp == body.getFirst()){
                bp.setcAnt(bp.getcAct());
                bp.setfAnt(bp.getfAct());
                bp.setfAct(bp.getfAct() - 1);
                
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
            else{
                bp.setfAnt(bp.getfAct());
                bp.setcAnt(bp.getcAct());
                bp.setfAct(ftemp);
                bp.setcAct(ctemp);
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
        }
    }
    
    public static void moverAbajo(){
        
        int ftemp = 0;
        int ctemp = 0;
        
        for(BodyPart bp: body){
            
            if(bp == body.getFirst()){
                bp.setcAnt(bp.getcAct());
                bp.setfAnt(bp.getfAct());
                bp.setfAct(bp.getfAct() + 1);
                
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
            else{
                bp.setfAnt(bp.getfAct());
                bp.setcAnt(bp.getcAct());
                bp.setfAct(ftemp);
                bp.setcAct(ctemp);
                ftemp = bp.getfAnt();
                ctemp = bp.getcAnt();
            }
            
        }
    }
    
}
