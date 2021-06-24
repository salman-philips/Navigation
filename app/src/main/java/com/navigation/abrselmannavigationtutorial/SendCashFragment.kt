package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash){
    private val sendCashFragmentArgs:SendCashFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_receiver.text = "Do you want to send cash to ${sendCashFragmentArgs.receiverName}"
        et_amount.setText(sendCashFragmentArgs.amount.toString())

    }
}