package com.android.depedencyinjectiondagger

import javax.inject.Inject

/**
 * Created by Aashis on 07,July,2023
 */
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send("", "")
    }

}