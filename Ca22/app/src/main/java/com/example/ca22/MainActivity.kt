package com.example.ca22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var spi=findViewById<Spinner>(R.id.spinner)
        var submit=findViewById<Button>(R.id.submit)
        var proof=findViewById<CheckBox>(R.id.proof)
        var male=findViewById<RadioButton>(R.id.male)
        var female=findViewById<RadioButton>(R.id.female)
        submit.setOnClickListener{
            Toast.makeText(this, "Information submitted successfully", Toast.LENGTH_SHORT).show()
        }
        proof.setOnClickListener{
            Toast.makeText(this, "A copy of your responses will be sent to you", Toast.LENGTH_SHORT).show()
        }
        male.setOnClickListener{
            Toast.makeText(this, "u have selected male", Toast.LENGTH_SHORT).show()
        }
        female.setOnClickListener{
            Toast.makeText(this, "u have selected female", Toast.LENGTH_SHORT).show()
        }

        var adapter=ArrayAdapter.createFromResource(this,R.array.Branches,android.R.layout.simple_spinner_item)
        spi.adapter=adapter
        spi.onItemSelectedListener= object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext, "Branch selected", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

                }

            }
    }
            
        }
