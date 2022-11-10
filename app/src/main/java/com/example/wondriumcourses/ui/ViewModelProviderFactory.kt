package com.example.wondriumcourses.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.wondriumcourses.repository.Repository

class ViewModelProviderFactory(
    val app: Application,
    val repository: Repository
) : ViewModelProvider.Factory {

    override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
        return ViewModel(app, repository) as T
    }
}