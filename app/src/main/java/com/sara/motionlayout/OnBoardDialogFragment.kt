package com.sara.motionlayout

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment


class OnBoardDialogFragment : DialogFragment() {


    lateinit var description: String

    companion object {


        private const val KEY_TITLE = "KEY_TITLE"

        @JvmStatic
        fun newInstance(title: String): OnBoardDialogFragment {
            val args = Bundle()
            args.putString(KEY_TITLE, title)
            val fragment = OnBoardDialogFragment()
            fragment.arguments = args
            return fragment
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        description = arguments?.getString(KEY_TITLE, "")!!
        return inflater.inflate(R.layout.on_board_dialog_layout, container, false)
    }



    override fun onStart() {
        super.onStart()

        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        dialog?.findViewById<TextView>(R.id.tv_description)?.text = description

        dialog?.getWindow()?.setBackgroundDrawable( ColorDrawable(Color.TRANSPARENT))
    }

}