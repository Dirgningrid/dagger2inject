package didag2.example.dagger;

import dagger.Component;
import didag2.example.Band;

/**
 * Created by ingrid on 16/05/17.
 */

@Component(modules = {BandMock.class, InstrumentMock.class})
public interface BandComponentTest extends BandComponent {

    public Band injectMockBand();

}
