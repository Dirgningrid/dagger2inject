package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.ClassicalGuitar;
import didag2.example.musicians.ClassicalGuitarist;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class ClassicalModule {

    ClassicalGuitar guitar;

    @Provides
    ClassicalGuitarist provides(){
        return new ClassicalGuitarist(guitar);
    }

}
