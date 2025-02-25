package com.example.notestakingapp.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/notestakingapp/data/repository/NoteRepositoryImpl;", "Lcom/example/notestakingapp/data/repository/NoteRepository;", "noteDao", "Lcom/example/notestakingapp/data/local/dao/NoteDao;", "noteApi", "Lcom/example/notestakingapp/data/remote/api/NoteApi;", "(Lcom/example/notestakingapp/data/local/dao/NoteDao;Lcom/example/notestakingapp/data/remote/api/NoteApi;)V", "deleteNote", "", "note", "Lcom/example/notestakingapp/data/local/entity/NoteEntity;", "(Lcom/example/notestakingapp/data/local/entity/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNoteById", "noteId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNote", "saveImageUrl", "imageUrl", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNote", "uploadImage", "Lretrofit2/Response;", "Lcom/example/notestakingapp/data/remote/model/UploadResponse;", "image", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NoteRepositoryImpl implements com.example.notestakingapp.data.repository.NoteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.notestakingapp.data.local.dao.NoteDao noteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.notestakingapp.data.remote.api.NoteApi noteApi = null;
    
    @javax.inject.Inject()
    public NoteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.dao.NoteDao noteDao, @org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.remote.api.NoteApi noteApi) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveImageUrl(int noteId, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.notestakingapp.data.remote.model.UploadResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.notestakingapp.data.local.entity.NoteEntity>> getAllNotes() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object syncNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getNoteById(int noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.notestakingapp.data.local.entity.NoteEntity> $completion) {
        return null;
    }
}