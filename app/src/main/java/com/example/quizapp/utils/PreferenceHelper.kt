package com.example.quizapp.utils

import android.content.Context
import com.example.quizapp.utils.APP_SHARED_PREFERENCE
import com.example.quizapp.utils.FIRST_RUN
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferenceHelper @Inject constructor(@ApplicationContext context : Context) {

    private val sharedPreferences = context.getSharedPreferences(APP_SHARED_PREFERENCE, Context.MODE_PRIVATE)

    var isFirstRun: Boolean
    get() = sharedPreferences.getBoolean(FIRST_RUN, true)
    set(value) = sharedPreferences.edit().putBoolean(FIRST_RUN, value).apply()


    var isLoggedIn : Boolean
    get() = sharedPreferences.getBoolean(IS_LOGGED_IN, false)
    set(value) = sharedPreferences.edit().putBoolean(IS_LOGGED_IN, value).apply()



}