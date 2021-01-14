package com.example.pokemontest

import android.content.Context
import android.content.res.ColorStateList
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_stats.*

class StatsFragment: Fragment() {


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val t = inflater.inflate(R.layout.fragment_stats, container, false)
        val percentMale = (0..100).random()
        val percentFemale = 100 - percentMale
        val pbGender = t.findViewById<ProgressBar>(R.id.pb_Gender)
        val tvPercentMale = t.findViewById<TextView>(R.id.tv_percentMale)
        val tvPercentFemale = t.findViewById<TextView>(R.id.tv_percentFemale)
        tvPercentFemale.text = "$percentFemale%"
        tvPercentMale.text = "$percentMale%"
        pbGender.progress = percentMale

        val percentRate = (0..100).random()
        val pbRate = t.findViewById<ProgressBar>(R.id.pb_CaptureRate)
        val tvRate = t.findViewById<TextView>(R.id.tv_percentCaptureRate)
        tvRate.text = "$percentRate%"
        pbRate.progress = percentRate
        return t
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}