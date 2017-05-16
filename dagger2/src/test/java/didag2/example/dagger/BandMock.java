package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.Band;
import org.mockito.Mockito;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class BandMock {

    @Provides
    public Band providesMockBand(){
        return Mockito.mock(Band.class);
    }
}
