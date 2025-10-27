import java.util.Random;

//********************************************************************
//  Die.java       Java Foundations
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************

public class Die {

    private int faceValue;  // current value showing on the die
    private Random random;  // random number generator
    private int numSides;

    //-----------------------------------------------------------------
    //  Constructor: Sets the initial face value.
    //-----------------------------------------------------------------
    public Die() {
        random = new Random();
        //faceValue = 1;
        numSides = 6;
        roll();

    }

    public Die(int sides) {
        random = new Random();
        numSides = sides;
        roll();
    }

    //-----------------------------------------------------------------
    //  Computes a new face value for this die and returns the result.
    //-----------------------------------------------------------------
    public int roll() {
        faceValue = random.nextInt(numSides) + 1;

        return faceValue;
    }

    //-----------------------------------------------------------------
    //  Face value mutator. The face value is not modified if the
    //  specified value is not valid.
    //-----------------------------------------------------------------
    public void setFaceValue(int value) {
    	if (value > 0 && value <= numSides) {
            faceValue = value;
        }
    }

    //-----------------------------------------------------------------
    //  Face value accessor.
    //-----------------------------------------------------------------
    public int getFaceValue() {
        return faceValue;
    }

    //-----------------------------------------------------------------
    //  Returns a string representation of this die.
    //-----------------------------------------------------------------
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}
