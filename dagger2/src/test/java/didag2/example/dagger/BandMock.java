package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.Band;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.*;
import org.mockito.Mockito;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class BandMock {

    @Provides
    public Band providesMockBand(Guitarist guitarist, Singer singer, Drummer drummer){
        return Mockito.mock(Band.class);
    }

    @Provides
    public Guitarist providesGuitarist(ElectricGuitar guitar){
        return Mockito.mock(RockerGuitarist.class);
    }

    @Provides
    public Singer providesSinger(){
        return Mockito.mock(Singer.class);
    }

    @Provides
    public Drummer providesDrummer(Drums drums){
        return Mockito.mock(RockerDrummer.class);
    }
}
