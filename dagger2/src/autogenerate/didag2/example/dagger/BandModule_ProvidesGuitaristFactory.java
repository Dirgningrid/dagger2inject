package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.instruments.ElectricGuitar;
import didag2.example.musicians.Guitarist;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BandModule_ProvidesGuitaristFactory implements Factory<Guitarist> {
  private final BandModule module;

  private final Provider<ElectricGuitar> guitarProvider;

  public BandModule_ProvidesGuitaristFactory(
      BandModule module, Provider<ElectricGuitar> guitarProvider) {
    assert module != null;
    this.module = module;
    assert guitarProvider != null;
    this.guitarProvider = guitarProvider;
  }

  @Override
  public Guitarist get() {
    return Preconditions.checkNotNull(
        module.providesGuitarist(guitarProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Guitarist> create(
      BandModule module, Provider<ElectricGuitar> guitarProvider) {
    return new BandModule_ProvidesGuitaristFactory(module, guitarProvider);
  }
}
