package com.nwanneka.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.nwanneka.fragmentnavigation.databinding.FragmentABinding



class AFragment : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_a, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.moveButn.setOnClickListener {
            val activity = requireActivity() as MainActivity
            activity.navigate(BFragment())

        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}





