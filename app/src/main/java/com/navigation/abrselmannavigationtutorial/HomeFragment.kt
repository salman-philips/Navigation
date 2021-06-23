package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navigationController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        btn_view_balance.setOnClickListener { navigationController.navigate(R.id.viewBalanceFragment) }
        btn_transactions.setOnClickListener { navigationController.navigate(R.id.viewTransactionsFragment) }
        btn_send_money.setOnClickListener { navigationController.navigate(R.id.chooseReceiverFragment) }
    }
}