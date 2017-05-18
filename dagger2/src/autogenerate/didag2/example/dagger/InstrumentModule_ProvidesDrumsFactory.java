package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.instruments.Drums;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InstrumentModule_ProvidesDrumsFactory implements Factory<Drums> {
  private final InstrumentModule module;

  public InstrumentModule_ProvidesDrumsFactory(InstrumentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Drums get() {
    return Preconditions.checkNotNull(
        module.providesDrums(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Drums> create(InstrumentModule module) {
    return new InstrumentModule_ProvidesDrumsFactory(module);
  }
}
