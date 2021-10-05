package kg.smartpost.fitbox.ui.trainings.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.ui.trainings.WorkoutWithFitboxFragment

class WorkoutViewAllAdapter(private val workoutWithFitboxFragment: WorkoutWithFitboxFragment) : RecyclerView.Adapter<WorkoutViewAllAdapter.ViewHolderWorkoutViewAll>() {

    inner class ViewHolderWorkoutViewAll(view: View) : RecyclerView.ViewHolder(view) {

        val btnStart = view.findViewById<LinearLayout>(R.id.btn_start)

        fun bind(position: Int) {
            btnStart.setOnClickListener {
                workoutWithFitboxFragment.findNavController().navigate(R.id.workoutDetailFragment)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderWorkoutViewAll {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.workout_view_all, parent, false)
        return ViewHolderWorkoutViewAll(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderWorkoutViewAll, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 3
    }


}