package com.example.notestakingapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0017J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/example/notestakingapp/ui/fragments/AddNoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "PICK_IMAGE_REQUEST", "", "imageFile", "Landroid/net/Uri;", "viewModel", "Lcom/example/notestakingapp/ui/viewmodel/AddNoteViewModel;", "getViewModel", "()Lcom/example/notestakingapp/ui/viewmodel/AddNoteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideLoading", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openGallery", "showError", "message", "", "showLoading", "showSuccess", "app_debug"})
public final class AddNoteFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final int PICK_IMAGE_REQUEST = 1;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri imageFile;
    
    public AddNoteFragment() {
        super();
    }
    
    private final com.example.notestakingapp.ui.viewmodel.AddNoteViewModel getViewModel() {
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
    
    private final void openGallery() {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}