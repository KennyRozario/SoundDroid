package com.example.kenny.sounddroid.com.example.kenny.sounddroid.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Kenny on 15-05-19.
 */
public interface SoundCloudService {

    static final String CLIENT_ID = "a692b2dd229ff5a5d62051ddaa3287fd";

    @GET("/tracks?client_id=" + CLIENT_ID)
    public void searchSongs(@Query("q") String query, Callback<List<Track>> cb);

    @GET("/tracks?client_id=" + CLIENT_ID)
    public void getRecentSongs(@Query("created_at[from]") String date, Callback<List<Track>> cb);
}
