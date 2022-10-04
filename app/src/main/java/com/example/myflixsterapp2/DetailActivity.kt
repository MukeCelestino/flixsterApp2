package com.example.myflixsterapp2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var personImageView: ImageView
    private lateinit var posterImageView: ImageView
    private lateinit var personTextView: TextView
    private lateinit var knownForTextView: TextView
    private lateinit var overviewTextView: TextView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        personImageView = findViewById(R.id.person_image)
        personTextView = findViewById(R.id.person_name)
        knownForTextView = findViewById(R.id.knownFor)
        overviewTextView = findViewById(R.id.overviewTv)
        titleTextView = findViewById(R.id.movieTitleTV)
        posterImageView = findViewById(R.id.posterView)

        // TODO: Get the extra from the Intent
        val person = intent.getSerializableExtra(PERSON_EXTRA) as Person

        // TODO: Set the title, byline, and abstract information from the article
        personTextView.text = person.name


        // Load the media image
        Glide.with(this)
            .load(person.profilePath)
            .into(personImageView)

    }
}