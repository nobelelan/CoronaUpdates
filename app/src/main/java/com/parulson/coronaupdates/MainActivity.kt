package com.parulson.coronaupdates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.parulson.coronaupdates.databinding.ActivityMainBinding
import com.parulson.coronaupdates.repositories.CoronaUpdateRepository
import com.parulson.coronaupdates.viewmodels.CoronaUpdateViewModel
import com.parulson.coronaupdates.viewmodels.ViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var viewModel: CoronaUpdateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var repository = CoronaUpdateRepository()
        val viewModelProviderFactory = ViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory)[CoronaUpdateViewModel::class.java]

        viewModel.breakingNews.observe(this, Observer {
            viewModel.getBreakingNews("us",1)

            Log.d("nubu", it.toString())
            binding.tvCases.text = it.author.toString()
            //binding.tvTodayCases.text = it.todayCases.toString()
            //binding.tvDeaths.text = it.deaths.toString()
            //binding.tvRecovered.text = it.recovered.toString()
        })
    }
}