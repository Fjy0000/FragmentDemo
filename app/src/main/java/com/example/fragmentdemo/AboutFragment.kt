package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragmentdemo.databinding.FragmentAboutBinding
import com.example.fragmentdemo.databinding.FragmentHomeBinding


class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about, container, false)

        binding.btnTest.setOnClickListener(){
            Navigation.findNavController(binding.root).navigate(R.id.action_aboutFragment_to_newFragment1)
        }

        return binding.root
    }

}