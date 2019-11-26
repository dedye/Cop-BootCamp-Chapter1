package com.dokuwallet.mobilebootcamp;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ListApiInterface {

    @FormUrlEncoded
    @POST("/DWMobileAPI/COPAPI.php")
    Call<JsonElement> Login(@Field("requestType") String requestType, @Field("username") String username, @Query("password") String password);

    @FormUrlEncoded
    @POST("/DWMobileAPI/COPAPI.php")
    Call<JsonElement> ListData(@Field("requestType") String requestType);

}