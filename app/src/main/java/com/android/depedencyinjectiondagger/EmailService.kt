package com.android.depedencyinjectiondagger

import android.util.Log
import javax.inject.Inject

/**
 * Created by Aashis on 07,July,2023
 */
class EmailService @Inject constructor() {

    fun send(to: String, body: String) {
        Log.d("userSave", "email send")
    }
}