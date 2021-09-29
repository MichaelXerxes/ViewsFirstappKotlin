package com.example.optionmenu

import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.core.view.isVisible
import com.example.optionmenu.databinding.ActivityMainBinding

class ActionListener : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation = AnimationUtils.loadAnimation(this, R.anim.circle_explosion_anime).apply {
            duration = 700
            interpolator = AccelerateDecelerateInterpolator()
        }



        binding.fab.setOnClickListener {
            binding.fab.isVisible = false
            binding.Viewcircle.isVisible = true
            binding.Viewcircle.startAnimation(animation) {
                // display your fragment
                binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
                binding.Viewcircle.isVisible = false
                binding.button1.isVisible = true
                binding.calendar1.datePicker.isVisible = true
            }


        }
    }
}