package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Drums;

/**
 * Created by ingrid on 19/05/17.
 */

@Module
public class PopInstrumentModule {

    @Provides
    public AcusticGuitar providesAcusticGuitar(){
        return new AcusticGuitar();
    }

    @Provides
    public Drums providesDrums(){
        return new Drums();
    }
}
