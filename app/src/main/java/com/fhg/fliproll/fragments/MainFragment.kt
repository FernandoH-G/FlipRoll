package com.fhg.fliproll.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fhg.fliproll.R
import com.fhg.fliproll.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _tBinding: FragmentMainBinding? = null
    private val mBinding get() = _tBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _tBinding = FragmentMainBinding.inflate(inflater,container,false)
        return mBinding.root
    }

    override fun onDestroyView() {
        _tBinding = null
        super.onDestroyView()
    }
}