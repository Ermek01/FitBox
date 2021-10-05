package kg.smartpost.fitbox.ui.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import kg.smartpost.fitbox.R

class ImagePagerAdapter: PagerAdapter() {

    private val drawables =
        intArrayOf(R.drawable.img_shop_fitbox, R.drawable.img_shop_fitbox, R.drawable.img_shop_fitbox)

    override fun getCount(): Int {
        return 3
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(container.context).inflate(R.layout.page_images, container, false)
        val imageView = view.findViewById<ImageView>(R.id.img_shop_page)

        imageView.setImageResource(drawables[position])
        container.addView(view)
        return view
    }


}