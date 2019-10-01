package com.fabianofranca.viewpagerwithoutfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class CustomPagerAdapter(private val context: Context) : PagerAdapter() {

    private val items = mutableListOf<ViewPagerItem>()

    fun addAll(items: List<ViewPagerItem>) {
        this.items.addAll(items)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val inflater = LayoutInflater.from(context)

        val item = items[position]

        val view = inflater.inflate(item.layout, container, false)

        item.bind(view, position)

        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View)
        items[position].unbind(obj, position)
    }

    override fun isViewFromObject(view: View, obj: Any) = view == obj

    override fun getCount() = items.size
}