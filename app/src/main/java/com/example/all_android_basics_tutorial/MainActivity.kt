package com.example.all_android_basics_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.all_android_basics_tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.submitOrder.setOnClickListener{
            val checkMeetRadioButtonId = binding.radioOption.checkedRadioButtonId
            val meet = findViewById<RadioButton>(checkMeetRadioButtonId)
            val chese  = binding.chooseChese.isChecked
            val onion = binding.chooseOnion.isChecked
            val ordereddetail = "You want to eat with rice \n" + "${meet.text}" + (if(chese) "\nCheese" else "") +
                    (if(onion) "\n Onion" else "")
            binding.detailsOfOrder.text = ordereddetail
        }

    }
}