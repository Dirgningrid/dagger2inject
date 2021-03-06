package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.instruments.Guitar;

import javax.inject.Singleton;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class RockInstrumentModule {

    @Provides
    public ElectricGuitar providesGuitar(){
        return new ElectricGuitar();
    }

    @Provides
    public Drums providesDrums(){
        return new Drums();
    }
}
