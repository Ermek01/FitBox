package kg.smartpost.fitbox.ui.activities.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.feed.adapter.CoachAdapter

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.ViewHolderMenu>() {

    val titles = arrayListOf("Лента", "Тренировки", "Марафоны", "Питание", "Профиль")

    private val drawables = intArrayOf(
        R.drawable.ic_tape,
        R.drawable.ic_dumbbell,
        R.drawable.ic_alarm,
        R.drawable.ic_nutrition,
        R.drawable.ic_profile,
    )

    inner class ViewHolderMenu(view: View) : RecyclerView.ViewHolder(view) {

        val icon = view.findViewById<ImageView>(R.id.icon)
        val title = view.findViewById<TextView>(R.id.title_name)

        fun bind(position: Int) {
            title.text = titles[position]
            icon.setImageResource(drawables[position])
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMenu {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.items_bottom, parent, false)
        return ViewHolderMenu(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderMenu, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 5
    }


}