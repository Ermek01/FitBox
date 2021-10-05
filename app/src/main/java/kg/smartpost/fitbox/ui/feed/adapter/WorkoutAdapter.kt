package kg.smartpost.fitbox.ui.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R

class WorkoutAdapter : RecyclerView.Adapter<WorkoutAdapter.ViewHolderWorkout>() {

    class ViewHolderWorkout(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderWorkout {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.items, parent, false)
        return ViewHolderWorkout(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderWorkout, position: Int) {
    }

    override fun getItemCount(): Int {
        return 3
    }


}