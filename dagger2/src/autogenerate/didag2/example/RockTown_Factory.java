package didag2.example;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RockTown_Factory implements Factory<RockTown> {
  private final Provider<Band> bandProvider;

  public RockTown_Factory(Provider<Band> bandProvider) {
    assert bandProvider != null;
    this.bandProvider = bandProvider;
  }

  @Override
  public RockTown get() {
    return new RockTown(bandProvider.get());
  }

  public static Factory<RockTown> create(Provider<Band> bandProvider) {
    return new RockTown_Factory(bandProvider);
  }
}
