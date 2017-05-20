package didag2.example.dagger;

import didag2.example.Band;
import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.*;

import javax.inject.Singleton;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class RockBandModule {

    @Provides
    public Guitarist providesGuitarist(ElectricGuitar guitar){
        return new RockerGuitarist(guitar);
    }

    @Provides
    public Drummer providesDrummer(Drums drums){
        return new RockerDrummer(drums);
    }

    @Provides
    @Singleton
    public Singer providesSinger(){
        return new Singer();
    }

}
