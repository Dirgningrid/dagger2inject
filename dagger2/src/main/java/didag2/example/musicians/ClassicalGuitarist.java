package didag2.example.musicians;

import didag2.example.instruments.ClassicalGuitar;

/**
 * Created by ingrid on 14/05/17.
 */
public class ClassicalGuitarist implements Guitarist {
    private ClassicalGuitar guitar;

    public ClassicalGuitarist(ClassicalGuitar guitar){
        this.guitar = guitar;
    }

    @Override
    public void playGuitar() {
        guitar.choose();
    }

}
