package musicians;

/**
 * Created by ingrid on 14/05/17.
 */

public class Singer {

    private long decibel;
    private String ROCK = "I'm Axl Rose\n";
    private String POP = "I'm Madonna\n";

    public void setDecibel(long decibel) {
        this.decibel = decibel;
    }

    public String singingSomething(boolean isRock){
        if(isRock){
            return ROCK;
        } else {
            return POP;
        }
    }
}
