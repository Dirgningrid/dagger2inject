package didag2.example;

import dagger.internal.Factory;
import didag2.example.musicians.Drummer;
import didag2.example.musicians.Guitarist;
import didag2.example.musicians.Singer;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Band_Factory implements Factory<Band> {
  private final Provider<Guitarist> guitaristProvider;

  private final Provider<Singer> singerProvider;

  private final Provider<Drummer> drummerProvider;

  public Band_Factory(
      Provider<Guitarist> guitaristProvider,
      Provider<Singer> singerProvider,
      Provider<Drummer> drummerProvider) {
    assert guitaristProvider != null;
    this.guitaristProvider = guitaristProvider;
    assert singerProvider != null;
    this.singerProvider = singerProvider;
    assert drummerProvider != null;
    this.drummerProvider = drummerProvider;
  }

  @Override
  public Band get() {
    return new Band(guitaristProvider.get(), singerProvider.get(), drummerProvider.get());
  }

  public static Factory<Band> create(
      Provider<Guitarist> guitaristProvider,
      Provider<Singer> singerProvider,
      Provider<Drummer> drummerProvider) {
    return new Band_Factory(guitaristProvider, singerProvider, drummerProvider);
  }
}
