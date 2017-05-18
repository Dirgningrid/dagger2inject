package didag2.example.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import didag2.example.musicians.ClassicalGuitarist;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClassicalModule_ProvidesFactory implements Factory<ClassicalGuitarist> {
  private final ClassicalModule module;

  public ClassicalModule_ProvidesFactory(ClassicalModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ClassicalGuitarist get() {
    return Preconditions.checkNotNull(
        module.provides(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ClassicalGuitarist> create(ClassicalModule module) {
    return new ClassicalModule_ProvidesFactory(module);
  }

  /** Proxies {@link ClassicalModule#provides()}. */
  public static ClassicalGuitarist proxyProvides(ClassicalModule instance) {
    return instance.provides();
  }
}
