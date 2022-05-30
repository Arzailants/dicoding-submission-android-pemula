package com.blackspring.projectakhirandroidpemula

import android.content.Intent

object TempatWisataData {
    // menyimpan nama tempat wisata
    private val namaTempatWisata = arrayOf(
        "Kebun Raya Baturraden",
        "New Small World",
        "The Village Purwokerto",
        "Baturraden Adventure Forest",
        "Telaga Sunyi",
        "Taman Balai Kemambang",
        "Bukit Agaran",
        "Bukit Tranggulasih",
        "Curug Kembar Ketenger",
        "Wana Wisata Baturraden",
        "Pancuran Pitu",
        "Curug Gede",
        "Taman Andhang Pangrenan",
        "Bukit Bintang Baturraden",
        "Kampung Pelangi"
    )

    // menyimpan descripsi tentang tempat wisata
    private val descripsiTempatWisata = arrayOf(
        "Kabun Raya Baturraden mengoleksi aneka tumbuhan, mulai dari mulai bunga anggrek hingga tanaman obat, paku, dan bambu. Pengunjung yang datang ke tempat ini akan disambut dengan rimbunnya pepohonan. Lokasinya ada di Jalan Pancurantujuh - Wanawisata Baturraden, Purwokerto, Dusun III Berubahan, Kemutug Lor, Baturraden, Banyumas, Jawa Tengah.\n" +
                "\n",
        "Buat penggemar selfie dengan latar yang Instagramable bisa mampir ke New Small World.  Di tempat ini pengunjung bisa melihat dan berfoto dengan miniatur ikon-ikon terkenal dari seluruh dunia. Harga tiket masuk per orangnya mulai dari Rp 20.000, sedangkan anak berusia di bawah tiga tahun bisa masuk secara gratis. Tempat wisata ini berlokasi di Jalan Raya Baturaden Barat Nomor 271 Desa Ketenger, Purwokerto, Jawa Tengah.  Jam bukanya mulai pukul 07.00 WIB sampai dengan 17.00 WIB setiap harinya.\n" +
                "\n",
        "The Villlage Purwokerto buka setiap hari kecuali hari Selasa, mulai pukul 08.00 WIB hingga 17.00 WIB.  Terdapat sejumlah fasilitas di tempat ini, di antaranyaa rea outbound, kolam renang, kafe dan restoran, serta ruang meeting. Alamatnya berada di Dusun I, Rempoah, Baturraden, Kabupaten Banyumas, Jawa Tengah.",
        "Wisata alam lainnya di Banyumas adalah Baturraden Adventure Forest. Lokasinya ada di Dusun II Pandek, Karangsalam, Baturraden, Banyumas, Jawa Tengah.  Menurut situs web resminya, berbagai wahana bisa dicoba di tempat ini. Mulai dari outbound training, student outbound, water slide, paintball, hingga canyoning. Ada pula area perkemahan untuk pengunjung. Jam operasional Baturaden Adventure Forest adalah mulai pukul 08.00 sampai dengan 17.00 WIB.",
        "Telaga Sunyi merupakan tempat wisata alam yang beralamat di Limpakuwus, Kecamatan Sumbang, Banyumas, Jawa Tengah.  Tempat yang buka pada 07.00 WIB -12.00 WIB ini menawarkan pemandangan telaga dengan sebuah air terjun kecil.  Selain bersantai, para pengunjung juga bisa main air dan berenang di tempat ini atau sekadar menikmati air terjun.",
        "Taman ini diresmikan pada 24 Februari 2014 oleh Bupati Banyumas saat itu, yaitu Achmad Husein, dikutip dari situs web Jatengprov.go.id. Ruang Terbuka Hijau (RTH) ini dibangun di lahan seluas 1,2 hektare dengan dikelilingi pohon, taman, dan jalur jogging.  Sementara itu, di bagian tengah atau dalamnya, terdapat kolam besar dan taman bermain anak yang terdiri dari ayunan, jungkat-jungkit, dan perosotan.  Taman Balai Kemambang berada di Jalan Karang Kobar Nomor 9, Glempang, Bancarkembar, Kecamatan Purwokerto Utara, Kabupaten Banyumas, Jawa Tengah.",
        "Wisatawan yang ingin berburu tempat Instagramable sebagai lokasi foto bisa mendatangi Bukit Agaran. Terdapat banyak spot foto di tempat ini, termasuk gardu pandang berbagai bentuk yang letaknya cukup tinggi.  Saat malam hari, tempat ini juga menawarkan panorama lampu-lampu kota yang bisa dilihat dari ketinggian.  Alamatnya ada di Desa Melung, Kecamatan Kedungbanteng, Kabupaten Banyumas, Jawa Tengah.",
        "Selain memiliki tempat foto di atas bukit, Bukit Tranggulasih juga dikenal sebagai spot untuk melihat panorama matahari terbit atau sunrise.  Apabila ingin mengunjungi tempat ini, kamu bisa menuju Windujaya, Kedungbanteng, Dusun III, Windujaya, Kedungbanteng, Banyumas, Jawa Tengah.  Jam buka Bukit Tranggulasih ini adalah 24 jam.",
        "Lokasi wisata air terjun ini bisa dinikmati oleh para pengunjung pada 07.00 WIB sampai 17.00 WIB.  Tempat ini berlokasi di Dusun II Ketenger, Ketenger, Baturaden, Kabupaten Banyumas, Jawa Tengah.  Selain melihat pemandangan air terjun kembar, pengunjung juga bisa melakukan freediving di tempat ini.  Untuk diketahui, dilansir dari Kompas.com, pada Minggu (2/4/2017), freediving adalah aktivitas menyelam tanpa menggunakan alat.",
        "Selanjutnya ada Wana Wisata Baturraden yang berlokasi di Jalan Bumi Perkemahan Wana Wisata, Dusun I Karangmangu, Kemutug Lor, Baturaden, Banyumas, Jawa Tengah. Tak hanya menikmati suasana, pengunjung juga bisa melihat air terjun, seperti Curug Tirta dan Sela.  Jam bukanya mulai pukul 07.30 WIB sampai dengan 17.00 WIB setiap harinya.",
        "Pancuran Pitu merupakan salah satu tempat wisata yang populer di wilayah Banyumas. Tempat wisata ini memiliki sumber air panas alami dengan tujuh pancuran untuk mandi.  Letak Pancuran Pitu ada di Dusun III Kalipagu, Ketenger, Baturraden, Kabupaten Banyumas, Jawa Tengah.",
        "Pemandangan curug atau air terjun setinggi 50 meter merupakan daya tarik utama tempat ini. Selain menikmati pemandangan curug, para pengunjung juga bisa main air di kolam yang terbentuk dari aliran air terjun.  Bagi yang ingin ke Curug Gede, alamatnya ada di Melung, Baturraden, Dusun II Ketenger, Ketenger, Baturaden, Kabupaten Banyumas, Jawa Tengah.",
        "Alamat Taman Andhang Pangrenan berada di Jalan Gerilya Purwokerto Selatan, Windusara, Karangklesem, Banyumas, Jawa Tengah.  Tempat wisata ini dibuka dari 08.00 WIB sampai dengan 22.00 WIB, sehingga bisa menjadi pilihan bagi kamu yang mencari tempat wisata malam hari di Banyumas. Taman ini juga memiliki fasilitas untuk anak, seperti taman bermain, area jogging, dan lapangan luas. Biasanya, lapangan tersebut juga digunakan untuk menggelar berbagai acara dan hiburan bagi masyarakat setempat.",
        "Bukit Bintang tak hanya bisa ditemukan di Yogyakarta, tetapi juga di beberapa lokasi lain, termasuk salah satunya Banyumas. Sesuai namanya, tempat wisata ini menyuguhkan pemandangan langit, khususnya ketika malam tiba. Lokasinya ada di Pangeran Limboro, Dusun III Berubahan, Kemutug Lor, Baturraden, Kabupaten Banyumas, Jawa Tengah.",
        "Kampung Pelangi yang beralamat di Jalan Jendral Soedirman Nomor 383, Brubahan, Purwanegara, Purwokerto Utara, Banyumas, Jawa Tengah juga cocok menjadi pilihan wisata malam Purwokerto. Selain karena bisa diakses selama 24 jam, tempat ini memliki banyak spot selfie dengan latar belakang bangunan warna-warni.  Pada malam hari, lampu dan lampion yang menghiasi sudut-sudutnya menambah kesan meriah."
    )

    // foto untuk tempat wisata
    private val photoTempatWisata = intArrayOf(
        R.drawable.kebun_raya_baturraden,
        R.drawable.new_small_world,
        R.drawable.the_village_purwokerto,
        R.drawable.baturraden_adventure_forest,
        R.drawable.telaga_sunyi,
        R.drawable.taman_balai_kemambang,
        R.drawable.bukit_agaran,
        R.drawable.bukit_tranggulasih,
        R.drawable.curug_kembar_ketenger,
        R.drawable.wana_wisata_baturraden,
        R.drawable.pancuran_pitu,
        R.drawable.curug_gede,
        R.drawable.andhang_pangrenan,
        R.drawable.bukit_bintang_baturraden,
        R.drawable.kampung_pelangi
    )

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in namaTempatWisata.indices) {
                val wisata = Wisata()
                wisata.tempatWisata = namaTempatWisata[position]
                wisata.detailWisata = descripsiTempatWisata[position]
                wisata.photoWisata = photoTempatWisata[position]
                list.add(wisata)
            }
            return list
        }
}