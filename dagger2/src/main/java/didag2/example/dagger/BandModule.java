package didag2.example.dagger;

import didag2.example.Band;
import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.*;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class BandModule {

    @Provides
    public Band providesBand(Guitarist guitarist, Singer singer, Drummer drummer){
        return new Band(guitarist, singer, drummer);
    }

    @Provides
    public Guitarist providesGuitarist(ElectricGuitar guitar){
        return new RockerGuitarist(guitar);
    }

    @Provides
    public ElectricGuitar providesGuitar(){
        return new ElectricGuitar();
    }

    @Provides
    public Singer providesSinger(){
        return new Singer();
    }

    @Provides
    public Drummer providesDrummer(Drums drums){
        return new RockerDrummer(drums);
    }

    @Provides
    public Drums providesDrums(){
        return new Drums();
    }
}
