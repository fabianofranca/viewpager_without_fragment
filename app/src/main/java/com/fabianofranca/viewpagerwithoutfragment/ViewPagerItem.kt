package com.fabianofranca.viewpagerwithoutfragment

import android.view.View

abstract class ViewPagerItem {

    abstract val layout: Int

    abstract fun bind(view: View, position: Int)

    open fun unbind(view: View, position: Int) {}
}