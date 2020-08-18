package com.kevin.motivator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress)
            when(rand){
                0 -> resultsTextView.text = "T'es beau !"
                1 -> resultsTextView.text = "Tu déchires !"
                2 -> resultsTextView.text = "Courage !"
                3 -> resultsTextView.text = "Just Do It"
                4 -> resultsTextView.text = "Never give up"
                5 -> resultsTextView.text = "Do or do not, there is no try"
                6 -> resultsTextView.text = "Il y a des gens qui pensent à toi"
                7 -> resultsTextView.text = "Une erreur est de ne pas avoir essayé"
                8 -> resultsTextView.text = "Echouer n'est qu'un chemin vers la réussite"
                9 -> resultsTextView.text = "Que la force soit avec toi"
                10 -> resultsTextView.text = "Créer ton avenir"
            }

        }

    }
}