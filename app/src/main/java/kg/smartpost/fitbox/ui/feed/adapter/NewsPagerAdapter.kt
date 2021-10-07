package kg.smartpost.fitbox.ui.feed.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.activities.NewsActivity
import kg.smartpost.fitbox.ui.feed.FeedFragment

class NewsPagerAdapter : RecyclerView.Adapter<NewsPagerAdapter.ViewHolderNews>() {

    class ViewHolderNews(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNews {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_news, parent, false)
        return ViewHolderNews(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderNews, position: Int) {
    }

    override fun getItemCount(): Int {
        return 3
    }


}