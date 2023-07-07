package com.android.depedencyinjectiondagger

import android.util.Log
import javax.inject.Inject

/**
 * Created by Aashis on 07,July,2023
 */
class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String) {
        Log.d("userSave", "User saved in DB")
    }
}