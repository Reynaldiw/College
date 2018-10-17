package com.reynaldiwijaya.collage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailKuliahIndonesiaActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitleKuliah)
    TextView txtTitleKuliah;
    @BindView(R.id.txtDetailKuliah)
    TextView txtDetailKuliah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliah_indonesia);
        ButterKnife.bind(this);

        txtTitleKuliah.setText(getIntent().getStringExtra("nk"));
        txtDetailKuliah.setText(getIntent().getStringExtra("dk"));
        Glide.with(this).load(getIntent().getIntExtra("gk",0)).into(imgLogo);
    }
}
