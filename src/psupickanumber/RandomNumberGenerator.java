package psupickanumber;

import java.util.Random;


public class RandomNumberGenerator {
    private int secretNumber;
    
    public RandomNumberGenerator(){
        Random rn = new Random(System.nanoTime());
        int random = rn.nextInt(12) + 1;
        this.setSecretNumber(random);
    }
    
    public int getSecretNumber(){
        return this.secretNumber;
    }
    
    private void setSecretNumber(int numb){
        this.secretNumber = numb;
    }
    
}
