package kg.smartpost.fitbox.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kg.smartpost.fitbox.R
import kg.smartpost.fitbox.databinding.FragmentNutritionBinding
import kg.smartpost.fitbox.databinding.FragmentShopBinding
import kg.smartpost.fitbox.ui.nutrition.adapter.NutritionAdapter
import kg.smartpost.fitbox.ui.shop.adapter.ShopAdapter

class ShopFragment : Fragment() {

    private var _binding: FragmentShopBinding? = null
    private val binding: FragmentShopBinding get() = _binding!!

    private lateinit var shopAdapter: ShopAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shopAdapter = ShopAdapter()
        binding.recyclerShop.adapter = shopAdapter

        binding.btnCart.setOnClickListener {
            findNavController().navigate(R.id.cardFragment)
        }
    }
}