package com.example.notestakingapp.data.remote.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/notestakingapp/data/remote/api/NoteApi;", "", "createNote", "Lretrofit2/Response;", "Lcom/example/notestakingapp/data/local/entity/NoteEntity;", "note", "(Lcom/example/notestakingapp/data/local/entity/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNote", "(ILcom/example/notestakingapp/data/local/entity/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/example/notestakingapp/data/remote/model/UploadResponse;", "image", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NoteApi {
    
    @retrofit2.http.GET(value = "/notes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.example.notestakingapp.data.local.entity.NoteEntity>>> $completion);
    
    @retrofit2.http.POST(value = "/notes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createNote(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.notestakingapp.data.local.entity.NoteEntity>> $completion);
    
    @retrofit2.http.PUT(value = "/notes/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateNote(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.notestakingapp.data.local.entity.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.notestakingapp.data.local.entity.NoteEntity>> $completion);
    
    @retrofit2.http.DELETE(value = "/notes/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNote(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.Multipart()
    @retrofit2.http.POST(value = "/upload")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@retrofit2.http.Part()
    @org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.notestakingapp.data.remote.model.UploadResponse>> $completion);
}