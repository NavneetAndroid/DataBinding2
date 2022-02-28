package com.example.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.BR
import com.example.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

       val user=User("Navneet Singh",246,+919945625863)
        binding.setVariable(BR.user, user)
        binding.executePendingBindings()
    }
}