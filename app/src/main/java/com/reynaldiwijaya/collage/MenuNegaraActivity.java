package com.reynaldiwijaya.collage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_negara);
    }

    public void btnIndonesia(View view) {
        Intent pindah = new Intent(this, IndonesiaActivity.class);
        startActivity(pindah);
    }
}
