package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_choose_receiver.*
import kotlinx.android.synthetic.main.fragment_send_cash.*
import kotlinx.android.synthetic.main.fragment_send_cash.btn_cancel1

class SendCashFragment : Fragment(R.layout.fragment_send_cash) {
    private val sendCashFragmentArgs: SendCashFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val receiverName = sendCashFragmentArgs.receiverName
        tv_receiver.text = "Do you want to send cash to $receiverName"

        btn_send.setOnClickListener {
            val navigationController = findNavController()
            val amount = et_amount.text.toString()
            if (amount.isNullOrEmpty()) return@setOnClickListener
            val actions = SendCashFragmentDirections.actionSendCashFragmentToConfirmDialogFragment(
                receiverName = receiverName,
                amount = amount.toInt()
            )
            navigationController.navigate(actions)
        }

        btn_done.setOnClickListener {
            val navigationController = findNavController()
            val actions = SendCashFragmentDirections.actionSendCashFragmentToHomeFragment()
            navigationController.navigate(actions)
        }

        btn_cancel1.setOnClickListener{
            findNavController().popBackStack(R.id.homeFragment,true)
        }
    }
}