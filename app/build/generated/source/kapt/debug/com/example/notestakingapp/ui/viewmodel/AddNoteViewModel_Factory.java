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
public final class AddNoteViewModel_Factory implements Factory<AddNoteViewModel> {
  private final Provider<NoteRepository> repositoryProvider;

  public AddNoteViewModel_Factory(Provider<NoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddNoteViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddNoteViewModel_Factory create(Provider<NoteRepository> repositoryProvider) {
    return new AddNoteViewModel_Factory(repositoryProvider);
  }

  public static AddNoteViewModel newInstance(NoteRepository repository) {
    return new AddNoteViewModel(repository);
  }
}
