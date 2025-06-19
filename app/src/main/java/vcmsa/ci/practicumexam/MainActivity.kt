package com.example.musicplaylistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.practicumexam.R
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    // Parallel arrays for song data
    private val songTitles = mutableListOf<String>()
    private val artistNames = mutableListOf<String>()
    private val ratings = mutableListOf<Int>()
    private val comments = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with sample data
        initializeSampleData()

        // Setup buttons
        setupButtons()
    }

    private fun initializeSampleData() {
        // Sample data as shown in the assignment
        songTitles.addAll(listOf("Song A", "Song B", "Song C", "Song D"))
        artistNames.addAll(listOf("Artist A", "Artist B", "Artist C", "Artist D"))
        ratings.addAll(listOf(4, 1, 2, 3))
        comments.addAll(listOf("Rap", "Dance song", "Best Love song", "Memories"))
    }

    private fun setupButtons() {
        val btnAddToPlaylist = findViewById<Button>(R.id.btnAddToPlaylist)
        val btnViewDetails = findViewById<Button>(R.id.btnViewDetails)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnAddToPlaylist.setOnClickListener {
            showAddSongDialog()
        }

        btnViewDetails.setOnClickListener {
            navigateToDetailedView()
        }

        btnExit.setOnClickListener {
            exitApplication()
        }
    }

    private fun showAddSongDialog() {
        val dialog = AddSongDialog(::addSongToPlaylist)
        dialog.show(supportFragmentManager, "AddSongDialog")
    }

    private fun addSongToPlaylist(title: String, artist: String, rating: Int, comment: String) {
        try {
            songTitles.add(title)
            artistNames.add(artist)
            ratings.add(rating)
            comments.add(comment)

            Toast.makeText(this, "Song added successfully!", Toast.LENGTH_SHORT).show()

        } catch (e: Exception) {
            Toast.makeText(this, "Error adding song: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToDetailedView() {
        val intent = Intent(this, DetailedViewActivity::class.java)

        // Pass arrays to detailed view
        intent.putStringArrayListExtra("songTitles", ArrayList(songTitles))
        intent.putStringArrayListExtra("artistNames", ArrayList(artistNames))
        intent.putIntegerArrayListExtra("ratings", ArrayList(ratings))
        intent.putStringArrayListExtra("comments", ArrayList(comments))

        startActivity(intent)
    }

    private fun exitApplication() {
        try {
            finishAffinity()
            exitProcess(0)
        } catch (e: Exception) {
            Toast.makeText(this, "Error exiting app", Toast.LENGTH_SHORT).show()
        }
    }
}
