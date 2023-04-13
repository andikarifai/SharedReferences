package com.example.sharedpreference

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharedpreference.databinding.FragmentProfilBinding
import com.example.sharedpreference.model.Film
import androidx.navigation.fragment.findNavController

class ProfilFragment : Fragment() {

    private var _binding: FragmentProfilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfilBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mengambil data dari Shared Preferences
        val sharedPreferences = activity?.getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val name = sharedPreferences?.getString("NAME", "")

        // Set data ke tampilan profil
        binding.nameTextView.text = name

        // Setup onClickListener untuk logout button
        binding.logoutButton.setOnClickListener {
            findNavController().navigate(R.id.action_profilFragment_to_loginFragment)
        }

    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
