package com.reynaldiwijaya.collage;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.VieHolder> {
    Context context;
    int[] gambarKuliah;
    String[] namaKuliah, detailKuliah;

    public Adapter(Context context, int[] gambar, String[] namaKuliah, String[] detailKuliah) {
        this.context = context;
        this.gambarKuliah = gambar;
        this.namaKuliah = namaKuliah;
        this.detailKuliah = detailKuliah;
    }

    @NonNull
    @Override
    public Adapter.VieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kuliah_indonesia, viewGroup,false);
        return new VieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.VieHolder vieHolder, final int i) {
        vieHolder.txtNama.setText(namaKuliah[i]);
        Glide.with(context).load(gambarKuliah[i]).into(vieHolder.imgLogo);

        vieHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailKuliahIndonesiaActivity.class);
                pindah.putExtra("nk", namaKuliah[i]);
                pindah.putExtra("dk", detailKuliah[i]);
                pindah.putExtra("gk", gambarKuliah[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarKuliah.length;
    }

    public class VieHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;

        public VieHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTittle);
        }
    }
}
