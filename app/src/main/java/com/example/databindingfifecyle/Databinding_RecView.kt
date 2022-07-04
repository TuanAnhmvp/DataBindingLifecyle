package com.example.databindingfifecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingfifecyle.databinding.ActivityDatabindingRecViewBinding
import kotlinx.coroutines.newFixedThreadPoolContext


class Databinding_RecView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDatabindingRecViewBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_databinding_rec_view)





        val adapter = UserAdapter()

        adapter.users = createData()

        binding.recView.setHasFixedSize(true)
        binding.recView.layoutManager = LinearLayoutManager(this)
        binding.recView.adapter = adapter
    }

    private fun createData(): MutableList<User>{
        val users = mutableListOf<User>()
        users.add(User(R.drawable.one, "tuananh1", 20))
        users.add(User(R.drawable.two, "tuananh2", 20))
        users.add(User(R.drawable.three, "tuananh3", 20))
        users.add(User(R.drawable.four, "tuananh4", 20))
        users.add(User(R.drawable.five, "tuananh5", 20))
        users.add(User(R.drawable.six, "tuananh6", 20))
        users.add(User(R.drawable.seven, "tuananh7", 42))
        users.add(User(R.drawable.eight, "tuananh8", 24))
        users.add(User(R.drawable.nine, "tuananh9", 22))
        users.add(User(R.drawable.one, "tuananh1", 20))
        users.add(User(R.drawable.two, "tuananh2", 20))
        users.add(User(R.drawable.three, "tuananh3", 20))
        users.add(User(R.drawable.four, "tuananh4", 20))
        users.add(User(R.drawable.five, "tuananh5", 20))
        users.add(User(R.drawable.six, "tuananh6", 20))
        users.add(User(R.drawable.seven, "tuananh7", 42))
        users.add(User(R.drawable.eight, "tuananh8", 24))
        users.add(User(R.drawable.nine, "tuananh9", 22))
        return users
    }
}