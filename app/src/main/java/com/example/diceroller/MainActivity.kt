package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    val arrayname = arrayOf(0,0,0,0)

    var i=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button =findViewById(R.id.button_view)

        button.setOnClickListener{
            randomNumber()
            if(i==4){
                i=0;
            }
        }

    }

    private fun randomNumber() {
        val player_name: TextView=findViewById(R.id.player_id)
        player_name.text="Player${i+1}"
        val player_score: TextView=findViewById(R.id.player_score)
        player_score.text=arrayname[i].toString()
        val imageView: ImageView=findViewById(R.id.image_view);
        val randomNumber=(Random.nextInt(6)+1)
        val resoure=when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        imageView.setImageResource(resoure)
        if(arrayname[i]+randomNumber<20){
            arrayname[i]+=randomNumber
            player_score.text=arrayname[i].toString()
            ++i;
        }
        else if(arrayname[i]+randomNumber==20){
            arrayname[i]+=randomNumber
            player_score.text=arrayname[i].toString()
            Toast.makeText(this,"Congratulations , to the player ${i+1}, you are the winner!!!",Toast.LENGTH_SHORT).show();
            i=0
            for (i in 0..arrayname.size-1)
            {
                arrayname[i]=0
            }
        }

    }
}