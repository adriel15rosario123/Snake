/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author Adriel Rosario
 */
public class Apple {
    
    private final String appleBody = " A ";
    private int randomF;
    private int randomC;
    
    public Apple()
    {
        randomF = Apple.getRandomPos();
        randomC = Apple.getRandomPos();
    }
    
    public static int getRandomPos(){
        int random = (int)(Math.random()*(9-0+1)+0);
        return random;
    }

    public int getRandomF() {
        return randomF;
    }

    public void setRandomF(int randomF) {
        this.randomF = randomF;
    }

    public int getRandomC() {
        return randomC;
    }

    public void setRandomC(int randomC) {
        this.randomC = randomC;
    }
    
    public String getAppleBody() {
        return appleBody;
    }
    
}
