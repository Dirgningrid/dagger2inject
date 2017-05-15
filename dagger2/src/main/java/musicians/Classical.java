package musicians;

import instruments.ClassicalGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class Classical implements Guitarist {
    private ClassicalGuitar guitar;

    public Classical(){
        guitar = new ClassicalGuitar();
        guitar.setAcustic(false);
    }

    @Override
    public void play() {
        guitar.genere();
    }

}
