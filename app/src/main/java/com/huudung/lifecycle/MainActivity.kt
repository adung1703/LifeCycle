package com.huudung.lifecycle

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constrain_layout)
        val firstname: EditText = findViewById(R.id.Firstname)
        val lastname: EditText = findViewById(R.id.Lastname)
        val Male: RadioButton = findViewById(R.id.radioButton2)
        val Female: RadioButton = findViewById(R.id.radioButton5)
        val Birthday: EditText = findViewById(R.id.editTextDate2)
        val Address: EditText = findViewById(R.id.Address)
        val Email: EditText = findViewById(R.id.editTextTextEmailAddress2)
        val Terms: CheckBox = findViewById(R.id.checkBox2)
        val Register: Button = findViewById(R.id.button2)

        Register.setOnClickListener {
            if(check(firstname.text.toString(),
                    lastname.text.toString(),
                    Birthday.text.toString(),
                    Address.text.toString(),
                    Email.text.toString()
                ) && (Male.isChecked || Female.isChecked)&& Terms.isChecked) {
                Toast.makeText(applicationContext, "Register successfully!", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(applicationContext, "Fill all fields and check the box.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun check(firstName: String, lastName: String, date: String, address: String, email: String): Boolean {
        return firstName.isNotBlank() && lastName.isNotBlank() && date.isNotBlank() && address.isNotBlank() && email.isNotBlank()
    }

}