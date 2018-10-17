package com.reynaldiwijaya.collage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStart)
    public void onViewClicked() {
        Intent pindah = new Intent(MainActivity.this,MenuNegaraActivity.class);
        startActivity(pindah);
    }

    public void btnStart(View view) {
        Intent pindah = new Intent(this,MenuNegaraActivity.class);
        startActivity(pindah);
    }
}
