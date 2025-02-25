package com.example.notestakingapp.ui.viewmodel;

import com.example.notestakingapp.data.repository.NoteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class NoteListViewModel_Factory implements Factory<NoteListViewModel> {
  private final Provider<NoteRepository> repositoryProvider;

  public NoteListViewModel_Factory(Provider<NoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public NoteListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static NoteListViewModel_Factory create(Provider<NoteRepository> repositoryProvider) {
    return new NoteListViewModel_Factory(repositoryProvider);
  }

  public static NoteListViewModel newInstance(NoteRepository repository) {
    return new NoteListViewModel(repository);
  }
}
