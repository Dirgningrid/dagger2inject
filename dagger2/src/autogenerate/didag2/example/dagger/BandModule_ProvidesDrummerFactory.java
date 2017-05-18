package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.instruments.Drums;
import didag2.example.musicians.Drummer;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BandModule_ProvidesDrummerFactory implements Factory<Drummer> {
  private final BandModule module;

  private final Provider<Drums> drumsProvider;

  public BandModule_ProvidesDrummerFactory(BandModule module, Provider<Drums> drumsProvider) {
    assert module != null;
    this.module = module;
    assert drumsProvider != null;
    this.drumsProvider = drumsProvider;
  }

  @Override
  public Drummer get() {
    return Preconditions.checkNotNull(
        module.providesDrummer(drumsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Drummer> create(BandModule module, Provider<Drums> drumsProvider) {
    return new BandModule_ProvidesDrummerFactory(module, drumsProvider);
  }
}
