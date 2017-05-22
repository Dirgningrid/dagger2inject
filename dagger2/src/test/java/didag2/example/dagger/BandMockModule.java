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
        Guitarist guitarist = Mockito.mock(Guitarist.class);
        when(guitarist.playGuitar()).thenReturn("I'm Slash ");
        return guitarist;
    }

    @Provides
    public Singer providesSinger(){
        Singer singer = Mockito.mock(Singer.class);
        when(singer.singingSomething(true)).thenReturn("I'm Axl Rose ");
        return singer;
    }

    @Provides
    public Drummer providesDrummer(Drums drums){
        Drummer drummer = Mockito.mock(Drummer.class);
        when(drummer.letsGetBeat()).thenReturn("now, let's rock!");
        return drummer;
    }
}
