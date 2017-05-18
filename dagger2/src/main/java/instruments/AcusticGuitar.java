package instruments;

/**
 * Created by ingrid on 14/05/17.
 */
public class AcusticGuitar implements Guitar {

    private String madonna = "Hung up!";

    @Override
    public void choose() {
        System.out.println(madonna);
    }
}
