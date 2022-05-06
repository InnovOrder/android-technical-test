package com.innovorder.testtechnique

import android.media.MediaPlayer
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.innovorder.testtechnique.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by viewModels()
    private lateinit var adapter: DucksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()

        viewModel.data.observe(this) {
            adapter.submitList(it)
        }

        setupQuack()
    }

    private fun setupQuack() {
        val quackPlayer = MediaPlayer.create(this, R.raw.quack2)
        binding.quackButton.setOnClickListener {
            quackPlayer.start()
        }
    }

    private fun setupRecyclerView() {
        val quackPlayer = MediaPlayer.create(this, R.raw.quack2)

        adapter = DucksAdapter()
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)

        binding.recyclerview.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                (binding.recyclerview.layoutManager as LinearLayoutManager)
                    .findFirstCompletelyVisibleItemPosition()
                    .also {
                        quackPlayer.start()
                    }
            }
        })
    }
}
