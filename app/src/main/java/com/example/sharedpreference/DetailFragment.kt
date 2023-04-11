package com.example.sharedpreference

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.sharedpreference.databinding.FragmentDetailBinding
import com.example.sharedpreference.model.Film

class DetailFragment : Fragment() {


  lateinit var binding:FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = arguments

        val item = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            args?.getParcelable("DATA", Film::class.java)
        } else {
            args?.getParcelable("DATA")
        }

        if (item != null) {
            binding.detailFilm = Film(item.title,item.release,item.desc,item.img,item.rating)
        }
    }


}