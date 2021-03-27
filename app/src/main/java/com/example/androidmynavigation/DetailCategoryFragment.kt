package com.example.androidmynavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidmynavigation.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
//        val dataDesc = arguments?.getLong(CategoryFragment.EXTRA_DESC)
//
//        binding?.tvCategoryName?.text = dataName
//        binding?.tvCategoryDesc?.text = "Stok : $dataDesc"

        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDesc = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        binding?.tvCategoryName?.text = dataName
        binding?.tvCategoryDesc?.text = "Stock : $dataDesc"

        binding?.btnProfile?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment)
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}