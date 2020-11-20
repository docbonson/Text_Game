package com.bonsondave.android.textgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameScreen : AppCompatActivity() {

    lateinit var tvStory:TextView
    lateinit var choice1:Button
    lateinit var choice2:Button
    lateinit var choice3:Button
    lateinit var choice4:Button
    lateinit var storyImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)

        tvStory = findViewById(R.id.tv_story)
        choice1 = findViewById(R.id.btn_choice_1)
        choice2 = findViewById(R.id.btn_choice_2)
        choice3 = findViewById(R.id.btn_choice_3)
        choice4 = findViewById(R.id.btn_choice_4)
        storyImage = findViewById(R.id.img_story)

        val story = Story(this)

        choice1.setOnClickListener{
            story.selectPosition(story.nextPosition1)
        }
        choice2.setOnClickListener{
            story.selectPosition(story.nextPosition2)
        }
        choice3.setOnClickListener{
            story.selectPosition(story.nextPosition3)
        }
        choice4.setOnClickListener{
            story.selectPosition(story.nextPosition4)
        }

        story.startingPoint()
    }
}