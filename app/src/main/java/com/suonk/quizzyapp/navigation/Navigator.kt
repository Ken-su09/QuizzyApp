package com.suonk.quizzyapp.navigation

import androidx.fragment.app.FragmentActivity
import com.suonk.quizzyapp.R
import com.suonk.quizzyapp.ui.fragments.SplashScreenFragment
import javax.inject.Inject

class Navigator @Inject constructor(var activity: FragmentActivity?) {

    fun showSplashScreen() {
        activity!!.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, SplashScreenFragment())
            .commit()
    }
}