package musicians;

import instruments.ClassicalGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class Classical implements Guitarist {
    private ClassicalGuitar guitar;

    public Classical(ClassicalGuitar guitar){
        this.guitar = guitar;
    }

    @Override
    public void play() {
        guitar.genere();
    }

}
