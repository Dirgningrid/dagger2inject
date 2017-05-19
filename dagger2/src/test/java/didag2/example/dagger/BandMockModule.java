package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.Band;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class BandMockModule {

    @Provides
    public Band providesBand(Guitarist guitarist, Singer singer, Drummer drummer){
        return new Band(guitarist, singer, drummer);
    }

    @Provides
    public Guitarist providesGuitarist(ElectricGuitar guitar){
        Guitarist m = Mockito.mock(Guitarist.class);
        when(m.playGuitar()).thenReturn("A");
        return m;
    }

    @Provides
    public Singer providesSinger(){
        return Mockito.mock(Singer.class);
    }

    @Provides
    public Drummer providesDrummer(Drums drums){
        return Mockito.mock(Drummer.class);
    }
}
