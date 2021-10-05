package kg.smartpost.fitbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PopularAdapter : RecyclerView.Adapter<PopularAdapter.ViewHolderNews>() {



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
        return 5
    }


}