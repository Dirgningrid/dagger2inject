package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.RockerGuitarist;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class RockerGuitaristModule {

    ElectricGuitar guitar;

    @Provides
    RockerGuitarist provideRockGuitarist(){
        return new RockerGuitarist(guitar);
    }
}
