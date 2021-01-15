package com.example.pokemontest

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_evolutions.view.*

class EvolutionsFragment : Fragment() {


    private val list: ArrayList<Evolution> = ArrayList()
    var mAdapter: EvolutionAdapter? = null
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val t = inflater.inflate(R.layout.fragment_evolutions, container, false)
        return t
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAdapter = EvolutionAdapter( requireActivity())
        for (i in 0..10) {
            list.add(Evolution("a",R.drawable.fairy,"b",R.drawable.fight,i.toString()))
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.rv_Evolutions.layoutManager = LinearLayoutManager(activity)
        view.rv_Evolutions.adapter = mAdapter
        mAdapter?.setList(list)
    }
}