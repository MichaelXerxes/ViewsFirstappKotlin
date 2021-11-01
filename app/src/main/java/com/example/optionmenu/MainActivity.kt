package com.example.optionmenu


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.example.optionmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var todoAdapter: TodoAdapter
    private lateinit var buttonBackCl:Button
    private lateinit var buttonBackToDo:Button

    private lateinit var setButtonClock:ExternalOnClickListener
    private lateinit var setButtonToDo:ExternalOnClickListener



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation=AnimationUtils.loadAnimation(this,R.anim.circle_explosion_anime).apply {
            duration=700
            interpolator=AccelerateDecelerateInterpolator()
        }
        val animation2=AnimationUtils.loadAnimation(this,R.anim.circle_explosion_anime).apply {
            duration=1100
            interpolator=AccelerateDecelerateInterpolator()
        }
        println("Insde Nested class")
        var linearLayout:LinearLayout=findViewById(R.id.Layout1One)
        val view1:View=layoutInflater.inflate(R.layout.todolist,null)
        val view2timePicker:View=layoutInflater.inflate(R.layout.timepicker,null)
       // val viewMain:View=layoutInflater.inflate(R.layout.activity_main,null)

        buttonBackCl=view2timePicker.findViewById(R.id.buttonClockBack)
        buttonBackToDo=view1.findViewById(R.id.buttonToDoBack)

        setButtonClock=ExternalOnClickListener(buttonBackCl)
        setButtonToDo=ExternalOnClickListener(buttonBackToDo)

        todoAdapter= TodoAdapter(mutableListOf())



        binding.fab.setOnClickListener{
            //binding.fab.isVisible=false
            binding.calendar1.datePicker.isVisible=false
            binding.Viewcircle.isVisible=true
            binding.Viewcircle.startAnimation(animation){
                // display your fragment
                binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
                binding.Viewcircle.isVisible=false
                binding.button1.isVisible=true
                setContentView(view1)//Eureka!!
                //binding.calendar1.datePicker.isVisible=true
            }




        }
        binding.buttonrectangle.setOnClickListener {
            binding.Viewrectangle.isVisible=true
            binding.Viewrectangle.startAnimation(animation2){
                binding.root.setBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_orange_dark))
                binding.Viewrectangle.isVisible=false
                binding.calendar1.datePicker.isVisible=true



            }

        }

        binding.floatingActionButton.setOnClickListener {
            binding.calendar1.datePicker.isVisible=false
            binding.Viewbutton3.isVisible=true
            binding.Viewbutton3.startAnimation(animation2){
                binding.root.setBackgroundColor(ContextCompat.getColor(this,
                    android.R.color.holo_green_dark
                ))
                binding.Viewbutton3.isVisible=false
                setContentView(view2timePicker)





            }
        }
       // setButtonClock.adActionBack(buttonBackCl)
       // setButtonToDo.adActionBack(buttonBackToDo)
        buttonBackCl.setOnClickListener {
            binding.calendar1.datePicker.isVisible=false
            setContentView(binding.root)
        }
        buttonBackToDo.setOnClickListener {
            binding.calendar1.datePicker.isVisible=false
           setContentView(binding.root)
        }




    }
    fun setBindings(binding: ActivityMainBinding){

    }
}