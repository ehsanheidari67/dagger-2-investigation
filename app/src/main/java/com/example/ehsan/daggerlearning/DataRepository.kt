package com.example.ehsan.daggerlearning

import android.util.Log
import javax.inject.Inject

class DataRepository @Inject constructor() : IDataRepository {

    init {
        Log.i(LOG_TAG, "DataRepository created!!!")
    }
}