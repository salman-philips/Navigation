package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose_receiver.*

class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        btn_next.setOnClickListener {
            val receiverName=et_receiver_name.text.toString()
            val actions=ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(receiverName = receiverName)
            navController.navigate(actions)
        }
    }
}