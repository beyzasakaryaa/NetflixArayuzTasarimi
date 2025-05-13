package com.example.netflixarayuztasarimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.netflixarayuztasarimi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        // Film verisini al
        val bundle: DetayFragmentArgs by navArgs()
        val Filmler  = bundle.filmNesnesi

        binding.toolbarDetay.title = Filmler.ad


        // Açıklama örneği
        binding.tvAciklama.text = "${Filmler .aciklama}" // Filmle ilgili açıklama

        // Film resmini göster
        binding.ivFilm.setImageResource(
            resources.getIdentifier(Filmler.resim, "drawable", requireContext().packageName)
        )

        return binding.root
    }
}
