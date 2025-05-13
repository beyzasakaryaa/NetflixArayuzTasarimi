package com.example.netflixarayuztasarimi

import androidx.recyclerview.widget.StaggeredGridLayoutManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.netflixarayuztasarimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        // Film listesini oluştur
        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Oppenheimer","oppenheimer","Atom bombasının geliştirilme sürecinde yer alan fizikçi J. Robert Oppenheimer'ın hayatını konu alır.")
        val f2 = Filmler(2,"Matrix","matrix","Gerçeklik ile simülasyon arasında sıkışıp kalmış bir dünyada, Neo'nun kaderini keşfetmesini anlatır.")
        val f3 = Filmler(3,"Avatar","avatar","Pandora gezegenine gönderilen bir askerin, yerli halkla olan bağlarını ve dönüşümünü işler.")
        val f4 = Filmler(4,"Scarface","scarface","Küba'dan Amerika'ya göç eden Tony Montana'nın suç dünyasındaki yükselişini anlatan bir klasik.")
        val f5 = Filmler(5,"Seytanin Avukati","seytaninavukati","Başarılı bir avukatın, gizemli bir hukuk firmasında çalışmaya başlamasıyla değişen hayatını konu alır.")
        val f6 = Filmler(6,"Dark","dark","Zaman yolculuğu, gizem ve aile bağlarını iç içe geçiren Alman yapımı karmaşık bir bilim kurgu dizisi.")
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val adapter = FilmlerAdapter(requireContext(), filmlerListesi)
        binding.filmlerRv.adapter = adapter

        binding.filmlerRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }
}
