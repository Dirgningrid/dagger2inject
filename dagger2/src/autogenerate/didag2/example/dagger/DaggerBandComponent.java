package didag2.example.dagger;

import dagger.internal.Preconditions;
import didag2.example.Band;
import didag2.example.Band_Factory;
import didag2.example.RockTown;
import didag2.example.RockTown_Factory;
import didag2.example.instruments.Drums;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.Drummer;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBandComponent implements BandComponent {
  private Provider<ElectricGuitar> providesGuitarProvider;

  private Provider<Guitarist> providesGuitaristProvider;

  private Provider<Singer> providesSingerProvider;

  private Provider<Drums> providesDrumsProvider;

  private Provider<Drummer> providesDrummerProvider;

  private Provider<Band> bandProvider;

  private Provider<RockTown> rockTownProvider;

  private DaggerBandComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static BandComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.providesGuitarProvider =
        InstrumentModule_ProvidesGuitarFactory.create(builder.instrumentModule);

    this.providesGuitaristProvider =
        BandModule_ProvidesGuitaristFactory.create(builder.bandModule, providesGuitarProvider);

    this.providesSingerProvider = BandModule_ProvidesSingerFactory.create(builder.bandModule);

    this.providesDrumsProvider =
        InstrumentModule_ProvidesDrumsFactory.create(builder.instrumentModule);

    this.providesDrummerProvider =
        BandModule_ProvidesDrummerFactory.create(builder.bandModule, providesDrumsProvider);

    this.bandProvider =
        Band_Factory.create(
            providesGuitaristProvider, providesSingerProvider, providesDrummerProvider);

    this.rockTownProvider = RockTown_Factory.create(bandProvider);
  }

  @Override
  public Band injectBand() {
    return new Band(
        providesGuitaristProvider.get(),
        providesSingerProvider.get(),
        providesDrummerProvider.get());
  }

  @Override
  public RockTown injectRockTown() {
    return new RockTown(
        new Band(
            providesGuitaristProvider.get(),
            providesSingerProvider.get(),
            providesDrummerProvider.get()));
  }

  public static final class Builder {
    private InstrumentModule instrumentModule;

    private BandModule bandModule;

    private Builder() {}

    public BandComponent build() {
      if (instrumentModule == null) {
        this.instrumentModule = new InstrumentModule();
      }
      if (bandModule == null) {
        this.bandModule = new BandModule();
      }
      return new DaggerBandComponent(this);
    }

    public Builder bandModule(BandModule bandModule) {
      this.bandModule = Preconditions.checkNotNull(bandModule);
      return this;
    }

    public Builder instrumentModule(InstrumentModule instrumentModule) {
      this.instrumentModule = Preconditions.checkNotNull(instrumentModule);
      return this;
    }
  }
}
