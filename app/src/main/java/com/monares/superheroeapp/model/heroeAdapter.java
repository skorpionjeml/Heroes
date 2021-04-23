package com.monares.superheroeapp.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.monares.superheroeapp.R;

import java.util.ArrayList;

public class heroeAdapter extends RecyclerView.Adapter<heroeAdapter.ViewholderDatos> {

    ArrayList<heroe> ListaHeroe;

    public heroeAdapter(ArrayList<heroe> heroes){

        ListaHeroe= heroes;

    }



    @NonNull
    @Override
    public heroeAdapter.ViewholderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_heroe,null,false);


        return new ViewholderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull heroeAdapter.ViewholderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ListaHeroe.size();
    }

    public class ViewholderDatos extends RecyclerView.ViewHolder {
        public ViewholderDatos(@NonNull View itemView) {
            super(itemView);
        }
    }
}
