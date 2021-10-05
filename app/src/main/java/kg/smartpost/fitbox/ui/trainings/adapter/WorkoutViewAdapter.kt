package kg.smartpost.fitbox.ui.trainings.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R

class WorkoutViewAdapter : RecyclerView.Adapter<WorkoutViewAdapter.ViewHolderWorkout>() {

    class ViewHolderWorkout(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderWorkout {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.workout_view, parent, false)
        return ViewHolderWorkout(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderWorkout, position: Int) {
    }

    override fun getItemCount(): Int {
        return 3
    }


}