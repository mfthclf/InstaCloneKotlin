package com.mfthc.instaclonekotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mfthc.instaclonekotlin.databinding.FragmentUploadBinding


class UploadFragment : Fragment() {
    private var _binding: FragmentUploadBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUploadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.uploadButton.setOnClickListener { Upload(it) }
        binding.imageViewToUpload.setOnClickListener { SelectImage(it) }

    }

    fun Upload(view: View) {

    }

    fun SelectImage(view: View) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}