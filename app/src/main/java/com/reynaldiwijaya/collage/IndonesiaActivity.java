package com.reynaldiwijaya.collage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IndonesiaActivity extends AppCompatActivity {

    @BindView(R.id.txtPilihJurusan)
    TextView txtPilihJurusan;
    @BindView(R.id.btnIT)
    Button btnIT;
    @BindView(R.id.btnKedokteran)
    Button btnKedokteran;
    @BindView(R.id.btnTeknik)
    Button btnTeknik;
    @BindView(R.id.btnBisnis)
    Button btnBisnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesia);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btnIT, R.id.btnKedokteran, R.id.btnTeknik, R.id.btnBisnis})
    public void onViewClicked(View view) {
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnIT:
                pindah = new Intent(IndonesiaActivity.this,RecycleActivity.class);
                pindah.putExtra("tanda","it");
                startActivity(pindah);
                break;
            case R.id.btnKedokteran:
                pindah = new Intent(IndonesiaActivity.this,RecycleActivity.class);
                pindah.putExtra("tanda","kedokteran");
                startActivity(pindah);
                break;
            case R.id.btnTeknik:
                pindah = new Intent(IndonesiaActivity.this,RecycleActivity.class);
                pindah.putExtra("tanda","teknik");
                startActivity(pindah);
                break;
            case R.id.btnBisnis:
                pindah = new Intent(this, RecycleActivity.class);
                pindah.putExtra("tanda","bisnis");
                startActivity(pindah);
                break;
        }
    }
}
