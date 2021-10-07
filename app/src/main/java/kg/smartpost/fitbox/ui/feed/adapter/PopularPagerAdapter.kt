package kg.smartpost.fitbox.ui.feed.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import kg.smartpost.fitbox.R

class PopularPagerAdapter : RecyclerView.Adapter<PopularPagerAdapter.ViewHolderNews>() {

    class ViewHolderNews(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNews {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.iitem_popular, parent, false)
        return ViewHolderNews(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderNews, position: Int) {
    }

    override fun getItemCount(): Int {
        return 3
    }


}