package com.aniketto.myapplication

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contacts")
            .setMessage("DO you want to add Navneet to your contact list?")
            .setIcon(R.drawable.ic_addcon)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Navneet to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No"){ _ , _ ->
                Toast.makeText(this , "You didn't add Navneet to your contact list" , Toast.LENGTH_SHORT).show()
            }
            .create()
         val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
            btnDialog1.setOnClickListener {
                addContactDialog.show()
            }

        val options = arrayOf("Name1", "Name2", "Name3")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these Options")
            .setSingleChoiceItems(options , 0){dialogInterface , i->
                Toast.makeText(this , "You clicked on ${options[i]}" , Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "Request Accepted", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Decline"){ _ , _ ->
                Toast.makeText(this , "Request Declined" , Toast.LENGTH_SHORT).show()
            }
        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multipleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these Options")
            .setMultiChoiceItems(options , booleanArrayOf(false, false , false)){_ , i , isChecked ->
                if(isChecked){
                    Toast.makeText(this , "You checked ${options[i]}" , Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this , "You unchecked ${options[i]}" , Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "Request Accepted", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _ , _ ->
                Toast.makeText(this , "Request Declined" , Toast.LENGTH_SHORT).show()
            }.create()
        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        btnDialog2.setOnClickListener {
            multipleChoiceDialog.show()
        }
    }
}