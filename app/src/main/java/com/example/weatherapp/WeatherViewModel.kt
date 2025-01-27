package com.example.weatherapp

import android.util.Log
import androidx.lifecycle.ViewModel

class WeatherViewModel :ViewModel() {

    fun getData(city:String){

           // logcat check
           Log.i("City name : ", city)
    }
}