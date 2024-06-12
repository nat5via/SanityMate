package com.novia.sanitymate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(private val context: Context) : PagerAdapter() {

    private val sliderAllImages = intArrayOf(R.drawable.screen1, R.drawable.screen2)
    private val sliderAllTitle = intArrayOf(R.string.screen1, R.string.screen2)
    private val sliderAllDesc = intArrayOf(R.string.screen1desc, R.string.screen2desc)

    override fun getCount(): Int {
        return sliderAllTitle.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as FrameLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater.inflate(R.layout.slider_screen, container, false)

        val sliderImage: ImageView = view.findViewById(R.id.sliderImage)
        val sliderTitle: TextView = view.findViewById(R.id.sliderTitle)
        val sliderDesc: TextView = view.findViewById(R.id.sliderDesc)

        sliderImage.setImageResource(sliderAllImages[position])
        sliderTitle.setText(sliderAllTitle[position])
        sliderDesc.setText(sliderAllDesc[position])

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as FrameLayout)
    }
}
