package com.example.pokemontest

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private val listFragment = arrayListOf(StatsFragment(), EvolutionsFragment(), MovesFragment())
    private val fragmentManager: FragmentManager = supportFragmentManager
    private val fragmentTransaction = fragmentManager.beginTransaction()
    private var count = 0

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        listFragment.forEachIndexed { _, fragment ->
            fragmentTransaction.add(R.id.fm_content, fragment)
            fragmentTransaction.hide(fragment)
        }
        fragmentTransaction.show(listFragment[0])
        fragmentTransaction.commit()
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun init() {
        tv_nameOfPokemon.visibility = View.INVISIBLE
        btn_HideOrShowDetail.setOnClickListener(this)
        cv_Moves.setOnClickListener(this)
        cv_Evolutions.setOnClickListener(this)
        cv_Stats.setOnClickListener(this)
        Picasso.with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10036.png")
            .into(img_avatar)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_HideOrShowDetail -> {
                count++
                if (count % 2 == 1) {
                    img_avatar.visibility = View.GONE
                    img_tag.visibility = View.GONE
                    tv_Name.visibility = View.GONE
                    tv_description.visibility = View.GONE
                    tv_topOfInformation.visibility = View.GONE
                    tv_nameOfPokemon.visibility = View.VISIBLE
                } else {
                    img_avatar.visibility = View.VISIBLE
                    img_tag.visibility = View.VISIBLE
                    tv_Name.visibility = View.VISIBLE
                    tv_description.visibility = View.VISIBLE
                    tv_topOfInformation.visibility = View.VISIBLE
                    tv_nameOfPokemon.visibility = View.GONE
                }

            }
            R.id.cv_Stats -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                listFragment.forEachIndexed { _, fragment ->
                    fragmentTransaction.hide(fragment)
                }
                fragmentTransaction.show(listFragment[0])
                fragmentTransaction.commit()
                cv_Stats.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.dark_sky_blue
                        )
                    )
                )
                tv_Stats.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                )
                cv_Evolutions.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_evolutions.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
                cv_Moves.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_moves.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
            }
            R.id.cv_Evolutions -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                listFragment.forEachIndexed { _, fragment ->
                    fragmentTransaction.hide(fragment)
                }
                fragmentTransaction.show(listFragment[1])
                fragmentTransaction.commit()
                cv_Evolutions.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.dark_sky_blue
                        )
                    )
                )
                tv_evolutions.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                )
                cv_Stats.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_Stats.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
                cv_Moves.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_moves.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
            }
            R.id.cv_Moves -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                listFragment.forEachIndexed { _, fragment ->
                    fragmentTransaction.hide(fragment)
                }
                fragmentTransaction.show(listFragment[2])
                fragmentTransaction.commit()
                cv_Moves.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.dark_sky_blue
                        )
                    )
                )
                tv_moves.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.white
                        )
                    )
                )
                cv_Evolutions.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_evolutions.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
                cv_Stats.setCardBackgroundColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.bg_tab_bar
                        )
                    )
                )
                tv_Stats.setTextColor(
                    ColorStateList.valueOf(
                        ContextCompat.getColor(
                            this,
                            R.color.blue
                        )
                    )
                )
            }
        }
    }
}