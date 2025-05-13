package com.example.netflixarayuztasarimi

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixarayuztasarimi.databinding.CardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext: Context, var filmlerListesi: List<Filmler>) : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        // CardTasarimBinding'i kullanarak layoutu inflate et
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim

        // Resmi yükle
        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim, "drawable", mContext.packageName)
        )

        // CardView tıklama olayını ayarla
        t.cardviewfilm.setOnClickListener {

            Log.e("Test","Tiklandi")

            val gecis = AnasayfaFragmentDirections.detayGecis(filmNesnesi = film)
            Navigation.findNavController(holder.itemView).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}
