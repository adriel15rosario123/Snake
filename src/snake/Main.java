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

class Node {
    private int valor;
    private Node next;
    
    public Node(int valor){
        this.valor = valor;
    }
    
    public Node(int valor, Node next){
        this.valor = valor;
        this.next = next;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}

class MyLinkedList {
    
    private Node head;
    private Node tail;
    
    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public void addItemAtBeginnig(int valor){
        Node node = new Node(valor);
        if(this.head == null){
            this.head = node;
        }else{
            node.setNext(this.head);
            this.head = node;
        }
    }
    
    public void addItemAtEnd(int valor){
        Node node = new Node(valor);
        if(this.head == null){
            this.head = this.tail =  node;
        }else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    
}