package instruments;

/**
 * Created by ingrid on 15/05/17.
 */
public class Drums {

    private int numPlates;
    private int numBass;
    private boolean isRock = true;
    private String ROCK = "Let's Rock!\n";
    private String POP = "Let's Pop!\n";

    public int getNumPlates() {
        return numPlates;
    }

    public void setNumPlates(int numPlates) {
        this.numPlates = numPlates;
    }

    public int getNumBass() {
        return numBass;
    }

    public void setNumBass(int numBass) {
        this.numBass = numBass;
    }

    public String letsBeat(boolean isRock){
        if(isRock){
            return ROCK;
        } else {
            return POP;
        }
    }
}
