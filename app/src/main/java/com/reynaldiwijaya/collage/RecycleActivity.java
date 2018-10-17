package com.reynaldiwijaya.collage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String [] namaKuliahIT, namaKuliahKedokteran, namaKuliahTeknik, namaKuliahBisnis, detailKuliahIT,detailKuliahKedokteran,detailKuliahTeknik,detailKuliahBisnis;
    int[] gambarKuliahIT,gambarKuliahKedokteran,gambarKuliahTeknik, gambarKuliahBisnis ;

    Adapter adapterKuliah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaKuliahIT = getResources().getStringArray(R.array.nama_kuliah_it);
        namaKuliahKedokteran = getResources().getStringArray(R.array.nama_kuliah_kedokteran);
        namaKuliahTeknik = getResources().getStringArray(R.array.nama_kuliah_teknik);
        namaKuliahBisnis = getResources().getStringArray(R.array.nama_kuliah_bisnis);

        detailKuliahIT = getResources().getStringArray(R.array.detail_kuliah_it);
        detailKuliahKedokteran = getResources().getStringArray(R.array.detail_kuliah_kedokteran);
        detailKuliahTeknik = getResources().getStringArray(R.array.detail_kuliah_teknik);
        detailKuliahBisnis = getResources().getStringArray(R.array.detail_kuliah_bisnis);

        gambarKuliahIT = new int[]{R.drawable.itb,R.drawable.ui, R.drawable.its, R.drawable.ugm,R.drawable.binus};
        gambarKuliahKedokteran = new int[]{R.drawable.ui,R.drawable.unpad, R.drawable.ugm, R.drawable.unair, R.drawable.undip};
        gambarKuliahTeknik = new int[]{R.drawable.itb, R.drawable.ugm, R.drawable.ui, R.drawable.its, R.drawable.undip};
        gambarKuliahBisnis = new int[]{R.drawable.ui, R.drawable.itb, R.drawable.ipmi,R.drawable.ugm, R.drawable.unair};

        String tanda = getIntent().getStringExtra("tanda");

        if (tanda.equals("it")){
            adapterKuliah = new Adapter(RecycleActivity.this, gambarKuliahIT,namaKuliahIT,detailKuliahIT);
        }else if (tanda.equals("kedokteran")){
            adapterKuliah = new Adapter(RecycleActivity.this, gambarKuliahKedokteran, namaKuliahKedokteran, detailKuliahKedokteran);
        }else if(tanda.equals("teknik")){
            adapterKuliah = new Adapter(RecycleActivity.this, gambarKuliahTeknik, namaKuliahTeknik, detailKuliahTeknik);
        }else{
            adapterKuliah = new Adapter(RecycleActivity.this, gambarKuliahBisnis, namaKuliahBisnis,detailKuliahBisnis);
        }

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecycleView.setAdapter(adapterKuliah);
    }
}
