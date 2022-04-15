package com.example.weatheropensource.ui.world

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weatheropensource.databinding.FragmentWorldBinding

class WorldFragment : Fragment() {

    private var _binding: FragmentWorldBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentWorldBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}