package didag2.example.dagger;

import dagger.Component;
import didag2.example.Band;

/**
 * Created by ingrid on 16/05/17.
 */

@Component(modules = {BandMockModule.class, InstrumentMock.class})
public interface BandComponentTest {

    Band injectBand();

}
