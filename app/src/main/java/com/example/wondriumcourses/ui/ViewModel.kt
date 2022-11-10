package com.example.wondriumcourses.ui

import android.app.Application
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.load.engine.Resource
import com.example.wondriumcodingchallenge.domain.model.Course
import com.example.wondriumcourses.repository.Repository
import retrofit2.Response

import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import okio.IOException

class ViewModel(
    app: Application,
    val repository: Repository
) : AndroidViewModel(app) {

    val course: MutableLiveData<Resource<Course>> = MutableLiveData()
    var CoursePage = 1
    var CoursesResponse: Course? = null

    private fun handleCourseResponse(response: Response<Course>) {
        if(response.isSuccessful) {
            response.body()?.let { resultResponse ->
                CoursePage++
                if(CoursesResponse == null) {
                    CoursesResponse = resultResponse
                } else {
                    
                }
            }
        }
    }



}












