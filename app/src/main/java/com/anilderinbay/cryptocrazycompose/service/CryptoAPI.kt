package com.anilderinbay.cryptocrazycompose.service

import com.anilderinbay.cryptocrazycompose.model.Crypto
import com.anilderinbay.cryptocrazycompose.model.CryptoList
import com.anilderinbay.cryptocrazycompose.model.CryptoListItem
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.jar.Attributes

interface CryptoAPI {


    //63728f330f582c0ebef63b8ffd3ce38bb8c71719

    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) : CryptoList

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes: String
     ) : Crypto
}