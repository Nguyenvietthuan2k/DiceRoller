package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // InitView
        val rollButton: Button = findViewById(R.id.btn);

        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView: TextView = findViewById(R.id.textRoll)
//            resultTextView.text = 6.toString(); // "6"
            // Do a dice roll when the app starts
            rollDice();
        }

    }
    /*
    Roll the dice and update the screen with the result.
    */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        // Tạo đối tượng Xúc xắc mới có 6 mặt và tung xúc xắc
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textRoll)
//        resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)
//        diceImage.setImageResource(R.drawable.dice_1)
        if (diceRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
        } else if (diceRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
        }else if (diceRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)
        }else if (diceRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)
        }else if (diceRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)
        }else if (diceRoll == 6) {
            diceImage.setImageResource(R.drawable.dice_6)
        }
//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }
//        val drawableResource = when (diceRoll) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//
//        diceImage.setImageResource(drawableResource)
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}