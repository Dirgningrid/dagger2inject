package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.Rocker;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class RockerModule {

    ElectricGuitar guitar;
    Drums drums;

    @Provides
    Rocker provideRockGuitarist(){
        return new Rocker(guitar);
    }

    @Provides
    Rocker provideRockDrummer(){
        return new Rocker(drums);
    }

//    @Provides
//    ElectricGuitar provideGuitar(){
//        return new ElectricGuitar();
//    }
//
//    @Provides
//    Drums provideDrums(){
//        return new Drums();
//    }
}
