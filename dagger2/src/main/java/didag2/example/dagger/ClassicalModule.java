package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.ClassicalGuitar;
import didag2.example.musicians.Classical;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class ClassicalModule {

    ClassicalGuitar guitar;

    @Provides
    Classical provides(){
        return new Classical(guitar);
    }

}
