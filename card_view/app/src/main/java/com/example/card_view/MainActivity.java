package com.example.card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<CardData> data = fill_with_data();
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        CardAdapter rva = new CardAdapter(data,getApplication());
        rv.setAdapter(rva);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
    public List<CardData> fill_with_data(){
        List<CardData> data = new ArrayList<>();
        data.add(new CardData("Choi Hyunsuk","Leader, Rapper, Dancer", "Choi Hyun Suk adalah leader dan anggota tertua di TREASURE. Ia lahir pada 21 April 1999. Selain menjadi leader, ia adalah seorang rapper dan dancer. Choi Hyun Suk adalah anggota ketujuh yang diperkenalkan di line up debut TREASURE.",R.mipmap.hyunsuk));
        data.add(new CardData("Park Jihoon","Leader, Vocal, Dancer", "Jihoon lahir pada tanggal 14 Maret 2000 di Busan, Korea Selatan dan memiliki nama asli Park Jihoon. Posisinya dalam grup adalah leader, vocal, dan dance. Ia bergabung dengan YG Entertainment pada tahun 2016.",R.mipmap.jihoo));
        data.add(new CardData("Yoshi","Rapper", "Yoshi lahir pada tanggal 15 Mei 2000 di Kobe, Jepang dan memiliki nama asli Kanemoto Yoshinori. Yoshi mempunyai motto hidup ‘Let’s live together with music’. Jika ia sudah bertekad melakukan sesuatu, ia akan memastikannya sampai selesai.Posisinya dalam grup adalah rapper.",R.mipmap.yoshi));
        data.add(new CardData("Kim Junkyu","Vocal", "Junkyu lahir pada tanggal 9 September 2000 dan memiliki nama asli Kim Junkyu. Junkyu pernah mengikuti ajang survival MIXNINE dan mendapat peringkat 35. Ia juga merupakan mantan model cilik. Posisinya dalam grup adalah vocal dan mood maker.",R.mipmap.jukyu));
        data.add(new CardData("Mashiho","Vocal, Dancer", "Mashiho lahir pada tanggal 25 Maret 2001 di Jepang dan memiliki nama asli Takata Mashiho. Nama panggilannya adalah Mamoming, Meshi, Shiho, dan Mashi.Posisinya dalam grup adalah vocal dan dance.",R.mipmap.mashiho));
        data.add(new CardData("Jaehyuk","Vocal, Dancer", "Yoon Jaehyuk lahir pada tanggal 23 Juli 2001. a memiliki image dan nama panggilan 'Chow Chow' yang suka berada di sekitar manusia. Pesonanya adalah seluruh wajah, dan cara berjalan. Posisinya dalam grup adalah vocal, dance, dan pureness.",R.mipmap.jaehyuk));
        data.add(new CardData("Asahi","Vocal", "Asahi lahir pada tanggal 20 Agustus 2001 di Jepang dan memiliki nama asli Hamada Asahi. Asahi mempunyai nama panggilan robot karena sifatnya yang pendiam dan kaku, ia juga memakai kostum robot pada video Going Crazy di youtube. Posisinya dalam grup adalah vocal.",R.mipmap.asahi));
        data.add(new CardData("Bang Yedam","Main Vocal", "Bang Yedam lahir pada tanggal 7 Mei 2002 di Seoul, Korea Selatan. Posisinya dalam grup adalah vocal. Yedam sudah lebih dulu merilis solo single digitalnya WAYO pada tanggal 5 Juni 2020. Ia merupakan runner up di Kpop Star 2, dan pernah berkolaborasi dengan Taeyang BIGBANG membawakan lagu Bad Boy.",R.mipmap.yedam));
        data.add(new CardData("Kim Doyung","Vocal, Dancer", "Doyoung lahir pada tanggal 4 Desember 2003 di Seoul, Korea Selatan dan memiliki nama asli Kim Doyoung. Ia mempunyai nama panggilan Dosooni dan Kim Dobby. Ia menggambarkan aurora sebagai kepribadiannya, karena aurora sangat indah dan penuh warna. Posisinya dalam grup adalah dance dan vocal.",R.mipmap.doyung));
        data.add(new CardData("Haruto","Rapper", "Haruto lahir pada tanggal 5 April 2004 di Fukoka, Jepang dan memiliki nama asli Watanabe Haruto. Pesonanya adalah tubuhnya yang tinggi. Ia juga dijuluki sebagai 'Face Genius' karena wajahnya yang tampan. Posisinya dalam grup adalah rapper.",R.mipmap.haruto));
        data.add(new CardData("Park Jeongwoo","Vokal", "Park Jeongwoo lahir pada tanggal 28 Desember 2004 di Iksan, Korea Selatan. Ia memiliki kepribadian seperti anak anjing karena sifatnya yang selalu ingin tahu dan punya banyak minat. Nama panggilannya adalah Choco Jeong. Posisinya dalam grup adalah vocal dan mood maker.",R.mipmap.jeongwoo));
        data.add(new CardData("Junghwan","Vocal, Dancer, Maknae", "So Junghwan lahir pada tanggal 18 Februari 2005. Nama panggilannya adalah Super King Cow Baby. Ia menggambarkan dirinya sebagai balon, karena menurutnya balon memiliki warna yang cerah sama seperti kepribadiannya. Posisinya dalam grup adalah dance dan ia merupakan member termuda Treasure.",R.mipmap.junghwan));

        return data;
    }
}