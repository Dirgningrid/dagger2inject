package instruments;

/**
 * Created by ingrid on 15/05/17.
 */
public class Drums {

    private int numPlates;
    private int numBass;

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

    public void letsBeat(){
        System.out.println("Let's Rock!");
    }
}
