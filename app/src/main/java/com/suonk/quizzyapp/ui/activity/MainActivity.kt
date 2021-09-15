package com.suonk.quizzyapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.suonk.quizzyapp.databinding.ActivityMainBinding
import com.suonk.quizzyapp.navigation.Navigator
import com.suonk.quizzyapp.navigation.QuizzyAppFlowCoordinator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: Navigator
    private lateinit var coordinator: QuizzyAppFlowCoordinator
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigator.activity = this
        coordinator = QuizzyAppFlowCoordinator(navigator)
        launchSplashScreenFragment()
    }

    private fun launchSplashScreenFragment(){
        coordinator.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        navigator.activity = null
    }
}