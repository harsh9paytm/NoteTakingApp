package com.example.notestakingapp.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/notestakingapp/ui/viewmodel/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/notestakingapp/data/repository/NoteRepository;", "(Lcom/example/notestakingapp/data/repository/NoteRepository;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/notestakingapp/data/local/entity/NoteEntity;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "addNote", "", "title", "", "content", "deleteNote", "note", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.notestakingapp.data.repository.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.notestakingapp.data.local.entity.NoteEntity>> allNotes = null;
    
    @javax.inject.Inject()
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.notestakingapp.data.local.entity.NoteEntity>> getAllNotes() {
        return null;
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note) {
    }
}