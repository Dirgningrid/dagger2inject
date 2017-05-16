package didag2.example.dagger;

import didag2.example.Band;
import dagger.Module;
import dagger.Provides;
import didag2.example.musicians.Drummer;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;

/**
 * Created by ingrid on 16/05/17.
 */

@Module
public class BandModule {

    Guitarist guitarist;
    Singer singer;
    Drummer drummer;


    @Provides
    Band providesBand(){
        return new Band(guitarist, singer, drummer);
    }
}
