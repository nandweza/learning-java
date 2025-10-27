public class PairOfDice {
    private  Die die1;
    private  Die die2;
     

    public PairOfDice(){
        die1 = new Die();
        die2 = new Die();
    }

    public PairOfDice(int numSides){
        die1 = new Die(numSides);
        die2 = new Die(numSides);
       
    }

    public int getFaceValue1(){
        return die1.getFaceValue();
    }

    public int getFaceValue2(){
        return die2.getFaceValue();
    }

    public int getTotal(){
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public void roll(){
        die1.roll();
        die2.roll();
    }

    public String toString(){
        return getTotal() + "(" + getFaceValue1() + " + " + getFaceValue2() + ")";
    }
}
