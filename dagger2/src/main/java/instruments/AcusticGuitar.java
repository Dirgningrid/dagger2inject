package instruments;

/**
 * Created by ingrid on 14/05/17.
 */
public class AcusticGuitar implements Guitar {

    private String madonna = "Hung up!\n";

    @Override
    public String chooses() {
        return madonna;
    }
}
