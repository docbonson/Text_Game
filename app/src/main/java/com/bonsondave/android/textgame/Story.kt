package com.bonsondave.android.textgame

class Story(val gameScreen: GameScreen) {

    var nextPosition1:String = ""
    var nextPosition2:String = ""
    var nextPosition3:String = ""
    var nextPosition4:String = ""


    fun selectPosition(position: String){
        when(position) {
            "starting point" -> startingPoint()
            "hands" -> petCat()
            "dangle" -> dangleString()
            "bird" -> bird()
            "dead" -> gameOver()
        }
    }

    //first part of the story.
    fun startingPoint(){
        //story image
        gameScreen.storyImage.setImageResource(R.drawable.skizz)

        //story
        gameScreen.tvStory.text = "You see a Siamese cat.\n\nWhat do you do?"

        //options
        gameScreen.choice1.text = "Pet the cat."
        gameScreen.choice2.text = "Pick up the cat."
        gameScreen.choice3.text = "Run away screaming."
        gameScreen.choice4.text = "Dangle a string."

        //next position
        nextPosition1 = "hands"
        nextPosition2 = "hypno"
        nextPosition3 = "game over"
        nextPosition4 = "dangle"
    }

    fun petCat(){
        //story image
        gameScreen.storyImage.setImageResource(R.drawable.hands)

        //story
        gameScreen.tvStory.text = "You pet the cat. It starts to meow loudly."

        //options
        gameScreen.choice1.text = "Stop Petting"
        gameScreen.choice2.text = "Pick up the cat."
        gameScreen.choice3.text = "Run away screaming."
        gameScreen.choice4.text = "Dangle a string."

        //next position
        nextPosition1 = "starting point"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = "dangle"
    }

    fun dangleString(){
        //story image
        gameScreen.storyImage.setImageResource(R.drawable.cat_play)

        //story
        gameScreen.tvStory.text = "The cat tries to murder your string."

        //options
        gameScreen.choice1.text = "Put string away."
        gameScreen.choice2.text = "Destroy the string."
        gameScreen.choice3.text = ""
        gameScreen.choice4.text = ""

        //next position
        nextPosition1 = "starting point"
        nextPosition2 = "bird"
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun bird(){
        //story image
        gameScreen.storyImage.setImageResource(R.drawable.shadow_bird)

        //story
        gameScreen.tvStory.text = "The cat was angered by your action and called for vengeance."

        //options
        gameScreen.choice1.text = "Die with dignity"
        gameScreen.choice2.text = ""
        gameScreen.choice3.text = ""
        gameScreen.choice4.text = ""

        //next position
        nextPosition1 = "dead"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }

    fun gameOver() {
        //story image
        gameScreen.storyImage.setImageResource(R.drawable.game_over)

        //story
        gameScreen.tvStory.text = "You are really dead."

        //options
        gameScreen.choice1.text = "restart"
        gameScreen.choice2.text = ""
        gameScreen.choice3.text = ""
        gameScreen.choice4.text = ""

        //next position
        nextPosition1 = "starting point"
        nextPosition2 = ""
        nextPosition3 = ""
        nextPosition4 = ""
    }
}