package net.orgiu.tickets.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import net.orgiu.tickets.R
import net.orgiu.tickets.main.utils.EndAnimation

class MainActivity : AppCompatActivity() {

    private val endAnimation = EndAnimation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validation_container.setTransitionListener(endAnimation)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.play -> toggleAnimation()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun toggleAnimation() {
        if (endAnimation.isStart()) {
            validation_container.transitionToEnd()
        } else {
            validation_container.transitionToStart()
        }
    }
}
