package kg.smartpost.fitbox.ui.feed.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.PagerAdapter
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.activities.NewsActivity
import kg.smartpost.fitbox.ui.feed.FeedFragment

class NewsPagerAdapter(private val context: Context, private val feedFragment: FeedFragment): PagerAdapter() {


    override fun getCount(): Int {
        return 3
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_news, container, false)

        view.setOnClickListener {
            context.startActivity(Intent(context, NewsActivity::class.java))
        }
        container.addView(view)
        return view
    }


}