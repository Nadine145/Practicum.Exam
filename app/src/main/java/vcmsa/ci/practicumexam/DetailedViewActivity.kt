package com.example.musicplaylistmanager

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.practicumexam.R

class DetailedViewActivity : AppCompatActivity() {

    private lateinit var songTitles: ArrayList<String>
    private lateinit var artistNames: ArrayList<String>
    private lateinit var ratings: ArrayList<Int>
    private lateinit var comments: ArrayList<String>

    private lateinit var tvSongList: TextView
    private lateinit var tvAverageRating: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        // Get data from intent
        receiveDataFromIntent()

        // Initialize views
        initializeViews()

        // Setup buttons
        setupButtons()
    }

    private fun receiveDataFromIntent() {
        try {
            songTitles = intent.getStringArrayListExtra("songTitles") ?: ArrayList()
            artistNames = intent.getStringArrayListExtra("artistNames") ?: ArrayList()
            ratings = intent.getIntegerArrayListExtra("ratings") ?: ArrayList()
            comments = intent.getStringArrayListExtra("comments") ?: ArrayList()
        } catch (e: Exception) {
            Toast.makeText(this, "Error loading data: ${e.message}", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun initializeViews() {
        tvSongList = findViewById(R.id.tvSongList)
        tvAverageRating = findViewById(R.id.tvAverageRating)
    }

    private fun setupButtons() {
        val btnDisplaySongs = findViewById<Button>(R.id.btnDisplaySongs)
        val btnCalculateAverage = findViewById<Button>(R.id.btnCalculateAverage)
        val btnReturnToMain = findViewById<Button>(R.id.btnReturnToMain)

        btnDisplaySongs.setOnClickListener {
            displaySongList()
        }

        btnCalculateAverage.setOnClickListener {
            calculateAndDisplayAverage()
        }

        btnReturnToMain.setOnClickListener {
            finish()
        }
    }

    private fun displaySongList() {
        try {
            val songListText = StringBuilder()
            songListText.append("🎵 PLAYLIST SONGS 🎵\n\n")

            // Using loop to display all songs with details
            for (i in songTitles.indices) {
                songListText.append("${i + 1}. ${songTitles[i]}\n")
                songListText.append(" Artist: ${artistNames[i]}\n")
                songListText.append(" Rating: ${ratings[i]}/5 ⭐\n")
                songListText.append(" Comment: ${comments[i]}\n\n")
            }

            tvSongList.text = songListText.toString()

        } catch (e: Exception) {
            Toast.makeText(this, "Error displaying songs: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculateAndDisplayAverage() {
        try {
            if (ratings.isEmpty()) {
                tvAverageRating.text = "No songs in playlist to calculate average"
                return
            }

            var totalRating = 0

            // Using loop to calculate average rating
            for (rating in ratings) {
                totalRating += rating
            }

            val averageRating = totalRating.toDouble() / ratings.size

            tvAverageRating.text = "🌟 Average Rating: %.2f/5.0 🌟\n" +
                    "Total Songs: ${ratings.size}\n" +
                    "Total Rating Points: $totalRating"

            tvAverageRating.text = String.format(tvAverageRating.text.toString(), averageRating)

        } catch (e: Exception) {
            Toast.makeText(this, "Error calculating average: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }
}
