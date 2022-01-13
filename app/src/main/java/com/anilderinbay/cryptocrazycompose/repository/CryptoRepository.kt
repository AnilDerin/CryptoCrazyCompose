package com.anilderinbay.cryptocrazycompose.repository

import com.anilderinbay.cryptocrazycompose.model.Crypto
import com.anilderinbay.cryptocrazycompose.model.CryptoList
import com.anilderinbay.cryptocrazycompose.service.CryptoAPI
import com.anilderinbay.cryptocrazycompose.util.Constants.API_KEY
import com.anilderinbay.cryptocrazycompose.util.Constants.CALL_ATTRIBUTES
import com.anilderinbay.cryptocrazycompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Scope

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
) {
    suspend fun getCryptoList() : Resource<CryptoList> {
        val response = try {
            api.getCryptoList(API_KEY)
        } catch (e: Exception) {
        return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto(API_KEY,id, CALL_ATTRIBUTES)
        }
         catch (e: Exception) {
             return Resource.Error("Error.")
         }
        return Resource.Success(response)
    }


}