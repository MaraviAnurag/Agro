package com.mearkiphi.agro.hasura;


import com.mearkiphi.agro.models.DeleteTodoQuery;
import com.mearkiphi.agro.models.InsertTodoQuery;
import com.mearkiphi.agro.models.SelectTodoQuery;
import com.mearkiphi.agro.models.TodoRecord;
import com.mearkiphi.agro.models.TodoReturningResponse;
import com.mearkiphi.agro.models.UpdateTodoQuery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by jaison on 23/01/17.
 */

public interface HasuraDBInterface {

    @POST(Endpoint.QUERY)
    Call<List<TodoRecord>> getTodos(@Body SelectTodoQuery query);

    @POST(Endpoint.QUERY)
    Call<TodoReturningResponse> addATodo(@Body InsertTodoQuery query);

    @POST(Endpoint.QUERY)
    Call<TodoReturningResponse> deleteATodo(@Body DeleteTodoQuery query);

    @POST(Endpoint.QUERY)
    Call<TodoReturningResponse> updateATodo(@Body UpdateTodoQuery query);

}
