package com.example.myflixsterapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myflixsterapp2.R.id


private const val TAG = "MainActivity/"
private const val SEARCH_API_KEY = "a07e22bc18f5cb106bfe4cc1f83ad8ed"
private const val PERSON_SEARCH_URL =
    "https://api.themoviedb.org/3/search/person?api_key=${SEARCH_API_KEY}"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, PersonFragment(), null).commit()
    }

}