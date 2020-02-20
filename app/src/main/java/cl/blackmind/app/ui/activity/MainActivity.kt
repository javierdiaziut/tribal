package cl.blackmind.app.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.LifecycleOwner
import cl.blackmind.app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import cl.blackmind.app.ui.TaskFragment


class MainActivity : AppCompatActivity(), LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fabButton = findViewById<FloatingActionButton>(R.id.fab)

        Log.e("ACTIVITY", "OK")

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_content,
                    TaskFragment()
                )
                .commit()
        }

    }
}