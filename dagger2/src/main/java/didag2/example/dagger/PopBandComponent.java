package didag2.example.dagger;

import dagger.Component;
import didag2.example.Band;
import didag2.example.DepositoGiordani;

/**
 * Created by ingrid on 19/05/17.
 */
@Component(modules = {PopBandModule.class, PopInstrumentModule.class})
public interface PopBandComponent {

    Band injectPopBand();

    DepositoGiordani injectDeposito();
}
