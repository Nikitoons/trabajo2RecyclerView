package com.example.tarearecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {

    private List<Usuario> listaUsuarios;

    public AdapterUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }


    public UsuarioViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.ivImagen.setImageResource(listaUsuarios.get(i).getImgResource());
        usuarioViewHolder.tvtitulo.setText(listaUsuarios.get(i).getTitulo());
        usuarioViewHolder.tvdescripcion.setText(listaUsuarios.get(i).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImagen;
        TextView tvtitulo, tvdescripcion;

        public UsuarioViewHolder(View itemView) {
            super(itemView);

            ivImagen = itemView.findViewById(R.id.imagen);
            tvtitulo = itemView.findViewById(R.id.tvnombre);
            tvdescripcion = itemView.findViewById(R.id.tvDescripcion);

        }
    }
}