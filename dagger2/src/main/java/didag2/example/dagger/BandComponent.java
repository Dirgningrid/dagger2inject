package didag2.example.dagger;

import dagger.Component;
import didag2.example.Band;
import didag2.example.Main;
import didag2.example.RockTown;

/**
 * Created by ingrid on 16/05/17.
 */

@Component(modules = {BandModule.class, InstrumentModule.class} )
public interface BandComponent {

    Band injectBand();

    RockTown injectRockTown();
}
