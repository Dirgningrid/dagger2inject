package didag2.example.dagger;

import dagger.Module;
import dagger.Provides;
import didag2.example.instruments.AcusticGuitar;
import didag2.example.instruments.Drums;
import didag2.example.musicians.*;

/**
 * Created by ingrid on 19/05/17.
 */

@Module
public class PopBandModule {
    @Provides
    public Guitarist providesPopGuitarist(AcusticGuitar guitar){
        return new PopGuitarist(guitar);
    }

    @Provides
    public Drummer providesPopDrummer(Drums drums){
        return new PopDrummer(drums);
    }

    @Provides
    public Singer providesSinger(){
        return new Singer();
    }
}
