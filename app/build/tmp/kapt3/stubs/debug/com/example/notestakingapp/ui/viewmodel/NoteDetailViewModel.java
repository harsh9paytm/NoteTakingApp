package com.example.notestakingapp.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/notestakingapp/ui/viewmodel/NoteDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/notestakingapp/data/repository/NoteRepository;", "(Lcom/example/notestakingapp/data/repository/NoteRepository;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "_note", "Lcom/example/notestakingapp/data/local/entity/NoteEntity;", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "note", "getNote", "deleteNote", "", "noteId", "", "loadNote", "updateNote", "updatedNote", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NoteDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.notestakingapp.data.repository.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.notestakingapp.data.local.entity.NoteEntity> _note = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    
    @javax.inject.Inject()
    public NoteDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.notestakingapp.data.local.entity.NoteEntity> getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void loadNote(int noteId) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity updatedNote) {
    }
    
    public final void deleteNote(int noteId) {
    }
}