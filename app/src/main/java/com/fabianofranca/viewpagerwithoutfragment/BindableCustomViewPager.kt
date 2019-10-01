package com.fabianofranca.viewpagerwithoutfragment

import com.fabianofranca.viewpagerwithoutfragment.databinding.ItemViewPagerBinding

class BindableCustomViewPager(private val model: SampleModel) :
    BindableViewPagerItem<ItemViewPagerBinding>() {

    override fun bind(viewDataBinding: ItemViewPagerBinding, position: Int) {
        viewDataBinding.model = model
    }

    override val layout = R.layout.item_view_pager
}