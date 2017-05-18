package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.musicians.Singer;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BandModule_ProvidesSingerFactory implements Factory<Singer> {
  private final BandModule module;

  public BandModule_ProvidesSingerFactory(BandModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Singer get() {
    return Preconditions.checkNotNull(
        module.providesSinger(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Singer> create(BandModule module) {
    return new BandModule_ProvidesSingerFactory(module);
  }
}
