package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.instruments.Guitar;
import org.mockito.Mockito;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class InstrumentMock {

    @Provides
    public Guitar providesGuitar(){
        return Mockito.mock(Guitar.class);
    }

    @Provides
    public Drums providesDrums(){
        return Mockito.mock(Drums.class);
    }
}
