package com.example.pokemontest

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_evolutions.view.*
import kotlinx.android.synthetic.main.fragment_moves.view.*

class MovesFragment : Fragment() {


    private val list: ArrayList<Move> = ArrayList()
    var mAdapter: MoveAdapter? = null
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val t = inflater.inflate(R.layout.fragment_moves, container, false)
        return t
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAdapter = MoveAdapter( requireActivity())
        for (i in 0..10) {
            list.add(Move("a",R.drawable.fairy,"Level $i"))
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.rv_Moves.layoutManager = LinearLayoutManager(activity)
        view.rv_Moves.adapter = mAdapter
        mAdapter?.setList(list)
    }
}