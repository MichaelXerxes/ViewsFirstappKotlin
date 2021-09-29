package com.example.optionmenu
import android.view.animation.Animation
import android.view.View

fun View.startAnimation(animation: Animation, onEnd: () -> Unit) {
    animation.setAnimationListener(object :Animation.AnimationListener{
        override fun onAnimationStart(animation: Animation?) = Unit

        override fun onAnimationEnd(animation: Animation?) {
            onEnd()
        }

        override fun onAnimationRepeat(animation: Animation?) =Unit

    })
    this.startAnimation(animation)
}