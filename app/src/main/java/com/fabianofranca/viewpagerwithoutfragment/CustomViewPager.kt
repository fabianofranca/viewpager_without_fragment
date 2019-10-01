package com.fabianofranca.viewpagerwithoutfragment

import android.view.View
import kotlinx.android.synthetic.main.item_view_pager.view.*

class CustomViewPager(private val model: SampleModel) : ViewPagerItem() {

    override val layout = R.layout.item_view_pager

    override fun bind(view: View, position: Int) {
        view.txtName.text = model.name
    }
}