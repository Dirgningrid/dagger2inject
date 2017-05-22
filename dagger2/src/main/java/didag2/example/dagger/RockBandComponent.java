package didag2.example.dagger;

import dagger.Component;
import didag2.example.Band;
import didag2.example.DepositoGiordani;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;

import javax.inject.Singleton;

/**
 * Created by ingrid on 16/05/17.
 */

@Singleton
@Component(modules = {RockBandModule.class, RockInstrumentModule.class} )
public interface RockBandComponent {

    Band injectBand();

    DepositoGiordani injectDeposito();

    Singer injectSinger();

}
