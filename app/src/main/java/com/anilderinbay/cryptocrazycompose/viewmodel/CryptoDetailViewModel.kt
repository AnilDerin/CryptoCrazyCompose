package com.anilderinbay.cryptocrazycompose.viewmodel

import androidx.lifecycle.ViewModel
import com.anilderinbay.cryptocrazycompose.model.Crypto
import com.anilderinbay.cryptocrazycompose.repository.CryptoRepository
import com.anilderinbay.cryptocrazycompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
): ViewModel() {

    suspend fun getCrypto(id:String) : Resource<Crypto> {
        return repository.getCrypto(id)
    }

}
