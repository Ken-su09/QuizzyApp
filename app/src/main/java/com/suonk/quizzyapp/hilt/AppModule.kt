package com.suonk.quizzyapp.hilt

import com.suonk.quizzyapp.api.QuizzyAppApiService
import com.suonk.quizzyapp.api.QuizzyAppApiService.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideQuizzyAppApiService(retrofit: Retrofit): QuizzyAppApiService =
        retrofit.create(QuizzyAppApiService::class.java)
}