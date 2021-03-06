package com.mearkiphi.agro.hasura;


import com.mearkiphi.agro.models.AuthRequest;
import com.mearkiphi.agro.models.AuthResponse;
import com.mearkiphi.agro.models.MessageResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by jaison on 23/01/17.
 */

public interface HasuraAuthInterface {

    @POST(Endpoint.LOGIN)
    Call<AuthResponse> login(@Body AuthRequest request);

    @POST(Endpoint.REGISTER)
    Call<AuthResponse> register(@Body AuthRequest request);

    @GET(Endpoint.LOGOUT)
    Call<MessageResponse> logout();

}
