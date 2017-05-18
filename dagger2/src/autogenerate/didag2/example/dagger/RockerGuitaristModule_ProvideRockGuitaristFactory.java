package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.musicians.RockerGuitarist;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RockerGuitaristModule_ProvideRockGuitaristFactory
    implements Factory<RockerGuitarist> {
  private final RockerGuitaristModule module;

  public RockerGuitaristModule_ProvideRockGuitaristFactory(RockerGuitaristModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RockerGuitarist get() {
    return Preconditions.checkNotNull(
        module.provideRockGuitarist(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RockerGuitarist> create(RockerGuitaristModule module) {
    return new RockerGuitaristModule_ProvideRockGuitaristFactory(module);
  }

  /** Proxies {@link RockerGuitaristModule#provideRockGuitarist()}. */
  public static RockerGuitarist proxyProvideRockGuitarist(RockerGuitaristModule instance) {
    return instance.provideRockGuitarist();
  }
}
