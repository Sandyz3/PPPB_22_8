package com.example.pppb_22_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pppb_22_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btn1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hello Nakama " + binding.textInputName.text + "!" , Toast.LENGTH_SHORT).show()

//        with(binding) {
//            btn1.setOnClickListener{
//                Toast.makeText(this@MainActivity, "Hello Nakama",Toast.LENGTH_LONG).show()



            }
        }
    }
}