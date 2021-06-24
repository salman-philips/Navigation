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
        btn_next.setOnClickListener {
            val receiverName = et_receiver_name.text.toString()
            val args = Bundle()
            args.putString("Name", receiverName)
            val navOptions = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            val navController = findNavController()
            navController.navigate(R.id.sendCashFragment, args, navOptions)
        }


    }
}