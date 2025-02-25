package com.example.notestakingapp.data.repository;

import com.example.notestakingapp.data.local.dao.NoteDao;
import com.example.notestakingapp.data.remote.api.NoteApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NoteRepositoryImpl_Factory implements Factory<NoteRepositoryImpl> {
  private final Provider<NoteDao> noteDaoProvider;

  private final Provider<NoteApi> noteApiProvider;

  public NoteRepositoryImpl_Factory(Provider<NoteDao> noteDaoProvider,
      Provider<NoteApi> noteApiProvider) {
    this.noteDaoProvider = noteDaoProvider;
    this.noteApiProvider = noteApiProvider;
  }

  @Override
  public NoteRepositoryImpl get() {
    return newInstance(noteDaoProvider.get(), noteApiProvider.get());
  }

  public static NoteRepositoryImpl_Factory create(Provider<NoteDao> noteDaoProvider,
      Provider<NoteApi> noteApiProvider) {
    return new NoteRepositoryImpl_Factory(noteDaoProvider, noteApiProvider);
  }

  public static NoteRepositoryImpl newInstance(NoteDao noteDao, NoteApi noteApi) {
    return new NoteRepositoryImpl(noteDao, noteApi);
  }
}
