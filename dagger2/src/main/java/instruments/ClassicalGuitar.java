package instruments;

/**
 * Created by ingrid on 14/05/17.
 */
public class ClassicalGuitar implements Instrument {
    private String bach = "Toccata e fuga in Re minore";
    private String mina = "Se telefonando";

    boolean acustic = false;

    public boolean isAcustic() {
        return acustic;
    }

    public void setAcustic(boolean acustic) {
        this.acustic = acustic;
    }

    @Override
    public void genere() {
        if(acustic){
            System.out.println(mina);
        } else {
            System.out.println(bach);
        }

    }
}
