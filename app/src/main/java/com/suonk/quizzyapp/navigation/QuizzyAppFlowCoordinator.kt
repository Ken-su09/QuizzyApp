package com.suonk.quizzyapp.navigation

class QuizzyAppFlowCoordinator(private val navigator: Navigator) {

    fun start(){
        navigator.showSplashScreen()
    }
}