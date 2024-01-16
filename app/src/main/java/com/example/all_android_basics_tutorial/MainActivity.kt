package com.example.all_android_basics_tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import com.example.all_android_basics_tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
//        binding.submitOrder.setOnClickListener{
//            val checkMeetRadioButtonId = binding.radioOption.checkedRadioButtonId
//            val meet = findViewById<RadioButton>(checkMeetRadioButtonId)
//            val chese  = binding.chooseChese.isChecked
//            val onion = binding.chooseOnion.isChecked
//            val ordereddetail = "You want to eat with rice \n" + "${meet.text}" + (if(chese) "\nCheese" else "") +
//                    (if(onion) "\n Onion" else "")
//            binding.detailsOfOrder.text = ordereddetail
//        }
//        binding.buttonShowToast.setOnClickListener{
//            Toast.makeText(this , "Hi , I am bharat Thank you for visiting ..." , Toast.LENGTH_LONG).show()
//        }

    val buttonId = findViewById<Button>(R.id.buttonOpenActivity)
        buttonId.setOnClickListener {
            Intent(this , MainActivity2::class.java).also {
                startActivity(it)
            }
        }
       }
    }

