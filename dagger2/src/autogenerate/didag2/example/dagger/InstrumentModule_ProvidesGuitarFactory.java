package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.instruments.ElectricGuitar;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InstrumentModule_ProvidesGuitarFactory implements Factory<ElectricGuitar> {
  private final InstrumentModule module;

  public InstrumentModule_ProvidesGuitarFactory(InstrumentModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ElectricGuitar get() {
    return Preconditions.checkNotNull(
        module.providesGuitar(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ElectricGuitar> create(InstrumentModule module) {
    return new InstrumentModule_ProvidesGuitarFactory(module);
  }
}
