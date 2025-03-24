package com.vharya.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvMahasiswa: TextView = findViewById(R.id.tvMahasiswa)

        // Data Mahasiswa
        val dataMahasiswa = listOf(
            "Nama: Ahmad Fauzan\nNIM: 220101\nJurusan: Teknik Informatika",
            "Nama: Dewi Kartika\nNIM: 220102\nJurusan: Sistem Informasi",
            "Nama: Budi Santoso\nNIM: 220103\nJurusan: Manajemen Informatika",
            "Nama: Siti Aminah\nNIM: 220104\nJurusan: Teknik Elektro"
        )

        // Gabungkan data menjadi satu string
        val hasil = dataMahasiswa.joinToString("\n\n")

        // Set teks ke TextView
        tvMahasiswa.text = hasil

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}