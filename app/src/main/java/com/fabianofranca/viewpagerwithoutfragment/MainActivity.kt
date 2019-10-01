package com.fabianofranca.viewpagerwithoutfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CustomPagerAdapter(this)

        adapter.addAll(
            listOf(
                BindableCustomViewPager(SampleModel("Banner 1")),
                BindableCustomViewPager(SampleModel("Banner 2")),
                BindableCustomViewPager(SampleModel("Banner 3"))
            )
        )

        viewPager.adapter = adapter
    }
}