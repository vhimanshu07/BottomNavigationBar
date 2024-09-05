package com.example.bottomnavigationbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         *
         * 1. Add bottom navigation bar library check build.gradle
         *
         */

        /**
         *
         * 2. Now need to create menu resource file
         *
         */

        /**
         *
         * 3. Make changes in bottom_nav_menu file
         *
         */

        /**
         *
         * 4. make changes in activity xml file
         *
         */

        /**
         *
         * 5.Now make fragments
         *
         */
        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()
        val fragmentThree = FragmentThree()
        /**
         *
         * 6. Set up bottom navigation click listener.
         *
         */
        bottomNavigationView = findViewById(R.id.bottomNav)
        openFragment(fragmentOne)
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeIcon -> {
                    openFragment(fragmentOne)
                }
                R.id.messageIcon -> {
                    openFragment(fragmentTwo)
                }
                R.id.searchIcon -> {
                    openFragment(fragmentThree)
                }
            }
            true
        }
        /**
         *
         * 7. Red dot on bottom nav
         *
         */
        bottomNavigationView.getOrCreateBadge(R.id.messageIcon).apply {
            number = 10
            isVisible = true
        }


    }

    private fun openFragment(currentFragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentView, currentFragment)
            commit()
        }
    }

}