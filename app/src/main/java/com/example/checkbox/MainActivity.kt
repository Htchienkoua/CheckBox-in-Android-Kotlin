package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  male: CheckBox
    lateinit var female : CheckBox
    lateinit var none : CheckBox
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    male = findViewById(R.id.checkBoxMale)
        female = findViewById(R.id.checkBoxFemale)
        none = findViewById(R.id.checkBoxNone)

        result = findViewById(R.id.textView)

        male.setOnClickListener {
            if(male.isChecked){
                result.text = "Your gender is Male!"
                female.isChecked = false
                none.isChecked = false
            }
            else {
                result.text = "What is your gender?"
            }
        }

        female.setOnClickListener {
            if(female.isChecked){
                result.text = "Your gender is female"
                male.isChecked = false
                none.isChecked = false
            }else {
                result.text = "What is your gender?"
            }
        }

        none.setOnClickListener {
            if(none.isChecked){
                result.text = "Undefined Gender"
                male.isChecked = false
                female.isChecked = false
            }else {
                result.text = "What is your gender!"
            }
        }


    }
}