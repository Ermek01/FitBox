package kg.smartpost.fitbox.ui.nutrition

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.smartpost.fitbox.databinding.FragmentNutritionBinding
import kg.smartpost.fitbox.ui.activities.ExampleDietsActivity
import kg.smartpost.fitbox.ui.activities.LoseOrGainWeightActivity
import kg.smartpost.fitbox.ui.activities.OrderProgramActivity
import kg.smartpost.fitbox.ui.nutrition.adapter.NutritionAdapter

class NutritionFragment : Fragment(), NutritionAdapter.NutritionClickListener {

    private var _binding: FragmentNutritionBinding? = null
    private val binding: FragmentNutritionBinding get() = _binding!!

    private lateinit var nutritionAdapter: NutritionAdapter

    val titles = arrayListOf<String>("Похудеть или набрать", "Примеры рационов", "Заказать индивидуальную программу питания")
    val desc = arrayListOf<String>(
        "Теоритическая часть по снижению или набору веса и калькуляторы индекса массы тела и рассчета каллорий.",
        "Рассмотрите варианты рационов питания по каллорийности и Вашим показателям.",
        "Проработка программы питания с нашим специалистом и индивидуальный подбор рациона, который подойдет именно Вам.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNutritionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nutritionAdapter = NutritionAdapter(titles, desc, this)
        binding.recyclerNutrition.adapter = nutritionAdapter
    }

    override fun onCategoryClick(position: Int) {
        when (position) {
            0 -> {
                requireContext().startActivity(Intent(requireContext(), LoseOrGainWeightActivity::class.java))
            }
            1 -> {
                requireContext().startActivity(Intent(requireContext(), ExampleDietsActivity::class.java))
            }
            2 -> {
                requireContext().startActivity(Intent(requireContext(), OrderProgramActivity::class.java))
            }

        }
    }

}