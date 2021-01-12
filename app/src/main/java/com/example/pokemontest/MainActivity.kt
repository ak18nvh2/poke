package com.example.pokemontest

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun init() {
        Picasso.with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png")
            .into(img_avatar)

        tv_ATK.setTextColor(ContextCompat.getColor(this,R.color.blue))
        tv_DEF.setTextColor(ContextCompat.getColor(this,R.color.blue))
        tv_HP.setTextColor(ContextCompat.getColor(this,R.color.blue))
        tv_SATK.setTextColor(ContextCompat.getColor(this,R.color.blue))
        tv_SDEF.setTextColor(ContextCompat.getColor(this,R.color.blue))
        tv_SPD.setTextColor(ContextCompat.getColor(this,R.color.blue))

        pb_HP.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
        pb_ATK.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
        pb_DEF.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
        pb_SATK.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
        pb_SDEF.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
        pb_spd.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,R.color.blue))
    }
}