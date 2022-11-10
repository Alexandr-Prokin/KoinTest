package com.example.kointest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kointest.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class BlankFragment : Fragment() {
    val viewModel by viewModel<MainActivityViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.main()
        viewModel.message.observe(viewLifecycleOwner){
            Toast.makeText(context, "$it", Toast.LENGTH_SHORT).show()

        }
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


}