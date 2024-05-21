package com.l0122075.humamalwi.responsi1.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.l0122075.humamalwi.responsi1.R
import com.l0122075.humamalwi.responsi1.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val shareButton = view.findViewById<Button>(R.id.share_button)
        shareButton.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Nama               : Humam Alwi Ahmad \n" +
                        "NIM                : L0122075\n" +
                        "Jurusan/Angkatan   : Informatika 22\n" +
                        "Fakultas           : Fakultas Teknologi Informasi dan Sains Data\n" +
                        "Universitas        : Universitas Sebelas Maret\n" +
                        "Email              : humamalwiic@student.uns.ac.id"
            )
            shareIntent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, "Send me message"))
        }
        return view
    }
}