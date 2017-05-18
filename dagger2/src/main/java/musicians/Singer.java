package musicians;

/**
 * Created by ingrid on 14/05/17.
 */

public class Singer {

    private long decibel;

    public void setDecibel(long decibel) {
        this.decibel = decibel;
    }

    public void singingSomething(boolean isRock){
        if(isRock){
            System.out.println("I'm Axl Rose");
        } else {
            System.out.println("I'm Madonna");
        }
    }

}
