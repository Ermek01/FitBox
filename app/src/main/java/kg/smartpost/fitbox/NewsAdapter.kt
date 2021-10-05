package kg.smartpost.fitbox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolderNews>() {



    class ViewHolderNews(view: View) : RecyclerView.ViewHolder(view) {

        var relativeLayout: RelativeLayout? = null
        var textView: TextView? = null

        init {
            relativeLayout = view.findViewById(R.id.relative)
            textView = view.findViewById(R.id.txt_news)
        }

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
        return 5
    }


}