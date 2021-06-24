package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val receiverName=arguments?.get("Name")
        tv_receiver.text="Send cash to $receiverName"
    }
}