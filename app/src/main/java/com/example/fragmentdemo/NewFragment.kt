package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentdemo.databinding.FragmentHomeBinding
import com.example.fragmentdemo.databinding.FragmentNewBinding


class NewFragment : Fragment() {

    private lateinit var binding: FragmentNewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_new, container, false)

        binding.btnBackToHome.setOnClickListener(){
            Navigation.findNavController(binding.root).popBackStack()
        }

        return binding.root
    }

}