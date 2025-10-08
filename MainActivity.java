package com.rt.td2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private EditText editTitre;
    private Button btnAdd;
    private ListView listView;
    private ArrayList<String> listFilms;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTitre = findViewById(R.id.editTitre);
        btnAdd = findViewById(R.id.btnAdd);
        listView = findViewById(R.id.listView);

        listFilms = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listFilms);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    public void button (View v) {
        String titre = editTitre.getText().toString().trim();
        if(!titre.isEmpty()) {
            listFilms.add(titre);
            adapter.notifyDataSetChanged();
            editTitre.setText("");
            Toast.makeText(MainActivity.this, "Ajouté :" + titre, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Le champ est vide", Toast.LENGTH_SHORT).show();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View v, int pos, long id) {
        String itemText = listFilms.get(pos);
        Toast.makeText(MainActivity.this, itemText + " est à la position " + (pos+1), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("titreFilm", pos);
        startActivity(i);
    }

}