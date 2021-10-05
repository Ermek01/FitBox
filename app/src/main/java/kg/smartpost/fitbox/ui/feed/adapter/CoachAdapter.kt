package kg.smartpost.fitbox.ui.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R

class CoachAdapter : RecyclerView.Adapter<CoachAdapter.ViewHolderNews>() {

    class ViewHolderNews(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNews {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_coach, parent, false)
        return ViewHolderNews(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderNews, position: Int) {
    }

    override fun getItemCount(): Int {
        return 5
    }


}