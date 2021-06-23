package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navigationController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        btn_view_balance.setOnClickListener {

            val navOptions= NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_out_right)
                .setPopExitAnim(R.anim.slide_out_left)
                .build()

            navigationController.navigate(R.id.viewBalanceFragment,null,navOptions) }

        btn_transactions.setOnClickListener {

            val navOptions= NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_out_right)
                .setPopExitAnim(R.anim.slide_out_left)
                .build()

            navigationController.navigate(R.id.viewTransactionsFragment,null,navOptions) }

        btn_send_money.setOnClickListener {

            val navOptions= NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_out_right)
                .setPopExitAnim(R.anim.slide_out_left)
                .build()

            navigationController.navigate(R.id.chooseReceiverFragment,null,navOptions) }
    }
}