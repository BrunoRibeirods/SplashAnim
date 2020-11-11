package com.teste.testesplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.dot_layout.*

class SplashActivity : AppCompatActivity() {
    lateinit var animation: Animation
    lateinit var animation_dot: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        animation = AnimationUtils.loadAnimation(this, R.anim.logo_anim)
        filmly.animation = animation

        animation_dot = AnimationUtils.loadAnimation(this, R.anim.logo_anim)
        lazy_dot.animation = animation_dot

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}