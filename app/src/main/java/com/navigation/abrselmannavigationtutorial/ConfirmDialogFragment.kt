package com.navigation.abrselmannavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_confirm_dialogl.*
import kotlinx.android.synthetic.main.fragment_view_balance.*

class ConfirmDialogFragment : BottomSheetDialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_confirm_dialogl,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args:ConfirmDialogFragmentArgs by navArgs()
        val receiverName=args.receiverName
        val amount=args.amount
        tv_message.text="Do you want to send Rs $amount to $receiverName ?"
        btn_yes.setOnClickListener{
            dismiss()
            Toast.makeText(requireContext(),"Rs $amount sent to $receiverName",Toast.LENGTH_SHORT).show()
        }
        btn_no.setOnClickListener{
            dismiss()
        }

    }
}
