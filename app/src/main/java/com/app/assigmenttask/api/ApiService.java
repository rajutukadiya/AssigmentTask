package com.app.assigmenttask.api;

import com.app.assigmenttask.data.request.ReqRestaurants;
import com.app.assigmenttask.data.response.ResponseRestaurant;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("summerize_api/api/v1/users/restaurants")
    Response<ResponseRestaurant> getAllRestaurants(@Body ReqRestaurants reqRestaurants);

//    @POST("api/floorView/getFloorData.json")
//    suspend fun getSeatedData(@Body reqSeated: ReqSeated): Response<ResponseSeated>
//
//    @POST("api/floorView/getFloorsTableDetails.json")
//    suspend fun getTableViewData(@Body reqTableView: ReqTableView): Response<ResponseTableView>
}
