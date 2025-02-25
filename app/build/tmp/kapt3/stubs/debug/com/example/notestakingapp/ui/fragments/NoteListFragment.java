package com.example.notestakingapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/notestakingapp/ui/fragments/NoteListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/notestakingapp/ui/adapters/NoteAdapter;", "viewModel", "Lcom/example/notestakingapp/ui/viewmodel/NoteListViewModel;", "getViewModel", "()Lcom/example/notestakingapp/ui/viewmodel/NoteListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideLoading", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showError", "message", "", "showLoading", "showSuccess", "app_debug"})
public final class NoteListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.notestakingapp.ui.adapters.NoteAdapter adapter;
    
    public NoteListFragment() {
        super();
    }
    
    private final com.example.notestakingapp.ui.viewmodel.NoteListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    private final void showSuccess(java.lang.String message) {
    }
}