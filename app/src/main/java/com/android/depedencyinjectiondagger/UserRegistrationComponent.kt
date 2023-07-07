package com.android.depedencyinjectiondagger

import dagger.Component

/**
 * Created by Aashis on 07,July,2023
 */
@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
}