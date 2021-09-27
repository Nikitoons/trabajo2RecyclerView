package com.example.tarearecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Usuario> listaUsuarios;

    private RecyclerView rvUsuarios;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUsuarios = findViewById(R.id.rvlista);

        listaUsuarios = new ArrayList<Usuario>();

        listaUsuarios.add(new Usuario("Dipper Pines", "Es el hermano mellizo menor de Mabel Pines, y es un chico adolescente curioso, inteligente e intenso de 13 años.", R.drawable.dipper));
        listaUsuarios.add(new Usuario("Mabel Pines", "es la hermana melliza mayor de Dipper Pines. Energética y optimista, Mabel saca lo mejor de cada situación con una gran sonrisa de boba mientras que molesta a Dipper.", R.drawable.mabel));
        listaUsuarios.add(new Usuario("Jesús Alzamirano Ramírez", "Soos (aka Jesús) es el hombre infantil encantador que trabaja en la tienda de regalos de la Cabaña del Misterio.", R.drawable.soos));
        listaUsuarios.add(new Usuario("Stanley Pines", "más conocido como Tío Stan en Latinoamérica y España, es el malicioso tío abuelo de Mabel y Dipper. Dirige la Cabaña del Misterio, una trampa para turistas llena de rarezas cuestionables.", R.drawable.stanley));


        rvUsuarios.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rvUsuarios.setLayoutManager(lManager);

        adapter = new AdapterUsuario(listaUsuarios);
        rvUsuarios.setAdapter(adapter);

    }
}