package com.example.sharedpreference

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sharedpreference.adapter.FilmAdapter
import com.example.sharedpreference.databinding.FragmentHomeBinding
import com.example.sharedpreference.viewModel.FilmViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val filmViewModel: FilmViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        filmViewModel.getFilmList()
        filmViewModel.filmList.observe(viewLifecycleOwner){
            val listFilmAdapter = FilmAdapter(it)
            Log.d("TAG","$it")
            binding.rvFilm.apply {
                layoutManager = GridLayoutManager(requireContext(),2)
                adapter = listFilmAdapter
            }

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}