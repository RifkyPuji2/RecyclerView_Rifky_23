package com.example.recyclerview_rifky_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.robin,
                "Robin",
                "Robin adalah alias dari beberapa pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh DC Comics. Karakter awalnya diciptakan oleh Bob Kane, Bill Finger, dan Jerry Robinson, untuk melayani sebagai rekan junior untuk superhero Batman."
            ),
            Superhero(
                R.drawable.starfire,
                "Starfire",
                "Starfire adalah superhero fiksi yang muncul dalam buku-buku yang diterbitkan oleh DC Comics. Dia memulai debutnya dalam cerita pratinjau yang dimasukkan ke dalam DC Comics Presents #26 dan dibuat oleh Marv Wolfman dan George Pérez."
            ),
            Superhero(
                R.drawable.raven,
                "Reven",
                "Raven adalah salah satu karakter utama dari serial Teen Titans . Dia adalah hibrida manusia-iblis, yang berasal dari dimensi paralel Azarath , dan merupakan salah satu dari lima anggota pendiri Teen Titans."
            ),
            Superhero(
                R.drawable.beast,
                "Beast Boy",
                "Beast Boy, adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh DC Comics. Dia juga menggunakan nama alias Changeling. Dibuat oleh penulis Arnold Drake dan seniman Bob Brown, dia adalah pengubah bentuk yang memiliki kemampuan untuk bermetamorfosis menjadi hewan apa pun yang dia pilih."
            ),
            Superhero(
                R.drawable.cyborg,
                "Cyborg",
                "Cyborg adalah superhero fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh DC Comics. Karakter tersebut diciptakan oleh penulis Marv Wolfman dan artis George Pérez dan pertama kali muncul di sisipan khusus di DC Comics Presents #26."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}