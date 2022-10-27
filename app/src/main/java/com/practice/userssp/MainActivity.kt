package com.practice.userssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.practice.userssp.databinding.ActivityMainBinding
import com.practice.userssp.models.User
import java.text.FieldPosition


class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root )

        userAdapter = UserAdapter( getUsers(), this )
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            setHasFixedSize( true )
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }

    }

    private fun getUsers():MutableList<User>{
        val users = mutableListOf<User>()

        val italo = User(1, "Italo", "Guevara", "https://frogames.es/wp-content/uploads/2020/09/alain-1.jpg")
        val user2 = User(2, "user2", "Guevara", "https://upload.wikimedia.org/wikipedia/commons/b/b2/Samanta_villar.jpg")
        val user3 = User(3, "user3", "Guevara", "https://live.staticflickr.com/974/42098804942_b9ce35b1c8_b.jpg")
        val user4 = User(4, "user4", "Guevara", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Emma_Wortelboer_%282018%29.jpg")
        val user5 = User(5, "user5", "Guevara", "")
        val user6= User(6, "user6", "Guevara", "")
        val user7 = User(7, "user6", "Guevara", "")

        users.add(italo)
        users.add(user2)
        users.add(user3)
        users.add(user4)
        users.add(user5)
        users.add(user6)
        users.add(user7)
        users.add(italo)
        users.add(user2)
        users.add(user3)
        users.add(user4)
        users.add(user5)
        users.add(user6)
        users.add(user7)
        users.add(italo)
        users.add(user2)
        users.add(user3)
        users.add(user4)
        users.add(user5)
        users.add(user6)
        users.add(user7)

        return users
    }

    override fun onClick(user: User, position: Int) {
        Toast.makeText(this, "$position: ${ user.getFullName() }", Toast.LENGTH_SHORT).show()
    }
}